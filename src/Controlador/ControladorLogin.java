package Controlador;

import Modelo.Conexion;
import Vista.Aviso;
import Vista.Login;
import Vista.MenuPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class ControladorLogin {

    private final Login ventanaLogin;
    private Aviso a;

    public ControladorLogin(Login ventanaLogin) {
        this.ventanaLogin = ventanaLogin;
    }

    public void iniciarLogin() {

        ventanaLogin.setVisible(true);

        ventanaLogin.btn_acceder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.usuario = ventanaLogin.txf_usuario.getText();
                Conexion.contraseña = new String(ventanaLogin.txf_contraseña.getPassword());
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

        ventanaLogin.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.cerrarConexion();
                System.exit(0);
            }
        });

        ventanaLogin.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaLogin.setState(JFrame.ICONIFIED);
            }
        });

    }
}
