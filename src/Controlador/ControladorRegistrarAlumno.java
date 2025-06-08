package Controlador;

import Vista.MenuPrincipal;
import Vista.RegistrarAlumno;
import java.awt.event.*;

public class ControladorRegistrarAlumno {
    
    private final RegistrarAlumno ventanaRegistrarAlumno;
    
    public ControladorRegistrarAlumno(RegistrarAlumno ventanaRegistrarAlumno){
        this.ventanaRegistrarAlumno = ventanaRegistrarAlumno;
    }
    
    public void iniciarMenuRegistrarAlumno(){
        
        ventanaRegistrarAlumno.setVisible(true);
        
        ventanaRegistrarAlumno.btnRegistrar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
        
        ventanaRegistrarAlumno.btnRegresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                ventanaRegistrarAlumno.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }
}
