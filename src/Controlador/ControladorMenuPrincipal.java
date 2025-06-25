package Controlador;

import Modelo.Conexion;
import Modelo.Personalizacion;
import Vista.DevolucionLibros;
import Vista.Login;
import Vista.MenuPrincipal;
import Vista.PrestamosLibros;
import Vista.RegistrarAlumno;
import Vista.RegistroLibros;
import java.awt.event.*;
import javax.swing.JFrame;

public class ControladorMenuPrincipal {

    private final MenuPrincipal ventanaMenuPrincipal;

    public ControladorMenuPrincipal(MenuPrincipal ventanaMenuPrincipal) {
        this.ventanaMenuPrincipal = ventanaMenuPrincipal;
    }

    public void iniciarMenuPrincipal() {
        
        new Personalizacion(ventanaMenuPrincipal, ventanaMenuPrincipal.pn_toolbar);

        ventanaMenuPrincipal.setVisible(true);

        ventanaMenuPrincipal.lbl_tituloAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorRegistrarAlumno ra = new ControladorRegistrarAlumno(new RegistrarAlumno());
                ra.iniciarMenuRegistrarAlumno();
            }
        });

        ventanaMenuPrincipal.lbl_tituloPrestamo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorPrestamosLibros pl = new ControladorPrestamosLibros(new PrestamosLibros());
                pl.iniciarMenuPrestamosLibros();
            }
        });

        ventanaMenuPrincipal.lbl_tituloLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorRegistroLibros rl = new ControladorRegistroLibros(new RegistroLibros());
                rl.iniciarMenuRegistroLibros();
            }
        });

        ventanaMenuPrincipal.lbl_tituloDevolver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorDevolucionLibros dl = new ControladorDevolucionLibros(new DevolucionLibros());
                dl.iniciarMenuDevolucionLibros();
            }
        });

        ventanaMenuPrincipal.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.cerrarConexion();
                ventanaMenuPrincipal.dispose();
                ControladorLogin cl = new ControladorLogin(new Login());
                cl.iniciarLogin();
            }
        });

        ventanaMenuPrincipal.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.setState(JFrame.ICONIFIED);
            }
        });
    }

}
