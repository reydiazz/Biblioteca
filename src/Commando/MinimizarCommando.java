package Commando;

import Modelo.Ventana;

public class MinimizarCommando implements Comando {

    private final Ventana v;

    public MinimizarCommando(Ventana v) {
        this.v = v;
    }

    @Override
    public void execute() {
        v.minimizarVentana();
    }
}
