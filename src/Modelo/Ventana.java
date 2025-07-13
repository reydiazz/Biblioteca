package Modelo;

import Controlador.ControladorMenuPrincipal;
import Modelo.Conexion;
import Vista.MenuPrincipal;
import javax.swing.JFrame;

public class Ventana {

    private JFrame ventana;

    public Ventana(JFrame ventana) {
        this.ventana = ventana;
    }

    public void cerrarVentana() {
        Conexion.cerrarConexion();
        ventana.dispose();
    }

    public void minimizarVentana() {
        ventana.setState(JFrame.ICONIFIED);
    }

    public void regresarVentana() {
        ventana.dispose();
        new ControladorMenuPrincipal(new MenuPrincipal()).iniciarMenuPrincipal();
    }
}
