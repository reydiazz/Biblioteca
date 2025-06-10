package Controlador;

import Modelo.Alumno;
import Modelo.Conexion;
import Modelo.DAO.RegistroLibrosDAO;
import Modelo.Libro;
import Vista.Aviso;
import Vista.MenuPrincipal;
import Vista.RegistroLibros;
import java.awt.event.*;
import java.util.LinkedList;
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
        JTextField[] txf = {ventanaRegistroLibro.txtCodigoLibro, ventanaRegistroLibro.txtTitulo, ventanaRegistroLibro.txtAutor, ventanaRegistroLibro.txtGenero, ventanaRegistroLibro.txtStock, ventanaRegistroLibro.txtEdicion};

        ventanaRegistroLibro.setVisible(true);

        actualizarRegistros(rldao.recojerLibros());

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(ventanaRegistroLibro.tblLibros.getModel());
        ventanaRegistroLibro.tblLibros.setRowSorter(sorter);

        ventanaRegistroLibro.txtBuscador.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = ventanaRegistroLibro.txtBuscador.getText();
                if (texto.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 1));
                }
            }
        });

        ventanaRegistroLibro.tblLibros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selecionRegistro(txf);
            }
        });

        ventanaRegistroLibro.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((verificarCodigoDuplicado(rldao.recojerLibros(), ventanaRegistroLibro.txtCodigoLibro.getText()))) {
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

        ventanaRegistroLibro.btnModificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    if (rldao.modificarLibro(new Libro(ventanaRegistroLibro.txtCodigoLibro.getText(), ventanaRegistroLibro.txtTitulo.getText(), ventanaRegistroLibro.txtAutor.getText(), ventanaRegistroLibro.txtGenero.getText(), Integer.parseInt(ventanaRegistroLibro.txtStock.getText()), ventanaRegistroLibro.txtEdicion.getText()), ventanaRegistroLibro.txtCodigoLibro.getText())) {
                        actualizarRegistros(rldao.recojerLibros());
                        Aviso a = new Aviso(ventanaRegistroLibro, true, "Dato modificado correctamente");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }
            }
        });

        ventanaRegistroLibro.btnEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    if (rldao.eliminarLibro((String) ventanaRegistroLibro.tblLibros.getValueAt(ventanaRegistroLibro.tblLibros.getSelectedRow(), 0))) {
                        actualizarRegistros(rldao.recojerLibros());
                        Aviso a = new Aviso(ventanaRegistroLibro, true, "Dato eliminado correctamente");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }
            }
        });

        ventanaRegistroLibro.btnRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaRegistroLibro.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }

    public boolean comprobarSeleccion() {
        int filaElgda = ventanaRegistroLibro.tblLibros.getSelectedRow();
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
            a = new Libro(ventanaRegistroLibro.txtCodigoLibro.getText(), ventanaRegistroLibro.txtTitulo.getText(), ventanaRegistroLibro.txtAutor.getText(), ventanaRegistroLibro.txtGenero.getText(), Integer.parseInt(ventanaRegistroLibro.txtStock.getText()), ventanaRegistroLibro.txtEdicion.getText());
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
        DefaultTableModel modelo = (DefaultTableModel) ventanaRegistroLibro.tblLibros.getModel();
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
        int filaElgda = ventanaRegistroLibro.tblLibros.getSelectedRow();
        if (filaElgda >= 0) {
            for (int i = 0; i < txf.length; i++) {
                txf[i].setText((String) ventanaRegistroLibro.tblLibros.getValueAt(filaElgda, i));
            }
        }
    }

    public void refrescarFormulario(JTextField[] txf) {
        for (int i = 0; i < txf.length; i++) {
            txf[i].setText("");
        }
    }

}
