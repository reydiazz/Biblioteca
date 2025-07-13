package Controlador;

import Commando.CerrarComando;
import Commando.Comando;
import Commando.MinimizarCommando;
import Commando.RegresarCommando;
import Modelo.Ventana;
import Fabrica.AvisoFabrica;
import Fachada.EstiloFachada;
import Fachada.ValidacionesUIFachada;
import Modelo.Conexion;
import Modelo.DAO.RegistroLibrosDAO;
import Modelo.Libro;
import Vista.RegistroLibros;
import java.awt.Component;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Set;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControladorRegistroLibros {

    private final RegistroLibros ventanaRegistroLibro;
    private RegistroLibrosDAO dao;

    public ControladorRegistroLibros(RegistroLibros ventanaRegistroLibro) {
        this.ventanaRegistroLibro = ventanaRegistroLibro;
        dao = new RegistroLibrosDAO(Conexion.getConexion());
    }

    public void iniciarMenuRegistroLibros() {
        Comando cmdMinimizarVentana = new MinimizarCommando(new Ventana(ventanaRegistroLibro));
        Comando cmdCerrarVentana = new CerrarComando(new Ventana(ventanaRegistroLibro));
        Comando cmdRegresarComando = new RegresarCommando(new Ventana(ventanaRegistroLibro));

        JTextField[] txf = {ventanaRegistroLibro.txf_codigo, ventanaRegistroLibro.txf_tituloLibro, ventanaRegistroLibro.txf_autor, ventanaRegistroLibro.txf_genero, ventanaRegistroLibro.txf_copias, ventanaRegistroLibro.txf_edicion};

        EstiloFachada.aplicarEstiloGlobal(ventanaRegistroLibro.getContentPane());
        EstiloFachada.aplicarFuncionesToolBar(ventanaRegistroLibro, ventanaRegistroLibro.pn_toolbar);
        EstiloFachada.filtrarTabla(ventanaRegistroLibro.tbl_tablaLibro, ventanaRegistroLibro.txf_buscar);

        ventanaRegistroLibro.setVisible(true);

        actualizarRegistros(dao.recojerLibros());

        ventanaRegistroLibro.tbl_tablaLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ValidacionesUIFachada.selecionRegistro(txf, ventanaRegistroLibro.tbl_tablaLibro);
            }
        });

        ventanaRegistroLibro.btn_agregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (ValidacionesUIFachada.verificarCodigoDuplicado(dao.recojerLibros(), ventanaRegistroLibro.txf_codigo.getText())) {
                    Set<Component> excluidos = Set.of(ventanaRegistroLibro.txf_buscar);
                    if (ValidacionesUIFachada.comprobarCasillas(ventanaRegistroLibro.getContentPane(), excluidos)) {
                        if (dao.registroLibro(verificarFormulario())) {
                            actualizarRegistros(dao.recojerLibros());
                            AvisoFabrica.crearAviso(ventanaRegistroLibro, "Dato agregado correctamente.").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                        } else if (verificarFormulario() != null) {
                            AvisoFabrica.crearAviso(ventanaRegistroLibro, "Error al ingresar el dato.").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                        } else if (verificarFormulario() == null) {
                            AvisoFabrica.crearAviso(ventanaRegistroLibro, "Verifique el formulario.").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                        }
                    } else {
                        AvisoFabrica.crearAviso(ventanaRegistroLibro, "Complete el formulario.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                    }
                } else {
                    AvisoFabrica.crearAviso(ventanaRegistroLibro, "Codigo ya existente.").mostrar();
                    ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                }
            }
        });

        ventanaRegistroLibro.btn_modificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = ventanaRegistroLibro.tbl_tablaLibro.getSelectedRow();
                if (ValidacionesUIFachada.comprobarSeleccion(fila)) {
                    Set<Component> excluidos = Set.of(ventanaRegistroLibro.txf_buscar);
                    if (ValidacionesUIFachada.comprobarCasillas(ventanaRegistroLibro.getContentPane(), excluidos)) {
                        String codigoAntiguo = String.valueOf(ventanaRegistroLibro.tbl_tablaLibro.getValueAt(fila, 0));
                        if (dao.modificarLibro(verificarFormulario(), codigoAntiguo)) {
                            actualizarRegistros(dao.recojerLibros());
                            AvisoFabrica.crearAviso(ventanaRegistroLibro, "Dato modificado correctamente.").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                        }
                    } else {
                        AvisoFabrica.crearAviso(ventanaRegistroLibro, "Complete el formulario.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                    }
                } else {
                    AvisoFabrica.crearAviso(ventanaRegistroLibro, "Seleccione un registro.").mostrar();
                    ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                }
            }
        });

        ventanaRegistroLibro.btn_eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = ventanaRegistroLibro.tbl_tablaLibro.getSelectedRow();
                if (ValidacionesUIFachada.comprobarSeleccion(fila)) {
                    if (dao.eliminarLibro((String) ventanaRegistroLibro.tbl_tablaLibro.getValueAt(fila, 0))) {
                        actualizarRegistros(dao.recojerLibros());
                        AvisoFabrica.crearAviso(ventanaRegistroLibro, "Dato eliminado correctamente.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                    } else {
                        AvisoFabrica.crearAviso(ventanaRegistroLibro, "Libro en uso.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                    }
                } else {
                    AvisoFabrica.crearAviso(ventanaRegistroLibro, "Seleccione un registro.").mostrar();
                    ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
                }
            }
        });

        ventanaRegistroLibro.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdRegresarComando.execute();
            }
        });

        ventanaRegistroLibro.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdCerrarVentana.execute();
            }
        });

        ventanaRegistroLibro.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdMinimizarVentana.execute();
            }
        });
    }

    public Libro verificarFormulario() {
        try {
            String codigo = ventanaRegistroLibro.txf_codigo.getText().trim();
            String titulo = ventanaRegistroLibro.txf_tituloLibro.getText().trim();
            String autor = ventanaRegistroLibro.txf_autor.getText().trim();
            String genero = ventanaRegistroLibro.txf_genero.getText().trim();
            int copias = Integer.parseInt(ventanaRegistroLibro.txf_copias.getText().trim());
            String edicion = ventanaRegistroLibro.txf_edicion.getText().trim();

            Libro libro = new Libro(codigo, titulo, autor, genero, copias, edicion);
            ValidacionesUIFachada.resetearFormulario(ventanaRegistroLibro.getContentPane());
            return libro;

        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void actualizarRegistros(LinkedList<Libro> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaRegistroLibro.tbl_tablaLibro.getModel();
        String datos[] = new String[6];
        modelo.setRowCount(0);

        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getCodigoLibro();
            datos[1] = lista.get(i).getTitulo();
            datos[2] = lista.get(i).getAutor();
            datos[3] = lista.get(i).getGenero();
            datos[4] = String.valueOf(lista.get(i).getNumeroCopias());
            datos[5] = lista.get(i).getEdicion();

            modelo.addRow(datos);
        }
    }

}
