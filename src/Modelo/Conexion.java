package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instancia;
    private Connection conexion;

    private final String url = "jdbc:postgresql://localhost:5432/mi_basedatos";
    private final String usuario = "mi_usuario";
    private final String contraseña = "mi_contraseña";

    private Conexion() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión establecida correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

}
