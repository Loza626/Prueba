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
@Table(name = "ESCALERA")
@NamedQueries({
    @NamedQuery(name = "Escalera.findAll", query = "SELECT e FROM Escalera e"),
    @NamedQuery(name = "Escalera.findById", query = "SELECT e FROM Escalera e WHERE e.id = :id"),
    @NamedQuery(name = "Escalera.findByIdugador", query = "SELECT e FROM Escalera e WHERE e.idugador = :idugador"),
    @NamedQuery(name = "Escalera.findByNumVeces", query = "SELECT e FROM Escalera e WHERE e.numVeces = :numVeces")})
public class Escalera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Idugador")
    private int idugador;
    @Basic(optional = false)
    @Column(name = "NumVeces")
    private int numVeces;
    @JoinColumn(name = "IdCompetencia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Competencia idCompetencia;

    public Escalera() {
    }

    public Escalera(Integer id) {
        this.id = id;
    }

    public Escalera(Integer id, int idugador, int numVeces) {
        this.id = id;
        this.idugador = idugador;
        this.numVeces = numVeces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdugador() {
        return idugador;
    }

    public void setIdugador(int idugador) {
        this.idugador = idugador;
    }

    public int getNumVeces() {
        return numVeces;
    }

    public void setNumVeces(int numVeces) {
        this.numVeces = numVeces;
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
        if (!(object instanceof Escalera)) {
            return false;
        }
        Escalera other = (Escalera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Escalera[ id=" + id + " ]";
    }
    
}
