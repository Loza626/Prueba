/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "COMPETENCIA")
@NamedQueries({
    @NamedQuery(name = "Competencia.findAll", query = "SELECT c FROM Competencia c"),
    @NamedQuery(name = "Competencia.findById", query = "SELECT c FROM Competencia c WHERE c.id = :id"),
    @NamedQuery(name = "Competencia.findByInicio", query = "SELECT c FROM Competencia c WHERE c.inicio = :inicio"),
    @NamedQuery(name = "Competencia.findByFin", query = "SELECT c FROM Competencia c WHERE c.fin = :fin"),
    @NamedQuery(name = "Competencia.findByIdJugadorGanador", query = "SELECT c FROM Competencia c WHERE c.idJugadorGanador = :idJugadorGanador"),
    @NamedQuery(name = "Competencia.findByFichaJugadorUno", query = "SELECT c FROM Competencia c WHERE c.fichaJugadorUno = :fichaJugadorUno")})
public class Competencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicio;
    @Basic(optional = false)
    @Column(name = "Fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fin;
    @Basic(optional = false)
    @Column(name = "IdJugadorGanador")
    private int idJugadorGanador;
    @Basic(optional = false)
    @Column(name = "FichaJugadorUno")
    private int fichaJugadorUno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "competencia")
    private Collection<Tiro> tiroCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "competencia")
    private Collection<Escalera> escaleraCollection;
    @JoinColumn(name = "IdFichaJugadorDos", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Ficha ficha;
    @JoinColumn(name = "IdFichaJugadorUno", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Ficha ficha1;
    @JoinColumn(name = "IdJugadorUno", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Jugador jugador;
    @JoinColumn(name = "IdJugadorDos", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Jugador jugador1;
    @JoinColumn(name = "IdTablero", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Tablero tablero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "competencia")
    private Collection<Desbanco> desbancoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "competencia")
    private Collection<Serpiente> serpienteCollection;

    public Competencia() {
    }

    public Competencia(Integer id) {
        this.id = id;
    }

    public Competencia(Integer id, Date inicio, Date fin, int idJugadorGanador, int fichaJugadorUno) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
        this.idJugadorGanador = idJugadorGanador;
        this.fichaJugadorUno = fichaJugadorUno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getFichaJugadorUno() {
        return fichaJugadorUno;
    }

    public void setFichaJugadorUno(int fichaJugadorUno) {
        this.fichaJugadorUno = fichaJugadorUno;
    }

    public Collection<Tiro> getTiroCollection() {
        return tiroCollection;
    }

    public void setTiroCollection(Collection<Tiro> tiroCollection) {
        this.tiroCollection = tiroCollection;
    }

    public Collection<Escalera> getEscaleraCollection() {
        return escaleraCollection;
    }

    public void setEscaleraCollection(Collection<Escalera> escaleraCollection) {
        this.escaleraCollection = escaleraCollection;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Ficha getFicha1() {
        return ficha1;
    }

    public void setFicha1(Ficha ficha1) {
        this.ficha1 = ficha1;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Collection<Desbanco> getDesbancoCollection() {
        return desbancoCollection;
    }

    public void setDesbancoCollection(Collection<Desbanco> desbancoCollection) {
        this.desbancoCollection = desbancoCollection;
    }

    public Collection<Serpiente> getSerpienteCollection() {
        return serpienteCollection;
    }

    public void setSerpienteCollection(Collection<Serpiente> serpienteCollection) {
        this.serpienteCollection = serpienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Competencia)) {
            return false;
        }
        Competencia other = (Competencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Competencia[ id=" + id + " ]";
    }
    
}
