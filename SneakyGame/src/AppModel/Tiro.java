package AppModel;

public class Tiro {

    private int id;
    private int idCompetencia;
    private int idJugador;
    private int numtTiros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(int idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getNumtTiros() {
        return numtTiros;
    }

    public void setNumtTiros(int numtTiros) {
        this.numtTiros = numtTiros;
    }

    public Tiro(int id, int idCompetencia, int idJugador, int numtTiros) {
        this.id = id;
        this.idCompetencia = idCompetencia;
        this.idJugador = idJugador;
        this.numtTiros = numtTiros;
    }

    public Tiro() {
    }
}
