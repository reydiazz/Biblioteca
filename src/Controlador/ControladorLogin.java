package Controlador;

import Modelo.Conexion;
import Vista.Login;
import Vista.MenuPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControladorLogin {

    private final Login ventanaLogin;

    public ControladorLogin(Login ventanaLogin) {
        this.ventanaLogin = ventanaLogin;
    }

    public void iniciarLogin() {

        ventanaLogin.setVisible(true);

        //Boton acceder.
        ventanaLogin.btnAcceder.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.usuario = ventanaLogin.txtUsuario.getText();
                Conexion.contraseña = new String(ventanaLogin.txtContraseña.getPassword());
                Conexion.getConexion();
                if (Conexion.getAcceso()) {
                    ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                    m.iniciarMenuPrincipal();
                    ventanaLogin.dispose();
                    System.out.println("Conexion concedida.");
                } else {
                    System.out.println("Acceso denegado");
                }
            }
        });

        ventanaLogin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Conexion.cerrarConexion();
            }
        });

    }
}
