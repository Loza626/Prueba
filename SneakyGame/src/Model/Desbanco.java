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
@Table(name = "DESBANCO")
@NamedQueries({
    @NamedQuery(name = "Desbanco.findAll", query = "SELECT d FROM Desbanco d"),
    @NamedQuery(name = "Desbanco.findById", query = "SELECT d FROM Desbanco d WHERE d.id = :id"),
    @NamedQuery(name = "Desbanco.findByIdJugador", query = "SELECT d FROM Desbanco d WHERE d.idJugador = :idJugador"),
    @NamedQuery(name = "Desbanco.findByCantVeces", query = "SELECT d FROM Desbanco d WHERE d.cantVeces = :cantVeces")})
public class Desbanco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "IdJugador")
    private int idJugador;
    @Basic(optional = false)
    @Column(name = "CantVeces")
    private int cantVeces;
    @JoinColumn(name = "IdCompetencia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Competencia idCompetencia;

    public Desbanco() {
    }

    public Desbanco(Integer id) {
        this.id = id;
    }

    public Desbanco(Integer id, int idJugador, int cantVeces) {
        this.id = id;
        this.idJugador = idJugador;
        this.cantVeces = cantVeces;
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

    public int getCantVeces() {
        return cantVeces;
    }

    public void setCantVeces(int cantVeces) {
        this.cantVeces = cantVeces;
    }

    public Competencia getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Competencia idCompetencia) {
        this.idCompetencia = idCompetencia;
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
        if (!(object instanceof Desbanco)) {
            return false;
        }
        Desbanco other = (Desbanco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Desbanco[ id=" + id + " ]";
    }
    
}
