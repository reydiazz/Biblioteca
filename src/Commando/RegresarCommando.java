package Commando;

import Modelo.Ventana;

public class RegresarCommando implements Comando {

    private Ventana v;

    public RegresarCommando(Ventana v) {
        this.v = v;
    }

    @Override
    public void execute() {
        v.regresarVentana();
    }

}
