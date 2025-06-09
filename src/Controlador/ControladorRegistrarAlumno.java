package Controlador;

import Modelo.Alumno;
import Modelo.Conexion;
import Modelo.DAO.RegistrarAlumnoDAO;
import Vista.MenuPrincipal;
import Vista.RegistrarAlumno;
import java.awt.event.*;

public class ControladorRegistrarAlumno {
    
    private final RegistrarAlumno ventanaRegistrarAlumno;
    private RegistrarAlumnoDAO r;
    
    public ControladorRegistrarAlumno(RegistrarAlumno ventanaRegistrarAlumno){
        this.ventanaRegistrarAlumno = ventanaRegistrarAlumno;
        r = new RegistrarAlumnoDAO(Conexion.getConexion());
    }
    
    public void iniciarMenuRegistrarAlumno(){
        
        ventanaRegistrarAlumno.setVisible(true);
        
        ventanaRegistrarAlumno.btnRegistrar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                r.registrarAlumno(new Alumno(ventanaRegistrarAlumno.txtCodigo.getText(),ventanaRegistrarAlumno.txtNombre.getText(),ventanaRegistrarAlumno.txtApellido.getText(),ventanaRegistrarAlumno.txtNivel.getText(),Integer.parseInt(ventanaRegistrarAlumno.txtGrado.getText()),ventanaRegistrarAlumno.txtSeccion.getText().charAt(0)));
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
