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
@Table(name = "SERPIENTE")
@NamedQueries({
    @NamedQuery(name = "Serpiente.findAll", query = "SELECT s FROM Serpiente s"),
    @NamedQuery(name = "Serpiente.findById", query = "SELECT s FROM Serpiente s WHERE s.id = :id"),
    @NamedQuery(name = "Serpiente.findByIdJugador", query = "SELECT s FROM Serpiente s WHERE s.idJugador = :idJugador"),
    @NamedQuery(name = "Serpiente.findByCantVeces", query = "SELECT s FROM Serpiente s WHERE s.cantVeces = :cantVeces")})
public class Serpiente implements Serializable {

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
    @JoinColumn(name = "IdCompentencia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Competencia competencia;

    public Serpiente() {
    }

    public Serpiente(Integer id) {
        this.id = id;
    }

    public Serpiente(Integer id, int idJugador, int cantVeces) {
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

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
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
        if (!(object instanceof Serpiente)) {
            return false;
        }
        Serpiente other = (Serpiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Serpiente[ id=" + id + " ]";
    }
    
}
