package Modelo.DAO;

import Modelo.Libro;
import java.sql.*;
import Vista.RegistroLibros;

public class RegistroLibrosDAO {
    
    private Connection db = null;

    public RegistroLibrosDAO(Connection db, RegistroLibros vista){
        this.db = db;
    }
    
    public void registroLibro(Libro nuevoLibro){
        if (nuevoLibro != null){
            String sql = "INSERT INTO libros(id_libro,titulo,autor,genero,copias,edicion) VALUES(?,?,?,?,?,?);";
            try{
                PreparedStatement cs = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                cs.setString(1, nuevoLibro.getCodigoLibro());
                cs.setString(2, nuevoLibro.getTitulo());
                cs.setString(3, nuevoLibro.getAutor());
                cs.setString(4, nuevoLibro.getGenero());
                cs.setInt(5, nuevoLibro.getNumeroCopias());
                cs.setString(6, nuevoLibro.getEdicion());
                
                cs.execute();
                System.out.println("Registro creado correctamente.");
            } catch(Exception e){
                System.out.println("Error al crear el registro.");
                e.printStackTrace();
            }
        }
    }
}
