
package Controlador;

import Vista.MenuPrincipal;
import Vista.RegistroLibros;
import java.awt.event.*;

public class ControladorRegistroLibros {
    
    private final RegistroLibros ventanaRegistroLibro;
    
    public ControladorRegistroLibros(RegistroLibros ventanaRegistroLibro){
        this.ventanaRegistroLibro = ventanaRegistroLibro;
    }
    
    public void iniciarMenuRegistroLibros(){
        
        ventanaRegistroLibro.setVisible(true);
        
        ventanaRegistroLibro.btnAgregarLibro.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
        
        ventanaRegistroLibro.btnEliminarLibro.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
        
        ventanaRegistroLibro.btnRegresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                ventanaRegistroLibro.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }
    
}
