package Controlador;

import Modelo.Conexion;
import Vista.Login;
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
        //Eventos del boton acceder del JFrame Login.

        //Boton acceder.
        ventanaLogin.btnAcceder.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.usuario = ventanaLogin.txtUsuario.getText();
                Conexion.contraseña = new String(ventanaLogin.txtContraseña.getPassword());
                Conexion.getConexion();
                if (Conexion.getAcceso()) {
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
