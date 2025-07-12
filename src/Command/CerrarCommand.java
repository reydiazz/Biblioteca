/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

import Modelo.Conexion;
import Controlador.ControladorLogin;
import Vista.Login;
import javax.swing.JFrame;

public class CerrarCommand implements Command {

    private final JFrame ventana;

    public CerrarCommand(JFrame ventana) {
        this.ventana = ventana;
    }

    @Override
    public void execute() {
        Conexion.cerrarConexion();
        ventana.dispose();
        new ControladorLogin(new Login()).iniciarLogin();
    }
}
