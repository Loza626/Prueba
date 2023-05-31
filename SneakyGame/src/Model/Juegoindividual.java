/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "JUEGOINDIVIDUAL")
@NamedQueries({
    @NamedQuery(name = "Juegoindividual.findAll", query = "SELECT j FROM Juegoindividual j"),
    @NamedQuery(name = "Juegoindividual.findById", query = "SELECT j FROM Juegoindividual j WHERE j.id = :id"),
    @NamedQuery(name = "Juegoindividual.findByInicio", query = "SELECT j FROM Juegoindividual j WHERE j.inicio = :inicio"),
    @NamedQuery(name = "Juegoindividual.findByFin", query = "SELECT j FROM Juegoindividual j WHERE j.fin = :fin"),
    @NamedQuery(name = "Juegoindividual.findByEscaleras", query = "SELECT j FROM Juegoindividual j WHERE j.escaleras = :escaleras"),
    @NamedQuery(name = "Juegoindividual.findBySerpientes", query = "SELECT j FROM Juegoindividual j WHERE j.serpientes = :serpientes"),
    @NamedQuery(name = "Juegoindividual.findByTiros", query = "SELECT j FROM Juegoindividual j WHERE j.tiros = :tiros")})
public class Juegoindividual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
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
    @Column(name = "Escaleras")
    private int escaleras;
    @Basic(optional = false)
    @Column(name = "Serpientes")
    private int serpientes;
    @Basic(optional = false)
    @Column(name = "Tiros")
    private int tiros;
    @JoinColumn(name = "IdFicha", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Ficha idFicha;
    @JoinColumn(name = "Idjugador", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Jugador idjugador;
    @JoinColumn(name = "IdTablero", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Tablero idTablero;

    public Juegoindividual() {
    }

    public Juegoindividual(Integer id) {
        this.id = id;
    }

    public Juegoindividual(Integer id, Date inicio, Date fin, int escaleras, int serpientes, int tiros) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
        this.escaleras = escaleras;
        this.serpientes = serpientes;
        this.tiros = tiros;
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

    public Ficha getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Ficha idFicha) {
        this.idFicha = idFicha;
    }

    public Jugador getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(Jugador idjugador) {
        this.idjugador = idjugador;
    }

    public Tablero getIdTablero() {
        return idTablero;
    }

    public void setIdTablero(Tablero idTablero) {
        this.idTablero = idTablero;
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
        if (!(object instanceof Juegoindividual)) {
            return false;
        }
        Juegoindividual other = (Juegoindividual) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Juegoindividual[ id=" + id + " ]";
    }
    
}
