
package Controlador;

import Vista.MenuPrincipal;
import Vista.PrestamosLibros;
import java.awt.event.*;

public class ControladorPrestamosLibros {
    
    private final PrestamosLibros ventanaPrestamosLibros;
    
    public ControladorPrestamosLibros(PrestamosLibros ventanaPrestamosLibros){
        this.ventanaPrestamosLibros = ventanaPrestamosLibros;
    }
    
    public void iniciarMenuPrestamosLibros(){
        
        ventanaPrestamosLibros.setVisible(true);
        
        ventanaPrestamosLibros.btnPrestamoLibro.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
        
        ventanaPrestamosLibros.btnBuscarPrestamo.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
        
        ventanaPrestamosLibros.btnRegresar1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                ventanaPrestamosLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }
}
