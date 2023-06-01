package AppModel;

public class Escalera {

    private int id;
    private int idCompetencia;
    private int idJugador;
    private int numtVeces;

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

    public int getNumtVeces() {
        return numtVeces;
    }

    public void setNumtVeces(int numtVeces) {
        this.numtVeces = numtVeces;
    }

    public Escalera(int id, int idCompetencia, int idJugador, int numtVeces) {
        this.id = id;
        this.idCompetencia = idCompetencia;
        this.idJugador = idJugador;
        this.numtVeces = numtVeces;
    }

    public Escalera() {
    }

}
