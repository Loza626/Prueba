package AppModel;

public class Tablero {

    private int id;
    private String ImagenTable;
    private int numFilas;
    private int numColumnas;
    private int totalCasillas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagenTable() {
        return ImagenTable;
    }

    public void setImagenTable(String ImagenTable) {
        this.ImagenTable = ImagenTable;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public void setTotalCasillas(int totalCasillas) {
        this.totalCasillas = totalCasillas;
    }

    public Tablero(int id, String ImagenTable, int numFilas, int numColumnas, int totalCasillas) {
        this.id = id;
        this.ImagenTable = ImagenTable;
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.totalCasillas = totalCasillas;
    }

    public Tablero() {
    }

}
