
package Controlador;

import Vista.DevolucionLibros;
import Vista.MenuPrincipal;
import java.awt.event.*;

public class ControladorDevolucionLibros {
    
    private final DevolucionLibros ventanaDevolucionLibros;
    
    public ControladorDevolucionLibros(DevolucionLibros ventanaDevolucionLibros){
        this.ventanaDevolucionLibros = ventanaDevolucionLibros;
    }
    
    public void iniciarMenuDevolucionLibros(){
        
        ventanaDevolucionLibros.setVisible(true);
        
        ventanaDevolucionLibros.btnBuscarDevolucion.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
        
        ventanaDevolucionLibros.btnRegresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                ventanaDevolucionLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
        
        ventanaDevolucionLibros.btnDevolverLibro.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
    }
}
