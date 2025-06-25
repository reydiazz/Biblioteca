package Controlador;

import Modelo.Conexion;
import Modelo.Personalizacion;
import Vista.Aviso;
import Vista.Login;
import Vista.MenuPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControladorLogin {

    private final Login ventanaLogin;
    private Aviso a;

    public ControladorLogin(Login ventanaLogin) {
        this.ventanaLogin = ventanaLogin;
    }

    public void iniciarLogin() {
        
        JTextField [] campos = {ventanaLogin.txf_usuario,ventanaLogin.txf_contraseña};
        JButton [] botones = {ventanaLogin.btn_acceder};
        
        new Personalizacion(ventanaLogin, ventanaLogin.pn_toolbar,campos,botones);
        
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
