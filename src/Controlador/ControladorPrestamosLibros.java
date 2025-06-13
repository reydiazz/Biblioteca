package Controlador;

import Modelo.Conexion;
import Modelo.DAO.PrestamoLibrosDAO;
import Modelo.Prestamo;
import Vista.Aviso;
import Vista.MenuPrincipal;
import Vista.PrestamosLibros;
import java.awt.event.*;
import javax.swing.JTextField;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorPrestamosLibros {

    private final PrestamosLibros ventanaPrestamosLibros;
    private PrestamoLibrosDAO pa;
    private Prestamo p;

    public ControladorPrestamosLibros(PrestamosLibros ventanaPrestamosLibros) {
        this.ventanaPrestamosLibros = ventanaPrestamosLibros;
        pa = new PrestamoLibrosDAO(Conexion.getConexion());
    }

    public void iniciarMenuPrestamosLibros() {
        
        

        JTextField[] txf = {ventanaPrestamosLibros.txtCodigoAlumnoPrestamo, ventanaPrestamosLibros.txtCodigoLibroPrestamo, ventanaPrestamosLibros.txtFechaDevolucion};

        ventanaPrestamosLibros.setVisible(true);

        actualizarRegistros(pa.recojerPrestamos());
        ventanaPrestamosLibros.btnPrestamoLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (comprobarCasillas(txf)) {
                    if (pa.registrarPrestamos(verificarFormulario(p, txf))) {
                        actualizarRegistros(pa.recojerPrestamos());
                        Aviso a = new Aviso(ventanaPrestamosLibros, true, "Dato registrado correctamente");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }

            }
        });

        ventanaPrestamosLibros.btnRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaPrestamosLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }

    public boolean comprobarCasillas(JTextField[] txf) {
        boolean acceso = true;
        int i = 0;
        while (acceso) {
            if (txf[i].getText().trim().isEmpty()) {
                Aviso a = new Aviso(ventanaPrestamosLibros, true, "Complete los casilleros");
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

    public void actualizarRegistros(LinkedList<Prestamo> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaPrestamosLibros.tblPrestamos.getModel();
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

    public Prestamo verificarFormulario(Prestamo a, JTextField[] txf) {
        try {
            a = new Prestamo(ventanaPrestamosLibros.txtCodigoLibroPrestamo.getText(), ventanaPrestamosLibros.txtCodigoAlumnoPrestamo.getText(), Date.valueOf(LocalDate.now()), Date.valueOf(ventanaPrestamosLibros.txtFechaDevolucion.getText()), (int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(ventanaPrestamosLibros.txtFechaDevolucion.getText())));
            refrescarFormulario(txf);
            return a;
        } catch (NumberFormatException e) {
            if (a == null) {
                Aviso v = new Aviso(ventanaPrestamosLibros, true, "Complete el formulario correctamente.");
                v.setVisible(true);
            }
            return a;
        }
    }

    public void refrescarFormulario(JTextField[] txf) {
        for (int i = 0; i < txf.length; i++) {
            txf[i].setText("");
        }
    }
}
