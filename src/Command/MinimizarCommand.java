/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

import javax.swing.JFrame;

public class MinimizarCommand implements Command {

    private final JFrame ventana;

    public MinimizarCommand(JFrame ventana) {
        this.ventana = ventana;
    }

    @Override
    public void execute() {
        ventana.setState(JFrame.ICONIFIED);
    }
}
