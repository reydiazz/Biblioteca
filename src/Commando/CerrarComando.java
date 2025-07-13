package Commando;

import Modelo.Ventana;

public class CerrarComando implements Comando {

    private final Ventana v;

    public CerrarComando(Ventana v) {
        this.v = v;
    }

    @Override
    public void execute() {
        v.cerrarVentana();
    }
}
