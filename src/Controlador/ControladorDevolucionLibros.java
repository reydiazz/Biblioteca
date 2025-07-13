package Controlador;

import Commando.CerrarComando;
import Commando.MinimizarCommando;
import Modelo.Ventana;
import Modelo.Conexion;
import Modelo.DAO.DevolucionLibrosDAO;
import Modelo.Prestamo;
import Vista.DevolucionLibros;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import Commando.Comando;
import Commando.RegresarCommando;
import Fabrica.AvisoFabrica;
import Fachada.EstiloFachada;
import Fachada.ValidacionesUIFachada;

public class ControladorDevolucionLibros {

    private final DevolucionLibros ventanaDevolucionLibros;
    private DevolucionLibrosDAO dao;

    public ControladorDevolucionLibros(DevolucionLibros ventanaDevolucionLibros) {
        this.ventanaDevolucionLibros = ventanaDevolucionLibros;
        dao = new DevolucionLibrosDAO(Conexion.getConexion());
    }

    public void iniciarMenuDevolucionLibros() {
        ventanaDevolucionLibros.setVisible(true);

        Comando cmdMinimizarVentana = new MinimizarCommando(new Ventana(ventanaDevolucionLibros));
        Comando cmdCerrarVentana = new CerrarComando(new Ventana(ventanaDevolucionLibros));
        Comando cmdRegresarComando = new RegresarCommando(new Ventana(ventanaDevolucionLibros));

        EstiloFachada.aplicarEstiloGlobal(ventanaDevolucionLibros.getContentPane());
        EstiloFachada.aplicarFuncionesToolBar(ventanaDevolucionLibros, ventanaDevolucionLibros.pn_toolbar);
        EstiloFachada.filtrarTabla(ventanaDevolucionLibros.tbl_tablaDevolucion, ventanaDevolucionLibros.txf_buscar);

        actualizarRegistrosDevolucion(dao.recojerPrestamos());

        ventanaDevolucionLibros.btn_devolverLibro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = ventanaDevolucionLibros.tbl_tablaDevolucion.getSelectedRow();
                if (ValidacionesUIFachada.comprobarSeleccion(fila)) {
                    String codigoLibro = String.valueOf(ventanaDevolucionLibros.tbl_tablaDevolucion.getValueAt(fila, 0));
                    String codigoAlumno = String.valueOf(ventanaDevolucionLibros.tbl_tablaDevolucion.getValueAt(fila, 2));
                    if (dao.actualizarDevolverLibro(codigoAlumno, codigoLibro)) {
                        AvisoFabrica.crearAviso(ventanaDevolucionLibros, "Libro devuelto correctamente.").mostrar();
                        actualizarRegistrosDevolucion(dao.recojerPrestamos());
                    } else {
                        AvisoFabrica.crearAviso(ventanaDevolucionLibros, "Error al devolver el libro.").mostrar();
                    }
                } else {
                    AvisoFabrica.crearAviso(ventanaDevolucionLibros, "Seleccione un registro.").mostrar();
                }
            }
        });

        ventanaDevolucionLibros.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdCerrarVentana.execute();
            }
        });

        ventanaDevolucionLibros.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdMinimizarVentana.execute();
            }
        });

        ventanaDevolucionLibros.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdRegresarComando.execute();
            }
        });
    }

    public void actualizarRegistrosDevolucion(LinkedList<Prestamo> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaDevolucionLibros.tbl_tablaDevolucion.getModel();
        String datos[] = new String[5];
        modelo.setRowCount(0);

        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getCodigoLibro();
            datos[1] = lista.get(i).getNombreLibro();
            datos[2] = lista.get(i).getCodigoAlumno();
            datos[3] = lista.get(i).getNombreAlumno();
            datos[4] = String.valueOf(lista.get(i).getFechaDevolucion());

            modelo.addRow(datos);
        }
    }

}
