package Controlador;

import Modelo.Conexion;
import Modelo.DAO.RegistroLibrosDAO;
import Modelo.Libro;
import Modelo.Personalizacion;
import Vista.Aviso;
import Vista.Login;
import Vista.MenuPrincipal;
import Vista.RegistroLibros;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ControladorRegistroLibros {

    private final RegistroLibros ventanaRegistroLibro;
    private RegistroLibrosDAO rldao;
    private Libro lib;

    public ControladorRegistroLibros(RegistroLibros ventanaRegistroLibro) {
        this.ventanaRegistroLibro = ventanaRegistroLibro;
        rldao = new RegistroLibrosDAO(Conexion.getConexion());
    }

    public void iniciarMenuRegistroLibros() {
        JTextField[] txf = {ventanaRegistroLibro.txf_codigo, ventanaRegistroLibro.txf_tituloLibro, ventanaRegistroLibro.txf_autor, ventanaRegistroLibro.txf_genero, ventanaRegistroLibro.txf_copias, ventanaRegistroLibro.txf_edicion};
        JTextField[] txfs = {ventanaRegistroLibro.txf_codigo, ventanaRegistroLibro.txf_tituloLibro, ventanaRegistroLibro.txf_autor, ventanaRegistroLibro.txf_genero, ventanaRegistroLibro.txf_copias, ventanaRegistroLibro.txf_edicion, ventanaRegistroLibro.txf_buscador};
        JButton[]btn = {ventanaRegistroLibro.btn_agregar,ventanaRegistroLibro.btn_eliminar,ventanaRegistroLibro.btn_modificar};
      
        new Personalizacion(ventanaRegistroLibro, ventanaRegistroLibro.pn_toolbar, txfs, btn, ventanaRegistroLibro.tbl_tablaLibro);
        ventanaRegistroLibro.setVisible(true);

        actualizarRegistros(rldao.recojerLibros());

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(ventanaRegistroLibro.tbl_tablaLibro.getModel());
        ventanaRegistroLibro.tbl_tablaLibro.setRowSorter(sorter);

        ventanaRegistroLibro.txf_buscador.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                filtrar();
            }

            public void removeUpdate(DocumentEvent e) {
                filtrar();
            }

            public void changedUpdate(DocumentEvent e) {
                filtrar();
            }

            private void filtrar() {
                String texto = ventanaRegistroLibro.txf_buscador.getText();
                if (texto.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 1));
                }
            }
        });

        ventanaRegistroLibro.tbl_tablaLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selecionRegistro(txf);
            }
        });

        ventanaRegistroLibro.btn_agregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((verificarCodigoDuplicado(rldao.recojerLibros(), ventanaRegistroLibro.txf_codigo.getText()))) {
                    if (comprobarCasillas(txf)) {
                        if (rldao.registroLibro(verificarFormulario(lib, txf))) {
                            actualizarRegistros(rldao.recojerLibros());
                            Aviso a = new Aviso(ventanaRegistroLibro, true, "Dato registrado correctamente");
                            a.setVisible(true);
                            refrescarFormulario(txf);
                        }
                    }
                }
            }
        });

        ventanaRegistroLibro.btn_modificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    if (rldao.modificarLibro(new Libro(ventanaRegistroLibro.txf_codigo.getText(), ventanaRegistroLibro.txf_tituloLibro.getText(), ventanaRegistroLibro.txf_autor.getText(), ventanaRegistroLibro.txf_genero.getText(), Integer.parseInt(ventanaRegistroLibro.txf_copias.getText()), ventanaRegistroLibro.txf_edicion.getText()), ventanaRegistroLibro.txf_codigo.getText())) {
                        actualizarRegistros(rldao.recojerLibros());
                        Aviso a = new Aviso(ventanaRegistroLibro, true, "Dato modificado correctamente");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }
            }
        });

        ventanaRegistroLibro.btn_eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    if (rldao.eliminarLibro((String) ventanaRegistroLibro.tbl_tablaLibro.getValueAt(ventanaRegistroLibro.tbl_tablaLibro.getSelectedRow(), 0))) {
                        actualizarRegistros(rldao.recojerLibros());
                        Aviso a = new Aviso(ventanaRegistroLibro, true, "Dato eliminado correctamente");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }
            }
        });

        ventanaRegistroLibro.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaRegistroLibro.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });

        ventanaRegistroLibro.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.cerrarConexion();
                ventanaRegistroLibro.dispose();
                ControladorLogin cl = new ControladorLogin(new Login());
                cl.iniciarLogin();
            }
        });

        ventanaRegistroLibro.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaRegistroLibro.setState(JFrame.ICONIFIED);
            }
        });
    }

    public boolean comprobarSeleccion() {
        int filaElgda = ventanaRegistroLibro.tbl_tablaLibro.getSelectedRow();
        if (filaElgda >= 0) {
            return true;
        } else {
            Aviso a = new Aviso(ventanaRegistroLibro, true, "Seleccione un registro");
            a.setVisible(true);
            return false;
        }
    }

    public Libro verificarFormulario(Libro a, JTextField[] txf) {
        try {
            a = new Libro(ventanaRegistroLibro.txf_codigo.getText(), ventanaRegistroLibro.txf_tituloLibro.getText(), ventanaRegistroLibro.txf_autor.getText(), ventanaRegistroLibro.txf_genero.getText(), Integer.parseInt(ventanaRegistroLibro.txf_copias.getText()), ventanaRegistroLibro.txf_edicion.getText());
            refrescarFormulario(txf);
            return a;
        } catch (NumberFormatException e) {
            if (a == null) {
                Aviso v = new Aviso(ventanaRegistroLibro, true, "Complete el formulario correctamente.");
                v.setVisible(true);
            }
            return a;
        }
    }

    public boolean comprobarCasillas(JTextField[] txf) {
        boolean acceso = true;
        int i = 0;
        while (acceso) {
            if (txf[i].getText().trim().isEmpty()) {
                Aviso a = new Aviso(ventanaRegistroLibro, true, "Complete los casilleros");
                a.setVisible(true);
                acceso = false;
            }
            if (txf.length - 1 <= i && acceso != false) {
                acceso = false;
            } else {
                i++;
            }
        }
        return txf.length - 1 == i;
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

    public boolean verificarCodigoDuplicado(LinkedList<Libro> lista, String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (codigo.equalsIgnoreCase(lista.get(i).getCodigoLibro())) {
                Aviso v = new Aviso(ventanaRegistroLibro, true, "Codigo ya existente");
                v.setVisible(true);
                return false;
            }
        }
        return true;
    }

    public void selecionRegistro(JTextField[] txf) {
        int filaElgda = ventanaRegistroLibro.tbl_tablaLibro.getSelectedRow();
        if (filaElgda >= 0) {
            for (int i = 0; i < txf.length; i++) {
                txf[i].setText((String) ventanaRegistroLibro.tbl_tablaLibro.getValueAt(filaElgda, i));
            }
        }
    }

    public void refrescarFormulario(JTextField[] txf) {
        for (int i = 0; i < txf.length; i++) {
            txf[i].setText("");
        }
    }

}
