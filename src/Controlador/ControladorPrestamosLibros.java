package Controlador;

import Command.CerrarCommand;
import Command.MinimizarCommand;
import Factory.AvisoFactory;
import Modelo.Conexion;
import Modelo.DAO.PrestamoLibrosDAO;
import Modelo.Personalizacion;
import Modelo.Prestamo;
import Vista.Aviso;
import Vista.Login;
import Vista.MenuPrincipal;
import Vista.PrestamosLibros;
import java.awt.event.*;
import javax.swing.JTextField;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
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
        JButton[] btn = {ventanaPrestamosLibros.btn_prestamo};
        JTextField[] txfs = {ventanaPrestamosLibros.txf_codigoAlumno, ventanaPrestamosLibros.txf_codigoLibro, ventanaPrestamosLibros.txf_fechaDevolucion, ventanaPrestamosLibros.txf_buscar};
        JTextField[] txf = {ventanaPrestamosLibros.txf_codigoAlumno, ventanaPrestamosLibros.txf_codigoLibro, ventanaPrestamosLibros.txf_fechaDevolucion};

        new Personalizacion(ventanaPrestamosLibros, ventanaPrestamosLibros.pn_toolbar, txfs, btn, ventanaPrestamosLibros.tbl_tablaPrestamo);

        ventanaPrestamosLibros.setVisible(true);

        actualizarRegistros(pa.recojerPrestamos());
        ventanaPrestamosLibros.btn_prestamo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (comprobarCasillas(txf)) {
                    if (pa.registrarPrestamos(verificarFormulario(p, txf))) {
                        actualizarRegistros(pa.recojerPrestamos());
                        Aviso a = AvisoFactory.crearAviso(ventanaPrestamosLibros, true, "OK");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }

            }
        });

        ventanaPrestamosLibros.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaPrestamosLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });

        ventanaPrestamosLibros.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new CerrarCommand(ventanaPrestamosLibros).execute();
            }
        });

        ventanaPrestamosLibros.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MinimizarCommand(ventanaPrestamosLibros).execute();
            }
        });

    }

    public boolean comprobarCasillas(JTextField[] txf) {
        boolean acceso = true;
        int i = 0;
        while (acceso) {
            if (txf[i].getText().trim().isEmpty()) {
                Aviso a = AvisoFactory.crearAviso(ventanaPrestamosLibros, true, "VACIO");
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
        DefaultTableModel modelo = (DefaultTableModel) ventanaPrestamosLibros.tbl_tablaPrestamo.getModel();
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
            a = new Prestamo(ventanaPrestamosLibros.txf_codigoLibro.getText(), ventanaPrestamosLibros.txf_codigoAlumno.getText(), Date.valueOf(LocalDate.now()), Date.valueOf(ventanaPrestamosLibros.txf_fechaDevolucion.getText()), (int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(ventanaPrestamosLibros.txf_fechaDevolucion.getText())));
            refrescarFormulario(txf);
            return a;
        } catch (NumberFormatException e) {
            if (a == null) {
                Aviso v = AvisoFactory.crearAviso(ventanaPrestamosLibros, true, "XFORM");
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
