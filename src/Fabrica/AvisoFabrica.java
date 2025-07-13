package Fabrica;

import Vista.Cartel;
import javax.swing.JFrame;

public class AvisoFabrica {

    public static Cartel crearAviso(JFrame ventana, String mensaje) {
        return new Cartel(ventana, mensaje);
    }
}
