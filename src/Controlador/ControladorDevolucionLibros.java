package Controlador;

import Command.CerrarCommand;
import Command.MinimizarCommand;
import Factory.AvisoFactory;
import Modelo.Conexion;
import Modelo.DAO.DevolucionLibrosDAO;
import Modelo.Personalizacion;
import Modelo.Prestamo;
import Vista.Aviso;
import Vista.DevolucionLibros;
import Vista.Login;
import Vista.MenuPrincipal;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
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

        JButton[] btns = {ventanaDevolucionLibros.btn_devolverLibro};
        JTextField[] txf = {ventanaDevolucionLibros.txf_buscar};

        new Personalizacion(ventanaDevolucionLibros, ventanaDevolucionLibros.pn_toolbar, txf, btns, ventanaDevolucionLibros.tbl_tablaDevolucion);

        ventanaDevolucionLibros.setVisible(true);
        actualizarRegistros(pa.recojerPrestamos());

        ventanaDevolucionLibros.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaDevolucionLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(ventanaDevolucionLibros.tbl_tablaDevolucion.getModel());
        ventanaDevolucionLibros.tbl_tablaDevolucion.setRowSorter(sorter);

        ventanaDevolucionLibros.txf_buscar.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = ventanaDevolucionLibros.txf_buscar.getText();
                if (texto.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 1));
                }
            }
        });

        ventanaDevolucionLibros.btn_devolverLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!comprobarSeleccion()) {
                    return;
                }
                int fila = ventanaDevolucionLibros.tbl_tablaDevolucion.getSelectedRow();
                String codigoLibro = String.valueOf(
                        ventanaDevolucionLibros.tbl_tablaDevolucion.getValueAt(fila, 0));
                String codigoAlumno = String.valueOf(
                        ventanaDevolucionLibros.tbl_tablaDevolucion.getValueAt(fila, 2));
                boolean actualizado = pa.actualizarDevolverLibro(codigoAlumno, codigoLibro);
                boolean eliminado = actualizado && pa.eliminarRegistroDevolucionLibro(codigoAlumno, codigoLibro);
                if (actualizado && eliminado) {
                    actualizarRegistros(pa.recojerPrestamos());
                    AvisoFactory.crearAviso(ventanaDevolucionLibros, true, "DEVUELTO").setVisible(true);
                } else {
                    AvisoFactory.crearAviso(ventanaDevolucionLibros, true, "NO_DEVUELTO").setVisible(true);
                }
            }
        });

        ventanaDevolucionLibros.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new CerrarCommand(ventanaDevolucionLibros).execute();
            }
        });

        ventanaDevolucionLibros.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MinimizarCommand(ventanaDevolucionLibros).execute();
            }
        });
    }

    public void actualizarRegistros(LinkedList<Prestamo> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaDevolucionLibros.tbl_tablaDevolucion.getModel();
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
        int filaElgda = ventanaDevolucionLibros.tbl_tablaDevolucion.getSelectedRow();
        if (filaElgda >= 0) {
            return true;
        } else {
            Aviso a = AvisoFactory.crearAviso(ventanaDevolucionLibros, true, "SELECCIONE");
            a.setVisible(true);
            return false;
        }
    }
}
