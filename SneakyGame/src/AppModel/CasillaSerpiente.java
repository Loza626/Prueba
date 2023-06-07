package AppModel;

public class CasillaSerpiente {

    private int id;
    private int idTablero;
    private int casilla;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTablero() {
        return idTablero;
    }

    public void setIdTablero(int idTablero) {
        this.idTablero = idTablero;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }

    public CasillaSerpiente(int id, int idTablero, int casilla) {
        this.id = id;
        this.idTablero = idTablero;
        this.casilla = casilla;
    }

    public CasillaSerpiente() {
    }
}
