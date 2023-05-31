/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "FICHA")
@NamedQueries({
    @NamedQuery(name = "Ficha.findAll", query = "SELECT f FROM Ficha f"),
    @NamedQuery(name = "Ficha.findById", query = "SELECT f FROM Ficha f WHERE f.id = :id"),
    @NamedQuery(name = "Ficha.findByImagen", query = "SELECT f FROM Ficha f WHERE f.imagen = :imagen")})
public class Ficha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Imagen")
    private String imagen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ficha")
    private Collection<Competencia> competenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ficha1")
    private Collection<Competencia> competenciaCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ficha")
    private Collection<Juegoindividual> juegoindividualCollection;

    public Ficha() {
    }

    public Ficha(Integer id) {
        this.id = id;
    }

    public Ficha(Integer id, String imagen) {
        this.id = id;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Collection<Competencia> getCompetenciaCollection() {
        return competenciaCollection;
    }

    public void setCompetenciaCollection(Collection<Competencia> competenciaCollection) {
        this.competenciaCollection = competenciaCollection;
    }

    public Collection<Competencia> getCompetenciaCollection1() {
        return competenciaCollection1;
    }

    public void setCompetenciaCollection1(Collection<Competencia> competenciaCollection1) {
        this.competenciaCollection1 = competenciaCollection1;
    }

    public Collection<Juegoindividual> getJuegoindividualCollection() {
        return juegoindividualCollection;
    }

    public void setJuegoindividualCollection(Collection<Juegoindividual> juegoindividualCollection) {
        this.juegoindividualCollection = juegoindividualCollection;
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
        if (!(object instanceof Ficha)) {
            return false;
        }
        Ficha other = (Ficha) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Ficha[ id=" + id + " ]";
    }
    
}
