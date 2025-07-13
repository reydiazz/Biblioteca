package Controlador;

import Commando.CerrarComando;
import Commando.Comando;
import Commando.MinimizarCommando;
import Modelo.Ventana;
import Fachada.EstiloFachada;
import Vista.DevolucionLibros;
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

        Comando cmdMinimizarVentana = new MinimizarCommando(new Ventana(ventanaMenuPrincipal));
        Comando cmdCerrarVentana = new CerrarComando(new Ventana(ventanaMenuPrincipal));

        EstiloFachada.aplicarFuncionesToolBar(ventanaMenuPrincipal, ventanaMenuPrincipal.pn_toolbar);

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
                cmdCerrarVentana.execute();
            }
        });

        ventanaMenuPrincipal.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdMinimizarVentana.execute();
            }
        });

    }
}
