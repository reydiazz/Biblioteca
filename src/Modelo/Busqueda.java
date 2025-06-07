package Modelo;

public class Busqueda {
    
    private Libro libroEncontrado;
    
    public Busqueda(Libro libroEncontrado){
        this.libroEncontrado = libroEncontrado;
    }

    public Libro getLibroEncontrado() {
        return libroEncontrado;
    }

    public void setLibroEncontrado(Libro libroEncontrado) {
        this.libroEncontrado = libroEncontrado;
    }
    
}
