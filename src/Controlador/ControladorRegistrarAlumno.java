package Controlador;

import Command.CerrarCommand;
import Command.MinimizarCommand;
import Factory.AvisoFactory;
import Modelo.Alumno;
import Modelo.Conexion;
import Modelo.DAO.RegistrarAlumnoDAO;
import Modelo.Personalizacion;
import Vista.Aviso;
import Vista.Login;
import Vista.MenuPrincipal;
import Vista.RegistrarAlumno;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ControladorRegistrarAlumno {

    private final RegistrarAlumno ventanaRegistrarAlumno;
    private RegistrarAlumnoDAO r;
    private Alumno a;

    public ControladorRegistrarAlumno(RegistrarAlumno ventanaRegistrarAlumno) {
        this.ventanaRegistrarAlumno = ventanaRegistrarAlumno;
        r = new RegistrarAlumnoDAO(Conexion.getConexion());
    }

    public void iniciarMenuRegistrarAlumno() {
        JButton[] btn = {ventanaRegistrarAlumno.btn_eliminar, ventanaRegistrarAlumno.btn_modificar, ventanaRegistrarAlumno.btn_registrar};
        JTextField[] txf = {ventanaRegistrarAlumno.txf_codigo, ventanaRegistrarAlumno.txf_nombre, ventanaRegistrarAlumno.txf_apellido, ventanaRegistrarAlumno.txf_nivel, ventanaRegistrarAlumno.txf_grado, ventanaRegistrarAlumno.txf_seccion};

        JTextField[] txfs = {ventanaRegistrarAlumno.txf_codigo, ventanaRegistrarAlumno.txf_nombre, ventanaRegistrarAlumno.txf_apellido, ventanaRegistrarAlumno.txf_nivel, ventanaRegistrarAlumno.txf_grado, ventanaRegistrarAlumno.txf_seccion, ventanaRegistrarAlumno.txf_buscador};

        new Personalizacion(ventanaRegistrarAlumno, ventanaRegistrarAlumno.pn_toolbar, txfs, btn, ventanaRegistrarAlumno.tbl_tablaAlumnos);

        ventanaRegistrarAlumno.setVisible(true);

        actualizarRegistros(r.recojerAlumnos());

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(ventanaRegistrarAlumno.tbl_tablaAlumnos.getModel());
        ventanaRegistrarAlumno.tbl_tablaAlumnos.setRowSorter(sorter);

        ventanaRegistrarAlumno.txf_buscador.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                filtrar();
            }

            public void removeUpdate(DocumentEvent e) {
                filtrar();
            }

            public void changedUpdate(DocumentEvent e) {
                filtrar();
            }

            private void filtrar() {
                String texto = ventanaRegistrarAlumno.txf_buscador.getText();
                if (texto.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 1));
                }
            }
        });

        ventanaRegistrarAlumno.tbl_tablaAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selecionRegistro(txf);
            }
        });

        ventanaRegistrarAlumno.btn_registrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if ((verificarCodigoDuplicado(r.recojerAlumnos(), ventanaRegistrarAlumno.txf_codigo.getText()))) {
                    if (comprobarCasillas(txf)) {
                        if (r.registrarAlumno(verificarFormulario(a, txf))) {
                            actualizarRegistros(r.recojerAlumnos());

                            // Factory
                            Aviso a = AvisoFactory.crearAviso(ventanaRegistrarAlumno, true, "OK");
                            a.setVisible(true);
                            refrescarFormulario(txf);
                        }
                    }
                }

            }
        });

        ventanaRegistrarAlumno.btn_modificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    if (r.modificarAlumno(new Alumno(ventanaRegistrarAlumno.txf_codigo.getText(), ventanaRegistrarAlumno.txf_nombre.getText(), ventanaRegistrarAlumno.txf_apellido.getText(), ventanaRegistrarAlumno.txf_nivel.getText(), Integer.parseInt(ventanaRegistrarAlumno.txf_grado.getText()), ventanaRegistrarAlumno.txf_seccion.getText().charAt(0)), (String) ventanaRegistrarAlumno.tbl_tablaAlumnos.getValueAt(ventanaRegistrarAlumno.tbl_tablaAlumnos.getSelectedRow(), 0))) {
                        actualizarRegistros(r.recojerAlumnos());

                        // Factory
                        Aviso a = AvisoFactory.crearAviso(ventanaRegistrarAlumno, true, "MODIFICADO");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }
            }
        });

        ventanaRegistrarAlumno.btn_eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (comprobarSeleccion()) {
                    if (r.eliminarAlumno((String) ventanaRegistrarAlumno.tbl_tablaAlumnos.getValueAt(ventanaRegistrarAlumno.tbl_tablaAlumnos.getSelectedRow(), 0))) {
                        actualizarRegistros(r.recojerAlumnos());

                        //Factory
                        Aviso a = AvisoFactory.crearAviso(ventanaRegistrarAlumno, true, "ELIMINADO");
                        a.setVisible(true);
                        refrescarFormulario(txf);
                    }
                }
            }
        });

        ventanaRegistrarAlumno.btn_regresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaRegistrarAlumno.dispose();
                ControladorMenuPrincipal m = new ControladorMenuPrincipal(new MenuPrincipal());
                m.iniciarMenuPrincipal();
            }
        });

        ventanaRegistrarAlumno.btn_cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new CerrarCommand(ventanaRegistrarAlumno).execute();
            }
        });

        ventanaRegistrarAlumno.btn_minimizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MinimizarCommand(ventanaRegistrarAlumno).execute();
            }
        });
    }

    public boolean comprobarSeleccion() {
        int filaElgda = ventanaRegistrarAlumno.tbl_tablaAlumnos.getSelectedRow();
        if (filaElgda >= 0) {
            return true;
        } else {

            //Factory
            Aviso a = AvisoFactory.crearAviso(ventanaRegistrarAlumno, true, "SELECCIONE");
            a.setVisible(true);
            return false;
        }
    }

    public Alumno verificarFormulario(Alumno a, JTextField[] txf) {
        try {
            a = new Alumno(ventanaRegistrarAlumno.txf_codigo.getText(), ventanaRegistrarAlumno.txf_nombre.getText(), ventanaRegistrarAlumno.txf_apellido.getText(), ventanaRegistrarAlumno.txf_nivel.getText(), Integer.parseInt(ventanaRegistrarAlumno.txf_grado.getText()), ventanaRegistrarAlumno.txf_seccion.getText().charAt(0));
            refrescarFormulario(txf);
            return a;
        } catch (NumberFormatException e) {
            if (a == null) {

                //Factory
                Aviso v = AvisoFactory.crearAviso(ventanaRegistrarAlumno, true, "XFORM");
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

                //Factory
                Aviso a = AvisoFactory.crearAviso(ventanaRegistrarAlumno, true, "VACIO");
                a.setVisible(true);
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
        DefaultTableModel modelo = (DefaultTableModel) ventanaRegistrarAlumno.tbl_tablaAlumnos.getModel();
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
                Aviso v = AvisoFactory.crearAviso(ventanaRegistrarAlumno, true, "DUPLICADO");
                v.setVisible(true);
                return false;
            }
        }
        return true;
    }

    public void selecionRegistro(JTextField[] txf) {
        int filaElgda = ventanaRegistrarAlumno.tbl_tablaAlumnos.getSelectedRow();
        if (filaElgda >= 0) {
            for (int i = 0; i < txf.length; i++) {
                txf[i].setText((String) ventanaRegistrarAlumno.tbl_tablaAlumnos.getValueAt(filaElgda, i));
            }
        }
    }

    public void refrescarFormulario(JTextField[] txf) {
        for (int i = 0; i < txf.length; i++) {
            txf[i].setText("");
        }
    }
}
