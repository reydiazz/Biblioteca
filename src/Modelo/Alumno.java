package Modelo;

public class Alumno extends Entidad {

    private String codigoAlumno;
    private String nombre;
    private String apellidoPaterno;
    private String nivel;
    private int grado;
    private char seccion;

    public Alumno(String codigoAlumno, String nombre, String apellidoPaterno, String nivel, int grado, char seccion) {
        super(codigoAlumno);
        this.codigoAlumno = codigoAlumno;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.nivel = nivel;
        this.grado = grado;
        this.seccion = seccion;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getSeccion() {
        return seccion;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return codigoAlumno + " " + nombre + " " + apellidoPaterno;
    }
}
