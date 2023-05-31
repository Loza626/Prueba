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
@Table(name = "TABLERO")
@NamedQueries({
    @NamedQuery(name = "Tablero.findAll", query = "SELECT t FROM Tablero t"),
    @NamedQuery(name = "Tablero.findById", query = "SELECT t FROM Tablero t WHERE t.id = :id"),
    @NamedQuery(name = "Tablero.findByImagenTable", query = "SELECT t FROM Tablero t WHERE t.imagenTable = :imagenTable"),
    @NamedQuery(name = "Tablero.findByNombre", query = "SELECT t FROM Tablero t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tablero.findByTotalCasillas", query = "SELECT t FROM Tablero t WHERE t.totalCasillas = :totalCasillas"),
    @NamedQuery(name = "Tablero.findByCasillasSerpientes", query = "SELECT t FROM Tablero t WHERE t.casillasSerpientes = :casillasSerpientes"),
    @NamedQuery(name = "Tablero.findByCasillasEscaleras", query = "SELECT t FROM Tablero t WHERE t.casillasEscaleras = :casillasEscaleras")})
public class Tablero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ImagenTable")
    private String imagenTable;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "TotalCasillas")
    private int totalCasillas;
    @Basic(optional = false)
    @Column(name = "CasillasSerpientes")
    private int casillasSerpientes;
    @Basic(optional = false)
    @Column(name = "CasillasEscaleras")
    private int casillasEscaleras;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTablero")
    private Collection<Competencia> competenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTablero")
    private Collection<Juegoindividual> juegoindividualCollection;

    public Tablero() {
    }

    public Tablero(Integer id) {
        this.id = id;
    }

    public Tablero(Integer id, String imagenTable, String nombre, int totalCasillas, int casillasSerpientes, int casillasEscaleras) {
        this.id = id;
        this.imagenTable = imagenTable;
        this.nombre = nombre;
        this.totalCasillas = totalCasillas;
        this.casillasSerpientes = casillasSerpientes;
        this.casillasEscaleras = casillasEscaleras;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagenTable() {
        return imagenTable;
    }

    public void setImagenTable(String imagenTable) {
        this.imagenTable = imagenTable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public void setTotalCasillas(int totalCasillas) {
        this.totalCasillas = totalCasillas;
    }

    public int getCasillasSerpientes() {
        return casillasSerpientes;
    }

    public void setCasillasSerpientes(int casillasSerpientes) {
        this.casillasSerpientes = casillasSerpientes;
    }

    public int getCasillasEscaleras() {
        return casillasEscaleras;
    }

    public void setCasillasEscaleras(int casillasEscaleras) {
        this.casillasEscaleras = casillasEscaleras;
    }

    public Collection<Competencia> getCompetenciaCollection() {
        return competenciaCollection;
    }

    public void setCompetenciaCollection(Collection<Competencia> competenciaCollection) {
        this.competenciaCollection = competenciaCollection;
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
        if (!(object instanceof Tablero)) {
            return false;
        }
        Tablero other = (Tablero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Tablero[ id=" + id + " ]";
    }
    
}
