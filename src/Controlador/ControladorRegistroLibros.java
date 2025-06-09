
package Controlador;

import Modelo.Conexion;
import Modelo.DAO.RegistroLibrosDAO;
import Modelo.Libro;
import Vista.MenuPrincipal;
import Vista.RegistroLibros;
import java.awt.event.*;

public class ControladorRegistroLibros {
    
    private final RegistroLibros ventanaRegistroLibro;
    private RegistroLibrosDAO rldao;
    
    public ControladorRegistroLibros(RegistroLibros ventanaRegistroLibro){
        this.ventanaRegistroLibro = ventanaRegistroLibro;
        rldao = new RegistroLibrosDAO(Conexion.getConexion(), ventanaRegistroLibro);
    }
    
    public void iniciarMenuRegistroLibros(){
        
        ventanaRegistroLibro.setVisible(true);
        
        ventanaRegistroLibro.btnAgregarLibro.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                rldao.registroLibro(new Libro(ventanaRegistroLibro.txtCodigoLibro.getText(),ventanaRegistroLibro.txtTitulo.getText(),ventanaRegistroLibro.txtAutor.getText(),ventanaRegistroLibro.txtGenero.getText(),Integer.parseInt(ventanaRegistroLibro.txtStock.getText()),ventanaRegistroLibro.txtEdicion.getText()));
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
