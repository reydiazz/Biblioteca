package Modelo;

public class Entidad {

    protected String id = "";

    protected Entidad(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
