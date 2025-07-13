package Controlador;

import Commando.CerrarComando;
import Commando.Comando;
import Commando.MinimizarCommando;
import Commando.RegresarCommando;
import Modelo.Ventana;
import Fabrica.AvisoFabrica;
import Fachada.EstiloFachada;
import Fachada.ValidacionesUIFachada;
import Modelo.Conexion;
import Modelo.DAO.PrestamoLibrosDAO;
import Modelo.Prestamo;
import Vista.PrestamosLibros;
import java.awt.Component;
import java.awt.event.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

public class ControladorPrestamosLibros {

    private final PrestamosLibros ventanaPrestamosLibros;
    private PrestamoLibrosDAO dao;

    public ControladorPrestamosLibros(PrestamosLibros ventanaPrestamosLibros) {
        this.ventanaPrestamosLibros = ventanaPrestamosLibros;
        dao = new PrestamoLibrosDAO(Conexion.getConexion());
    }

    public void iniciarMenuPrestamosLibros() {
        Comando cmdMinimizarVentana = new MinimizarCommando(new Ventana(ventanaPrestamosLibros));
        Comando cmdCerrarVentana = new CerrarComando(new Ventana(ventanaPrestamosLibros));
        Comando cmdRegresarComando = new RegresarCommando(new Ventana(ventanaPrestamosLibros));

        EstiloFachada.aplicarEstiloGlobal(ventanaPrestamosLibros.getContentPane());
        EstiloFachada.aplicarFuncionesToolBar(ventanaPrestamosLibros, ventanaPrestamosLibros.pn_toolbar);
        EstiloFachada.filtrarTabla(ventanaPrestamosLibros.tbl_tablaPrestamo, ventanaPrestamosLibros.txf_buscar);

        ventanaPrestamosLibros.setVisible(true);

        actualizarRegistrosPrestamo(dao.recojerPrestamos());
        ventanaPrestamosLibros.btn_prestamo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Set<Component> excluidos = Set.of(ventanaPrestamosLibros.txf_buscar);
                if (ValidacionesUIFachada.comprobarCasillas(ventanaPrestamosLibros, excluidos)) {
                    if (dao.registrarPrestamos(verificarFormulario())) {
                        actualizarRegistrosPrestamo(dao.recojerPrestamos());
                        AvisoFabrica.crearAviso(ventanaPrestamosLibros, "Dato ingresado correctamente.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaPrestamosLibros.getContentPane());
                    } else if (verificarFormulario() != null) {
                        AvisoFabrica.crearAviso(ventanaPrestamosLibros, "Error al ingresar el dato.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaPrestamosLibros.getContentPane());
                    } else if (verificarFormulario() == null) {
                        AvisoFabrica.crearAviso(ventanaPrestamosLibros, "Verifique el formulario.").mostrar();
                        ValidacionesUIFachada.resetearFormulario(ventanaPrestamosLibros.getContentPane());
                    }
                } else {
                    AvisoFabrica.crearAviso(ventanaPrestamosLibros, "Complete el formulario.").mostrar();
                    ValidacionesUIFachada.resetearFormulario(ventanaPrestamosLibros.getContentPane());
                }

            }
        });

        ventanaPrestamosLibros.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdRegresarComando.execute();
            }
        });

        ventanaPrestamosLibros.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdCerrarVentana.execute();
            }
        });

        ventanaPrestamosLibros.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cmdMinimizarVentana.execute();
            }
        });

    }

    public Prestamo verificarFormulario() {
        try {
            String codigoLibro = ventanaPrestamosLibros.txf_codigoLibro.getText().trim();
            String codigoAlumno = ventanaPrestamosLibros.txf_codigoAlumno.getText().trim();
            LocalDate hoy = LocalDate.now();
            LocalDate fechaDevolucion = LocalDate.parse(ventanaPrestamosLibros.txf_fechaDevolucion.getText().trim());
            int diasPrestamo = (int) ChronoUnit.DAYS.between(hoy, fechaDevolucion);
            Prestamo prestamo = new Prestamo(codigoLibro, codigoAlumno, Date.valueOf(hoy), Date.valueOf(fechaDevolucion), diasPrestamo);
            return prestamo;
        } catch (Exception e) {
            return null;
        }
    }

    public void actualizarRegistrosPrestamo(LinkedList<Prestamo> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaPrestamosLibros.tbl_tablaPrestamo.getModel();
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
