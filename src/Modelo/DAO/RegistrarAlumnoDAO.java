package Modelo.DAO;

import Modelo.Alumno;
import java.sql.*;
import Vista.RegistrarAlumno;

public class RegistrarAlumnoDAO {

    private Connection db = null;

    public RegistrarAlumnoDAO(Connection db, RegistrarAlumno vista) {
        this.db = db;
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

}
