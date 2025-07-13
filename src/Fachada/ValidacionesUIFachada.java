package Fachada;

import Modelo.Entidad;
import java.awt.Component;
import java.awt.Container;
import java.util.LinkedList;
import javax.swing.JTextField;
import java.util.Set;
import javax.swing.JTable;

public class ValidacionesUIFachada {

    public static boolean comprobarSeleccion(int filaSeleccionada) {
        if (filaSeleccionada >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean comprobarCasillas(Container contenedor, Set<Component> excluidos) {
        for (Component comp : contenedor.getComponents()) {
            if (excluidos.contains(comp)) {
                continue;
            }

            if (comp instanceof JTextField campo) {
                if (campo.getText().trim().isEmpty()) {
                    return false;
                }
            } else if (comp instanceof Container sub) {
                if (!comprobarCasillas(sub, excluidos)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void resetearFormulario(Container contenedor) {
        for (Component comp : contenedor.getComponents()) {
            if (comp instanceof JTextField campo) {
                campo.setText("");
            } else if (comp instanceof Container sub) {
                resetearFormulario(sub);
            }
        }
    }

    public static void selecionRegistro(JTextField[] txfs, JTable tabla) {
        int filaElgda = tabla.getSelectedRow();
        if (filaElgda >= 0) {
            for (int i = 0; i < txfs.length; i++) {
                txfs[i].setText((String) tabla.getValueAt(filaElgda, i));
            }
        }
    }

    public static boolean verificarCodigoDuplicado(LinkedList<Entidad> lista, String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (codigo.equalsIgnoreCase(lista.get(i).getId())) {
                return false;
            }
        }
        return true;
    }

}
