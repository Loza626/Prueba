package AppModel;

public class Tablero {

    private int id;
    private String ImagenTable;
    private int totalCasillas;
    private int casillasSerpientes;
    private int casillasEscaleras;

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

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public void setTotalCasillas(int totalCasillas) {
        this.totalCasillas = totalCasillas;
    }

    public int getCasillasSerpientes() {
        return casillasSerpientes;
    }

    public void setCasillasSerpientes(int casillasSerpientes) {
        this.casillasSerpientes = casillasSerpientes;
    }

    public int getCasillasEscaleras() {
        return casillasEscaleras;
    }

    public void setCasillasEscaleras(int casillasEscaleras) {
        this.casillasEscaleras = casillasEscaleras;
    }

    public Tablero(int id, String ImagenTable, int totalCasillas, int casillasSerpientes, int casillasEscaleras) {
        this.id = id;
        this.ImagenTable = ImagenTable;
        this.totalCasillas = totalCasillas;
        this.casillasSerpientes = casillasSerpientes;
        this.casillasEscaleras = casillasEscaleras;
    }

    public Tablero() {
    }

}
