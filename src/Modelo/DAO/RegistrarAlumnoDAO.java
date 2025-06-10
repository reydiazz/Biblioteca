package Modelo.DAO;

import Modelo.Alumno;
import java.sql.*;
import java.util.LinkedList;

public class RegistrarAlumnoDAO {

    private Connection db = null;

    public RegistrarAlumnoDAO(Connection db) {
        this.db = db;
    }

    public LinkedList recojerAlumnos() {
        LinkedList<Alumno> listaDatos = new LinkedList<>();
        String sql = "SELECT * FROM alumno";
        Statement st;
        try {
            st = db.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listaDatos.add(new Alumno(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6).charAt(0)));
            }
            System.out.println("Registros cargados perfectamente.");
        } catch (Exception e) {
            System.out.println("Error al cargar los registros.");
        }
        return listaDatos;
    }

    public void registrarAlumno(Alumno nuevoAlumno) {
        if (nuevoAlumno != null) {
            String sql = "INSERT INTO alumno(id_alumno,nombre,apellido_p,nivel,grado,seccion) VALUES(?,?,?,?,?,?);";
            try {
                PreparedStatement cs = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                cs.setString(1, nuevoAlumno.getCodigoAlumno());
                cs.setString(2, nuevoAlumno.getNombre());
                cs.setString(3, nuevoAlumno.getApellidoPaterno());
                cs.setString(4, nuevoAlumno.getNivel());
                cs.setInt(5, nuevoAlumno.getGrado());
                cs.setString(6, String.valueOf(nuevoAlumno.getSeccion()));
                cs.execute();
                System.out.println("Registro creado correctamente.");
            } catch (Exception e) {
                System.out.println("Error al crear el registro.");
            }
        }
    }

    public void modificarAlumno(Alumno modificadoAlumno, String codigoAlumno) {
        if (modificadoAlumno != null) {
            String sql = "UPDATE Alumno SET id_alumno = ?, nombre = ? , apellido_p = ?, nivel = ?, grado = ?, seccion = ? WHERE id_alumno = ?;";

            try {
                CallableStatement cs = db.prepareCall(sql);
                cs.setString(1, modificadoAlumno.getCodigoAlumno());
                cs.setString(2, modificadoAlumno.getNombre());
                cs.setString(3, modificadoAlumno.getApellidoPaterno());
                cs.setString(4, modificadoAlumno.getNivel());
                cs.setInt(5, modificadoAlumno.getGrado());
                cs.setString(6, String.valueOf(modificadoAlumno.getSeccion()));
                cs.setString(7, codigoAlumno);
                cs.execute();
                System.out.println("Dato modificado correctamente.");
            } catch (Exception e) {
                System.out.println("Error al modificar.");
            }
        }
    }

    public void eliminarAlumno(String codigoAlumno) {
        String sql = "DELETE FROM alumno WHERE id_alumno = ?;";
        try {

            CallableStatement c1 = db.prepareCall(sql);
            c1.setString(1, codigoAlumno);
            c1.execute();
            
            System.out.println("Dato eliminado");
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Error al eliminar");
        }

    }

}
