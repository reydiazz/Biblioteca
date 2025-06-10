package Controlador;

import Modelo.Conexion;
import Modelo.DAO.BuscarLibroDAO;
import Modelo.Libro;
import Vista.BuscarLibros;
import Vista.MenuPrincipal;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorBuscarLibros {

    private final BuscarLibros ventanaBuscarLibros;
    private BuscarLibroDAO b;

    public ControladorBuscarLibros(BuscarLibros ventanaBuscarLibros) {
        this.ventanaBuscarLibros = ventanaBuscarLibros;
        b = new BuscarLibroDAO(Conexion.getConexion());
    }

    public void iniciarMenuBuscarLibros() {
        ventanaBuscarLibros.setVisible(true);
        mostrarRegistros(b.recojerRegistros());
        
        ventanaBuscarLibros.btnBuscarLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        ventanaBuscarLibros.btnRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaBuscarLibros.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }

    public void mostrarRegistros(LinkedList<Libro> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaBuscarLibros.tblLibros.getModel();
        String datos[] = new String[6];
        modelo.setRowCount(0);

        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getCodigoLibro();
            datos[1] = lista.get(i).getTitulo();
            datos[2] = lista.get(i).getAutor();
            datos[3] = lista.get(i).getGenero();
            datos[4] = String.valueOf(lista.get(i).getNumeroCopias());
            datos[5] = lista.get(i).getEdicion();

            modelo.addRow(datos);
        }

    }
}
