package Modelo.DAO;

import Modelo.Prestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class PrestamoLibrosDAO {

    private Connection db = null;

    public PrestamoLibrosDAO(Connection db) {
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
                listaDatos.add(new Prestamo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5)));
            }
            System.out.println("Registros cargados perfectamente.");
        } catch (Exception e) {
            e.toString();
            System.out.println("Error al cargar los registros.");
            e.printStackTrace();
        }
        return listaDatos;
    }

    public boolean registrarPrestamos(Prestamo nuevoPrestamo) {
        if (nuevoPrestamo != null) {
            String sql = "INSERT INTO prestamo(id_libro,id_alumno,fecha_prestamo,fecha_devolucion,diasrestantes) VALUES(?,?,?,?,?);";
            String sqlB = "UPDATE libros SET copias = copias - 1 WHERE id_libro = ?;";
            try {
                PreparedStatement cs = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                cs.setString(1, nuevoPrestamo.getCodigoLibro());
                cs.setString(2, nuevoPrestamo.getCodigoAlumno());
                cs.setDate(3, nuevoPrestamo.getFechaPrestamo());
                cs.setDate(4, nuevoPrestamo.getFechaDevolucion());
                cs.setInt(5, nuevoPrestamo.getDiasRestantes());

                cs.execute();

                PreparedStatement cd = db.prepareStatement(sqlB, Statement.RETURN_GENERATED_KEYS);
                cd.setString(1, nuevoPrestamo.getCodigoLibro());

                cd.execute();

                System.out.println("Registro creado correctamente.");
                return true;
            } catch (Exception e) {
                System.out.println("Error al crear el registro.");
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

}
