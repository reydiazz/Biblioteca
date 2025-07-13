package Controlador;

import Commando.CerrarComando;
import Commando.Comando;
import Commando.MinimizarCommando;
import Modelo.Ventana;
import Fabrica.AvisoFabrica;
import Fachada.EstiloFachada;
import Modelo.Conexion;
import Vista.Login;
import Vista.MenuPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLogin {

    private final Login ventanaLogin;

    public ControladorLogin(Login ventanaLogin) {
        this.ventanaLogin = ventanaLogin;
    }

    public void iniciarLogin() {

        Comando cmdMinimizarVentana = new MinimizarCommando(new Ventana(ventanaLogin));
        Comando cmdCerrarVentana = new CerrarComando(new Ventana(ventanaLogin));

        EstiloFachada.aplicarEstiloGlobal(ventanaLogin.getContentPane());
        EstiloFachada.aplicarFuncionesToolBar(ventanaLogin, ventanaLogin.pn_toolbar);

        ventanaLogin.setVisible(true);

        ventanaLogin.btn_acceder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Conexion.usuario = ventanaLogin.txf_usuario.getText();
                Conexion.contraseña = new String(ventanaLogin.txf_contraseña.getPassword());
                Conexion.getConexion();
                if (Conexion.getAcceso()) {
                    AvisoFabrica.crearAviso(ventanaLogin, "Acceso permitido").mostrar();
                    ventanaLogin.dispose();
                    ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                    m.iniciarMenuPrincipal();
                } else {
                    AvisoFabrica.crearAviso(ventanaLogin, "Acceso denegado.").mostrar();
                }
            }
        });

        ventanaLogin.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdCerrarVentana.execute();
            }
        });

        ventanaLogin.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdMinimizarVentana.execute();
            }
        });

    }
}
