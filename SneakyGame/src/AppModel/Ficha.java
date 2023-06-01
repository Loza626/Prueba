package AppModel;

public class Ficha {

    private int id;
    private String imagen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Ficha(int id, String imagen) {
        this.id = id;
        this.imagen = imagen;
    }

    public Ficha() {
    }

}
