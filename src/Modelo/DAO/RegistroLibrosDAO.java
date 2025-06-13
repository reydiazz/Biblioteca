package Modelo.DAO;


import Modelo.Libro;
import java.sql.*;
import java.util.LinkedList;

public class RegistroLibrosDAO {

    private Connection db = null;

    public RegistroLibrosDAO(Connection db) {
        this.db = db;
    }

    public boolean registroLibro(Libro nuevoLibro) {
        if (nuevoLibro != null) {
            String sql = "INSERT INTO libros(id_libro,titulo,autor,genero,copias,edicion) VALUES(?,?,?,?,?,?);";
            try {
                PreparedStatement cs = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                cs.setString(1, nuevoLibro.getCodigoLibro());
                cs.setString(2, nuevoLibro.getTitulo());
                cs.setString(3, nuevoLibro.getAutor());
                cs.setString(4, nuevoLibro.getGenero());
                cs.setInt(5, nuevoLibro.getNumeroCopias());
                cs.setString(6, nuevoLibro.getEdicion());

                cs.execute();
                System.out.println("Registro creado correctamente.");
                return true;
            } catch (Exception e) {
                System.out.println("Error al crear el registro.");
                e.printStackTrace();
                return false;
            }
        }return false;
    }

    public boolean modificarLibro(Libro modificadoLibro, String codigoLibro) {
        if (modificadoLibro != null) {
            String sql = "UPDATE libros SET id_libro = ?, titulo = ? , autor = ?, genero = ?, copias = ?, edicion = ? WHERE id_libro = ?;";

            try {
                CallableStatement cs = db.prepareCall(sql);
                cs.setString(1, modificadoLibro.getCodigoLibro());
                cs.setString(2, modificadoLibro.getTitulo());
                cs.setString(3, modificadoLibro.getAutor());
                cs.setString(4, modificadoLibro.getGenero());
                cs.setInt(5, modificadoLibro.getNumeroCopias());
                cs.setString(6, modificadoLibro.getEdicion());
                cs.setString(7, codigoLibro);
                cs.execute();
                System.out.println("Dato modificado correctamente.");
                return true;
            } catch (Exception e) {
                System.out.println("Error al modificar.");
                return false;
            }
        }
        return false;
    }

    public boolean eliminarLibro(String codigoLibro) {
        String sql = "DELETE FROM libros WHERE id_libro = ?;";
        try {

            CallableStatement c1 = db.prepareCall(sql);
            c1.setString(1, codigoLibro);
            c1.execute();

            System.out.println("Dato eliminado");
            return true;
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Error al eliminar");
            return false;
        }
    }

    public LinkedList recojerLibros() {
        LinkedList<Libro> listaDatos = new LinkedList<>();
        String sql = "SELECT * FROM libros";
        Statement st;
        try {
            st = db.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listaDatos.add(new Libro(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
            }
            System.out.println("Registros cargados perfectamente.");
        } catch (Exception e) {
            System.out.println("Error al cargar los registros.");
        }
        return listaDatos;
    }
}
