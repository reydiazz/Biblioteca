
package Modelo;


public class Libro {
    private long codigoLibro;
    private String titulo;
    private String autor;
    private String genero;
    private int numeroCopias;
    private String edicion;

    public Libro(long codigoLibro, String titulo, String autor, String genero, int numeroCopias, String edicion) {
        this.codigoLibro = codigoLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroCopias = numeroCopias;
        this.edicion = edicion;
    }
    
    public long getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(long codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    
}
