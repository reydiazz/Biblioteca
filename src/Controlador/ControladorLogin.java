package Controlador;

import Modelo.Conexion;
import Vista.Aviso;
import Vista.Login;
import Vista.MenuPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControladorLogin {

    private final Login ventanaLogin;
    private Aviso a;

    public ControladorLogin(Login ventanaLogin) {
        this.ventanaLogin = ventanaLogin;
    }

    public void iniciarLogin() {

        ventanaLogin.setVisible(true);

        ventanaLogin.btnAcceder.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.usuario = ventanaLogin.txtUsuario.getText();
                Conexion.contraseña = new String(ventanaLogin.txtContraseña.getPassword());
                Conexion.getConexion();
                if (Conexion.getAcceso()) {
                    a = new Aviso(ventanaLogin, true, "Acceso concedido");
                    a.setVisible(true);
                    ventanaLogin.dispose();
                    ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                    m.iniciarMenuPrincipal();
                } else {
                    a = new Aviso(ventanaLogin, true, "Acceso denegado");
                    a.setVisible(true);
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
