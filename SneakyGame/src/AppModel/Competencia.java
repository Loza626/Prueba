package AppModel;

import java.util.Date;

public class Competencia {

    private int id;
    private int idJugadorUno;
    private int idFichaFugadorUno;
    private int idJugadorDos;
    private int idFichaFugadorDos;
    private int idTablero;
    private Date inicio;
    private Date fin;
    private int idJugadorGanador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJugadorUno() {
        return idJugadorUno;
    }

    public void setIdJugadorUno(int idJugadorUno) {
        this.idJugadorUno = idJugadorUno;
    }

    public int getIdFichaFugadorUno() {
        return idFichaFugadorUno;
    }

    public void setIdFichaFugadorUno(int idFichaFugadorUno) {
        this.idFichaFugadorUno = idFichaFugadorUno;
    }

    public int getIdJugadorDos() {
        return idJugadorDos;
    }

    public void setIdJugadorDos(int idJugadorDos) {
        this.idJugadorDos = idJugadorDos;
    }

    public int getIdFichaFugadorDos() {
        return idFichaFugadorDos;
    }

    public void setIdFichaFugadorDos(int idFichaFugadorDos) {
        this.idFichaFugadorDos = idFichaFugadorDos;
    }

    public int getIdTablero() {
        return idTablero;
    }

    public void setIdTablero(int idTablero) {
        this.idTablero = idTablero;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getIdJugadorGanador() {
        return idJugadorGanador;
    }

    public void setIdJugadorGanador(int idJugadorGanador) {
        this.idJugadorGanador = idJugadorGanador;
    }

    public Competencia(int id, int idJugadorUno, int idFichaFugadorUno, int idJugadorDos, int idFichaFugadorDos, int idTablero, Date inicio, Date fin, int idJugadorGanador) {
        this.id = id;
        this.idJugadorUno = idJugadorUno;
        this.idFichaFugadorUno = idFichaFugadorUno;
        this.idJugadorDos = idJugadorDos;
        this.idFichaFugadorDos = idFichaFugadorDos;
        this.idTablero = idTablero;
        this.inicio = inicio;
        this.fin = fin;
        this.idJugadorGanador = idJugadorGanador;
    }

    public Competencia() {
    }

}
