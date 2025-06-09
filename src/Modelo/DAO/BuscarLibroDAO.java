package Modelo.DAO;

import Modelo.Libro;
import java.sql.*;
import java.util.LinkedList;

public class BuscarLibroDAO {

    private Connection db = null;

    public BuscarLibroDAO(Connection db) {
        this.db = db;
    }

    public LinkedList recojerRegistros() {
        LinkedList<Libro> listaDatos = new LinkedList<>();
        String sql = "SELECT * FROM libros";
        Statement st;
        try {
            st = db.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listaDatos.add(new Libro(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6)));
            }
            System.out.println("Registros cargados perfectamente.");
        } catch (Exception e) {
            System.out.println("Error al cargar los registros.");
        }

        return listaDatos;
    }
}
