package Controlador;

import Commando.CerrarComando;
import Commando.Comando;
import Commando.MinimizarCommando;
import Commando.RegresarCommando;
import Modelo.Ventana;
import Fabrica.AvisoFabrica;
import Fachada.EstiloFachada;
import Fachada.ValidacionesUIFachada;
import Modelo.Alumno;
import Modelo.Conexion;
import Modelo.DAO.RegistrarAlumnoDAO;
import Vista.RegistrarAlumno;
import java.awt.Component;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Set;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControladorRegistrarAlumno {

    private final RegistrarAlumno ventanaRegistrarAlumno;
    private RegistrarAlumnoDAO dao;

    public ControladorRegistrarAlumno(RegistrarAlumno ventanaRegistrarAlumno) {
        this.ventanaRegistrarAlumno = ventanaRegistrarAlumno;
        dao = new RegistrarAlumnoDAO(Conexion.getConexion());
    }

    public void iniciarMenuRegistrarAlumno() {
        Comando cmdMinimizarVentana = new MinimizarCommando(new Ventana(ventanaRegistrarAlumno));
        Comando cmdCerrarVentana = new CerrarComando(new Ventana(ventanaRegistrarAlumno));
        Comando cmdRegresarComando = new RegresarCommando(new Ventana(ventanaRegistrarAlumno));

        JTextField[] txf = {ventanaRegistrarAlumno.txf_codigo, ventanaRegistrarAlumno.txf_nombre, ventanaRegistrarAlumno.txf_apellido, ventanaRegistrarAlumno.txf_nivel, ventanaRegistrarAlumno.txf_grado, ventanaRegistrarAlumno.txf_seccion};

        EstiloFachada.aplicarEstiloGlobal(ventanaRegistrarAlumno.getContentPane());
        EstiloFachada.aplicarFuncionesToolBar(ventanaRegistrarAlumno, ventanaRegistrarAlumno.pn_toolbar);
        EstiloFachada.filtrarTabla(ventanaRegistrarAlumno.tbl_tablaAlumnos, ventanaRegistrarAlumno.txf_buscar);

        ventanaRegistrarAlumno.setVisible(true);

        actualizarRegistros(dao.recojerAlumnos());

        ventanaRegistrarAlumno.tbl_tablaAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ValidacionesUIFachada.selecionRegistro(txf, ventanaRegistrarAlumno.tbl_tablaAlumnos);
            }
        });

        ventanaRegistrarAlumno.btn_registrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (ValidacionesUIFachada.verificarCodigoDuplicado(dao.recojerAlumnos(), ventanaRegistrarAlumno.txf_codigo.getText())) {
                    Set<Component> excluidos = Set.of(ventanaRegistrarAlumno.txf_buscar);
                    if (ValidacionesUIFachada.comprobarCasillas(ventanaRegistrarAlumno.getContentPane(), excluidos)) {
                        if (dao.registrarAlumno(verificarFormulario())) {
                            actualizarRegistros(dao.recojerAlumnos());
                            AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Acceso permitido").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                        } else if (verificarFormulario() != null) {
                            AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Error al ingresar el dato.").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                        } else if (verificarFormulario() == null) {
                            AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Verifique el formulario.").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                        }
                    } else {
                        AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Complete el formulario.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                    }
                } else {
                    System.out.println(ventanaRegistrarAlumno.txf_codigo.getText());
                    AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Codigo ya existente.").mostrar();
                    ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                }

            }
        });

        ventanaRegistrarAlumno.btn_modificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = ventanaRegistrarAlumno.tbl_tablaAlumnos.getSelectedRow();
                if (ValidacionesUIFachada.comprobarSeleccion(fila)) {
                    Set<Component> excluidos = Set.of(ventanaRegistrarAlumno.txf_buscar);
                    if (ValidacionesUIFachada.comprobarCasillas(ventanaRegistrarAlumno.getContentPane(), excluidos)) {
                        String codigoAntiguo = String.valueOf(ventanaRegistrarAlumno.tbl_tablaAlumnos.getValueAt(fila, 0));
                        if (dao.modificarAlumno(verificarFormulario(), codigoAntiguo)) {
                            actualizarRegistros(dao.recojerAlumnos());
                            AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Dato modificado correctamente.").mostrar();
                            ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                        }
                    } else {
                        AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Complete el formulario.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                    }
                } else {
                    AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Seleccione un registro.").mostrar();
                    ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                }
            }
        });

        ventanaRegistrarAlumno.btn_eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = ventanaRegistrarAlumno.tbl_tablaAlumnos.getSelectedRow();
                if (ValidacionesUIFachada.comprobarSeleccion(fila)) {
                    if (dao.eliminarAlumno((String) ventanaRegistrarAlumno.tbl_tablaAlumnos.getValueAt(ventanaRegistrarAlumno.tbl_tablaAlumnos.getSelectedRow(), 0))) {
                        actualizarRegistros(dao.recojerAlumnos());
                        AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Dato eliminado correctamente.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                    } else {
                        AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Alumno en uso.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                    }
                } else {
                    AvisoFabrica.crearAviso(ventanaRegistrarAlumno, "Seleccione un registro.").mostrar();
                    ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
                }
            }
        });

        ventanaRegistrarAlumno.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdRegresarComando.execute();
            }
        });

        ventanaRegistrarAlumno.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdCerrarVentana.execute();
            }
        });

        ventanaRegistrarAlumno.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdMinimizarVentana.execute();
            }
        });
    }

    public Alumno verificarFormulario() {
        try {
            String codigo = ventanaRegistrarAlumno.txf_codigo.getText().trim();
            String nombre = ventanaRegistrarAlumno.txf_nombre.getText().trim();
            String apellido = ventanaRegistrarAlumno.txf_apellido.getText().trim();
            String nivel = ventanaRegistrarAlumno.txf_nivel.getText().trim();
            int grado = Integer.parseInt(ventanaRegistrarAlumno.txf_grado.getText().trim());
            String seccionText = ventanaRegistrarAlumno.txf_seccion.getText().trim();
            char seccion = seccionText.isEmpty() ? ' ' : seccionText.charAt(0);

            Alumno alumno = new Alumno(codigo, nombre, apellido, nivel, grado, seccion);
            ValidacionesUIFachada.resetearFormulario(ventanaRegistrarAlumno.getContentPane());
            return alumno;

        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void actualizarRegistros(LinkedList<Alumno> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaRegistrarAlumno.tbl_tablaAlumnos.getModel();
        String datos[] = new String[6];
        modelo.setRowCount(0);

        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getCodigoAlumno();
            datos[1] = lista.get(i).getNombre();
            datos[2] = lista.get(i).getApellidoPaterno();
            datos[3] = lista.get(i).getNivel();
            datos[4] = String.valueOf(lista.get(i).getGrado());
            datos[5] = String.valueOf(lista.get(i).getSeccion());

            modelo.addRow(datos);
        }
    }

}
