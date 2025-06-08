package Controlador;

import Vista.MenuPrincipal;
import java.awt.event.*;

public class ControladorMenuPrincipal {

    private final MenuPrincipal ventanaMenuPrincipal;

    public ControladorMenuPrincipal(MenuPrincipal ventanaMenuPrincipal) {
        this.ventanaMenuPrincipal = ventanaMenuPrincipal;
    }

    public void iniciarMenuPrincipal() {
        
        ventanaMenuPrincipal.setVisible(true);
        
        ventanaMenuPrincipal.btnRegistrarAlumno.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        ventanaMenuPrincipal.btnPrestamoLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        ventanaMenuPrincipal.btnRegistrarLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        
        ventanaMenuPrincipal.btnDevolucionLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        
        ventanaMenuPrincipal.btnBuscarLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        
        ventanaMenuPrincipal.btnSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                
            }
        });
    }

}
