package Controlador;

import Vista.BuscarLibros;
import Vista.MenuPrincipal;
import java.awt.event.*;

public class ControladorBuscarLibros {
    
    private final BuscarLibros ventanaBuscarLibros;
    
    public ControladorBuscarLibros(BuscarLibros ventanaBuscarLibros){
        this.ventanaBuscarLibros = ventanaBuscarLibros;
    }
    
    public void iniciarMenuBuscarLibros(){
        ventanaBuscarLibros.setVisible(true);
    
        ventanaBuscarLibros.btnBuscarLibro.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        
        ventanaBuscarLibros.btnRegresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaBuscarLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }
}
