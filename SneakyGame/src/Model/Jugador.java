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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "JUGADOR")
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j"),
    @NamedQuery(name = "Jugador.findById", query = "SELECT j FROM Jugador j WHERE j.id = :id"),
    @NamedQuery(name = "Jugador.findByUsername", query = "SELECT j FROM Jugador j WHERE j.username = :username"),
    @NamedQuery(name = "Jugador.findByNombre", query = "SELECT j FROM Jugador j WHERE j.nombre = :nombre"),
    @NamedQuery(name = "Jugador.findByCorreo", query = "SELECT j FROM Jugador j WHERE j.correo = :correo"),
    @NamedQuery(name = "Jugador.findByPartidasGanadas", query = "SELECT j FROM Jugador j WHERE j.partidasGanadas = :partidasGanadas")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "PartidasGanadas")
    private int partidasGanadas;
    @Basic(optional = false)
    @Lob
    @Column(name = "Password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jugador")
    private Collection<Competencia> competenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jugador1")
    private Collection<Competencia> competenciaCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jugador")
    private Collection<Juegoindividual> juegoindividualCollection;

    public Jugador() {
    }

    public Jugador(Integer id) {
        this.id = id;
    }

    public Jugador(Integer id, String username, String nombre, String correo, int partidasGanadas, String password) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.correo = correo;
        this.partidasGanadas = partidasGanadas;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Jugador[ id=" + id + " ]";
    }

}
