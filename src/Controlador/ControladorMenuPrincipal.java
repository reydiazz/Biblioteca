package Controlador;

import Modelo.Conexion;
import Vista.BuscarLibros;
import Vista.DevolucionLibros;
import Vista.Login;
import Vista.MenuPrincipal;
import Vista.PrestamosLibros;
import Vista.RegistrarAlumno;
import Vista.RegistroLibros;
import java.awt.event.*;

public class ControladorMenuPrincipal {

    private final MenuPrincipal ventanaMenuPrincipal;

    public ControladorMenuPrincipal(MenuPrincipal ventanaMenuPrincipal) {
        this.ventanaMenuPrincipal = ventanaMenuPrincipal;
    }

    public void iniciarMenuPrincipal() {

        ventanaMenuPrincipal.setVisible(true);

        ventanaMenuPrincipal.btnRegistrarAlumno.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorRegistrarAlumno ra = new ControladorRegistrarAlumno(new RegistrarAlumno());
                ra.iniciarMenuRegistrarAlumno();
            }
        });

        ventanaMenuPrincipal.btnPrestamoLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorPrestamosLibros pl = new ControladorPrestamosLibros(new PrestamosLibros());
                pl.iniciarMenuPrestamosLibros();
            }
        });

        ventanaMenuPrincipal.btnRegistrarLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorRegistroLibros rl = new ControladorRegistroLibros(new RegistroLibros());
                rl.iniciarMenuRegistroLibros();
            }
        });

        ventanaMenuPrincipal.btnDevolucionLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorDevolucionLibros dl = new ControladorDevolucionLibros(new DevolucionLibros());
                dl.iniciarMenuDevolucionLibros();
            }
        });

        ventanaMenuPrincipal.btnBuscarLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaMenuPrincipal.dispose();
                ControladorBuscarLibros bl = new ControladorBuscarLibros(new BuscarLibros());
                bl.iniciarMenuBuscarLibros();
            }
        });

        ventanaMenuPrincipal.btnSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.cerrarConexion();
                ventanaMenuPrincipal.dispose();
                ControladorLogin cl = new ControladorLogin(new Login());
                cl.iniciarLogin();
            }
        });

        ventanaMenuPrincipal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Conexion.cerrarConexion();
            }
        });
    }

}
