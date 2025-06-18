package Controlador;

import Modelo.Conexion;
import Modelo.DAO.DevolucionLibrosDAO;
import Modelo.Prestamo;
import Vista.Aviso;
import Vista.DevolucionLibros;
import Vista.Login;
import Vista.MenuPrincipal;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.RowFilter;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ControladorDevolucionLibros {

    private final DevolucionLibros ventanaDevolucionLibros;
    private DevolucionLibrosDAO pa;

    public ControladorDevolucionLibros(DevolucionLibros ventanaDevolucionLibros) {
        this.ventanaDevolucionLibros = ventanaDevolucionLibros;
        pa = new DevolucionLibrosDAO(Conexion.getConexion());
    }

    public void iniciarMenuDevolucionLibros() {

        ventanaDevolucionLibros.setVisible(true);
        actualizarRegistros(pa.recojerPrestamos());

        ventanaDevolucionLibros.btnRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaDevolucionLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(ventanaDevolucionLibros.tblPrestamos.getModel());
        ventanaDevolucionLibros.tblPrestamos.setRowSorter(sorter);

        ventanaDevolucionLibros.txtCodigoAlumnoBuscar.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = ventanaDevolucionLibros.txtCodigoAlumnoBuscar.getText();
                if (texto.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 1));
                }
            }
        });

        ventanaDevolucionLibros.btnDevolverLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!comprobarSeleccion()) {
                    return;
                }
                int fila = ventanaDevolucionLibros.tblPrestamos.getSelectedRow();
                String codigoLibro = String.valueOf(
                        ventanaDevolucionLibros.tblPrestamos.getValueAt(fila, 0));
                String codigoAlumno = String.valueOf(
                        ventanaDevolucionLibros.tblPrestamos.getValueAt(fila, 2));
                boolean actualizado = pa.actualizarDevolverLibro(codigoAlumno, codigoLibro);
                boolean eliminado = actualizado && pa.eliminarRegistroDevolucionLibro(codigoAlumno, codigoLibro);
                if (actualizado && eliminado) {
                    actualizarRegistros(pa.recojerPrestamos());
                    new Aviso(ventanaDevolucionLibros, true, "Libro devuelto correctamente").setVisible(true);
                } else {
                    new Aviso(ventanaDevolucionLibros, true, "No se pudo completar la devolución").setVisible(true);
                }
            }
        });

        ventanaDevolucionLibros.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.cerrarConexion();
                ventanaDevolucionLibros.dispose();
                ControladorLogin cl = new ControladorLogin(new Login());
                cl.iniciarLogin();
            }
        });
    }

    public void actualizarRegistros(LinkedList<Prestamo> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaDevolucionLibros.tblPrestamos.getModel();
        String datos[] = new String[5];
        modelo.setRowCount(0);

        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getCodigoLibro();
            datos[1] = lista.get(i).getNombreLibro();
            datos[2] = lista.get(i).getCodigoAlumno();
            datos[3] = lista.get(i).getNombreAlumno();
            datos[4] = String.valueOf(lista.get(i).getFechaDevolucion());

            modelo.addRow(datos);
        }
    }

    public boolean comprobarSeleccion() {
        int filaElgda = ventanaDevolucionLibros.tblPrestamos.getSelectedRow();
        if (filaElgda >= 0) {
            return true;
        } else {
            Aviso a = new Aviso(ventanaDevolucionLibros, true, "Seleccione un registro");
            a.setVisible(true);
            return false;
        }
    }
}
