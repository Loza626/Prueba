package AppModel;

import java.util.Date;

public class JuegoIndividual {

    private int id;
    private int idJugador;
    private int idFicha;
    private int idTablero;
    private Date inicip;
    private Date fin;
    private int escaleras;
    private int serpientes;
    private int tiros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public int getIdTablero() {
        return idTablero;
    }

    public void setIdTablero(int idTablero) {
        this.idTablero = idTablero;
    }

    public Date getInicip() {
        return inicip;
    }

    public void setInicip(Date inicip) {
        this.inicip = inicip;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getEscaleras() {
        return escaleras;
    }

    public void setEscaleras(int escaleras) {
        this.escaleras = escaleras;
    }

    public int getSerpientes() {
        return serpientes;
    }

    public void setSerpientes(int serpientes) {
        this.serpientes = serpientes;
    }

    public int getTiros() {
        return tiros;
    }

    public void setTiros(int tiros) {
        this.tiros = tiros;
    }

    public JuegoIndividual(int id, int idJugador, int idFicha, int idTablero, Date inicip, Date fin, int escaleras, int serpientes, int tiros) {
        this.id = id;
        this.idJugador = idJugador;
        this.idFicha = idFicha;
        this.idTablero = idTablero;
        this.inicip = inicip;
        this.fin = fin;
        this.escaleras = escaleras;
        this.serpientes = serpientes;
        this.tiros = tiros;
    }

    public JuegoIndividual() {
    }
}
