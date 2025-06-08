package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn;

    private static final String url = "jdbc:postgresql://localhost:5432/Biblioteca";
    public static String usuario = "null";
    public static String contraseña = "null";

    private static boolean acceso = false;

    private Conexion() {

    }

    public static boolean getAcceso() {
        return acceso;
    }

    public static Connection getConexion() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, usuario, contraseña);
                System.out.println("Conexión establecida");
                acceso = true;
            } catch (SQLException e) {
                System.err.println("Error al conectar: " + e.getMessage());
                acceso = false;
            }
        }
        return conn;
    }

    public static void cerrarConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                conn = null;
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
