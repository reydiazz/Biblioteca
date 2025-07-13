package Modelo.DAO;

import Modelo.Prestamo;
import java.sql.*;
import java.util.*;

public class DevolucionLibrosDAO {

    private Connection db = null;

    public DevolucionLibrosDAO(Connection db) {
        this.db = db;
    }

    public LinkedList recojerPrestamos() {
        LinkedList<Prestamo> listaDatos = new LinkedList<>();
        String sql = "SELECT \n"
                + "    Prestamo.id_libro AS codigo_libro,\n"
                + "    Libros.titulo AS nombre_libro,\n"
                + "    Prestamo.id_alumno AS codigo_alumno,\n"
                + "    Alumno.nombre AS nombre_alumno,\n"
                + "    Prestamo.fecha_devolucion\n"
                + "FROM Prestamo\n"
                + "JOIN Libros ON Prestamo.id_libro = Libros.id_libro\n"
                + "JOIN Alumno ON Prestamo.id_alumno = Alumno.id_alumno;";
        Statement st;
        try {
            st = db.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listaDatos.add(new Prestamo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5)));
            }
            System.out.println("Registros cargados perfectamente.");
        } catch (Exception e) {
            e.toString();
            System.out.println("Error al cargar los registros.");
            e.printStackTrace();
        }
        return listaDatos;
    }

    public boolean actualizarDevolverLibro(String codigoAlumno, String codigoLibro) {
        String sql = "UPDATE libros SET copias = copias + 1 WHERE id_libro = ?;";
        String sql2 = "DELETE FROM prestamo WHERE id_alumno = ? AND id_libro = ?;";
        try {
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, codigoLibro);
            ps.execute();
            
            PreparedStatement ps2 = db.prepareCall(sql2);
            ps2.setString(1, codigoAlumno);
            ps2.setString(2, codigoLibro);
            ps2.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
