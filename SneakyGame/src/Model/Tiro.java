/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "TIRO")
@NamedQueries({
    @NamedQuery(name = "Tiro.findAll", query = "SELECT t FROM Tiro t"),
    @NamedQuery(name = "Tiro.findById", query = "SELECT t FROM Tiro t WHERE t.id = :id"),
    @NamedQuery(name = "Tiro.findByIdJugador", query = "SELECT t FROM Tiro t WHERE t.idJugador = :idJugador"),
    @NamedQuery(name = "Tiro.findByNumTiros", query = "SELECT t FROM Tiro t WHERE t.numTiros = :numTiros")})
public class Tiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "IdJugador")
    private int idJugador;
    @Basic(optional = false)
    @Column(name = "NumTiros")
    private int numTiros;
    @JoinColumn(name = "IdCompentencia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Competencia idCompentencia;

    public Tiro() {
    }

    public Tiro(Integer id) {
        this.id = id;
    }

    public Tiro(Integer id, int idJugador, int numTiros) {
        this.id = id;
        this.idJugador = idJugador;
        this.numTiros = numTiros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getNumTiros() {
        return numTiros;
    }

    public void setNumTiros(int numTiros) {
        this.numTiros = numTiros;
    }

    public Competencia getIdCompentencia() {
        return idCompentencia;
    }

    public void setIdCompentencia(Competencia idCompentencia) {
        this.idCompentencia = idCompentencia;
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
        if (!(object instanceof Tiro)) {
            return false;
        }
        Tiro other = (Tiro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Tiro[ id=" + id + " ]";
    }
    
}
