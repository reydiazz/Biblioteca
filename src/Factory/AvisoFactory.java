/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Vista.Aviso;
import javax.swing.JFrame;

public class AvisoFactory {

    public static Aviso crearAviso(JFrame parent, boolean modal, String tipo) {
        String mensaje;
        switch (tipo) {
            case "OK":
                mensaje = "Dato registrado correctamente";
                break;
            case "MODIFICADO":
                mensaje = "Dato modificado correctamente";
                break;
            case "ELIMINADO":
                mensaje = "Dato eliminado correctamente";
                break;
            case "VACIO":
                mensaje = "Complete los casilleros";
                break;
            case "ERROR":
                mensaje = "Error en la operación";
                break;
            case "ACCESO_OK":
                mensaje = "Acceso concedido";
                break;
            case "ACCESO_DENEGADO":
                mensaje = "Acceso denegado";
                break;
            case "SELECCIONE":
                mensaje = "Seleccione un registro";
                break;
            case "DUPLICADO":
                mensaje = "Código ya existente";
                break;
            case "XFORM":
                mensaje = "Complete el formulario correctamente";
                break;
            case "DEVUELTO":
                mensaje = "Libro devuelto correctamente";
                break;
            case "NO_DEVUELTO":
                mensaje = "No se pudo completar la devolución";
                break;
            default:
                mensaje = "Aviso genérico";
                break;
        }
        return new Aviso(parent, modal, mensaje);
    }
}
