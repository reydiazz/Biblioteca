package Modelo;

import java.sql.Date;

public class Prestamo {

    private String nombreAlumno;
    private String nombreLibro;

    private String codigoLibro;
    private String codigoAlumno;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private int diasRestantes;

    public Prestamo(String codigoLibro, String codigoAlumno, Date fechaPrestamo, Date fechaDevolucion, int diasRestantes) {
        this.codigoLibro = codigoLibro;
        this.codigoAlumno = codigoAlumno;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.diasRestantes = diasRestantes;
    }

    public Prestamo(String codigoLibro, String nombreLibro, String codigoAlumno, String nombreAlumno, Date fecha) {
        this.codigoLibro = codigoLibro;
        this.nombreLibro = nombreLibro;
        this.codigoAlumno = codigoAlumno;
        this.nombreAlumno = nombreAlumno;
        this.fechaDevolucion = fecha;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

}
