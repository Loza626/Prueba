package AppModel;

public class Desbanco {

    private int id;
    private int idCompetencia;
    private int idJugador;
    private int cantVeces;

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

    public int getCantVeces() {
        return cantVeces;
    }

    public void setCantVeces(int cantVeces) {
        this.cantVeces = cantVeces;
    }

    public Desbanco(int id, int idCompetencia, int idJugador, int cantVeces) {
        this.id = id;
        this.idCompetencia = idCompetencia;
        this.idJugador = idJugador;
        this.cantVeces = cantVeces;
    }

    public Desbanco() {
    }

}
