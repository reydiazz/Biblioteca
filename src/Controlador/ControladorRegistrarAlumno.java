package Controlador;

import Modelo.Alumno;
import Modelo.Conexion;
import Modelo.DAO.RegistrarAlumnoDAO;
import Vista.Aviso;
import Vista.MenuPrincipal;
import Vista.RegistrarAlumno;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControladorRegistrarAlumno {

    private final RegistrarAlumno ventanaRegistrarAlumno;
    private RegistrarAlumnoDAO r;
    private Alumno a;

    public ControladorRegistrarAlumno(RegistrarAlumno ventanaRegistrarAlumno) {
        this.ventanaRegistrarAlumno = ventanaRegistrarAlumno;
        r = new RegistrarAlumnoDAO(Conexion.getConexion());
    }

    public void iniciarMenuRegistrarAlumno() {
        JTextField[] txf = {ventanaRegistrarAlumno.txtCodigo, ventanaRegistrarAlumno.txtNombre, ventanaRegistrarAlumno.txtApellido, ventanaRegistrarAlumno.txtNivel, ventanaRegistrarAlumno.txtGrado, ventanaRegistrarAlumno.txtSeccion};

        ventanaRegistrarAlumno.setVisible(true);

        actualizarRegistros(r.recojerAlumnos());

        ventanaRegistrarAlumno.tblAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selecionRegistro(txf);
            }
        });

        ventanaRegistrarAlumno.btnRegistrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarCasillas(txf)) {
                    if (verificarCodigoDuplicado(r.recojerAlumnos(), ventanaRegistrarAlumno.txtCodigo.getText())) {
                        r.registrarAlumno(verificarFormulario(a, txf));
                        actualizarRegistros(r.recojerAlumnos());
                    } else {
                        Aviso v = new Aviso(ventanaRegistrarAlumno, true, "Codigo ya existente");
                        v.setVisible(true);
                    }
                } else {
                    Aviso v = new Aviso(ventanaRegistrarAlumno, true, "Complete los casilleros");
                    v.setVisible(true);
                }
            }
        });

        ventanaRegistrarAlumno.btnModificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    if (comprobarCasillas(txf)) {
                        r.modificarAlumno(new Alumno(ventanaRegistrarAlumno.txtCodigo.getText(), ventanaRegistrarAlumno.txtNombre.getText(), ventanaRegistrarAlumno.txtApellido.getText(), ventanaRegistrarAlumno.txtNivel.getText(), Integer.parseInt(ventanaRegistrarAlumno.txtGrado.getText()), ventanaRegistrarAlumno.txtSeccion.getText().charAt(0)), (String) ventanaRegistrarAlumno.tblAlumnos.getValueAt(ventanaRegistrarAlumno.tblAlumnos.getSelectedRow(), 0));
                        actualizarRegistros(r.recojerAlumnos());
                    } else {
                        Aviso a = new Aviso(ventanaRegistrarAlumno, true, "Complete los casilleros");
                        a.setVisible(true);
                    }
                } else {
                    Aviso a = new Aviso(ventanaRegistrarAlumno, true, "Seleccione un registro");
                    a.setVisible(true);
                }
            }
        });

        ventanaRegistrarAlumno.btnEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    r.eliminarAlumno((String) ventanaRegistrarAlumno.tblAlumnos.getValueAt(ventanaRegistrarAlumno.tblAlumnos.getSelectedRow(), 0));
                    actualizarRegistros(r.recojerAlumnos());
                } else {
                    Aviso a = new Aviso(ventanaRegistrarAlumno, true, "Seleccione un registro");
                    a.setVisible(true);
                }
            }
        });

        ventanaRegistrarAlumno.btnRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaRegistrarAlumno.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });
    }

    public boolean comprobarSeleccion() {
        int filaElgda = ventanaRegistrarAlumno.tblAlumnos.getSelectedRow();
        if (filaElgda >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Alumno verificarFormulario(Alumno a, JTextField[] txf) {
        try {
            a = new Alumno(ventanaRegistrarAlumno.txtCodigo.getText(), ventanaRegistrarAlumno.txtNombre.getText(), ventanaRegistrarAlumno.txtApellido.getText(), ventanaRegistrarAlumno.txtNivel.getText(), Integer.parseInt(ventanaRegistrarAlumno.txtGrado.getText()), ventanaRegistrarAlumno.txtSeccion.getText().charAt(0));
            refrescarFormulario(txf);
            return a;
        } catch (NumberFormatException e) {
            if (a == null) {
                Aviso v = new Aviso(ventanaRegistrarAlumno, true, "Complete el formulario correctamente.");
                v.setVisible(true);
            }
            return a;
        }
    }

    public boolean comprobarCasillas(JTextField[] txf) {
        boolean acceso = true;
        int i = 0;
        while (acceso) {
            if (txf[i].getText().trim().isEmpty()) {
                acceso = false;
            }
            if (txf.length - 1 <= i && acceso != false) {
                acceso = false;
            } else {
                i++;
            }
        }
        return txf.length - 1 == i;
    }

    public void actualizarRegistros(LinkedList<Alumno> lista) {
        DefaultTableModel modelo = (DefaultTableModel) ventanaRegistrarAlumno.tblAlumnos.getModel();
        String datos[] = new String[6];
        modelo.setRowCount(0);

        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getCodigoAlumno();
            datos[1] = lista.get(i).getNombre();
            datos[2] = lista.get(i).getApellidoPaterno();
            datos[3] = lista.get(i).getNivel();
            datos[4] = String.valueOf(lista.get(i).getGrado());
            datos[5] = String.valueOf(lista.get(i).getSeccion());

            modelo.addRow(datos);
        }
    }

    public boolean verificarCodigoDuplicado(LinkedList<Alumno> lista, String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (codigo.equalsIgnoreCase(lista.get(i).getCodigoAlumno())) {
                return false;
            }
        }
        return true;
    }

    public void selecionRegistro(JTextField[] txf) {
        int filaElgda = ventanaRegistrarAlumno.tblAlumnos.getSelectedRow();
        if (filaElgda >= 0) {
            for (int i = 0; i < txf.length; i++) {
                txf[i].setText((String) ventanaRegistrarAlumno.tblAlumnos.getValueAt(filaElgda, i));
            }
        }
    }

    public void refrescarFormulario(JTextField[] txf) {
        for (int i = 0; i < txf.length; i++) {
            txf[i].setText("");
        }
    }
}
