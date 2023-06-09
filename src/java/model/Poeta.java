package model;
// Generated 05-oct-2019 19:24:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Poeta generated by hbm2java
 */
public class Poeta  implements java.io.Serializable {


     private Integer idPoeta;
     private String nombre;
     private String paterno;
     private String materno;
     private String email;
     private String pseudonimo;
     private String sexo;
     private String nacionalidad;
     private Set<Poema> poemas = new HashSet<Poema>(0);

    public Poeta() {
    }

    public Poeta(String nombre, String paterno, String materno, String email, String pseudonimo, String sexo, String nacionalidad, Set<Poema> poemas) {
       this.nombre = nombre;
       this.paterno = paterno;
       this.materno = materno;
       this.email = email;
       this.pseudonimo = pseudonimo;
       this.sexo = sexo;
       this.nacionalidad = nacionalidad;
       this.poemas = poemas;
    }
   
    public Integer getIdPoeta() {
        return this.idPoeta;
    }
    
    public void setIdPoeta(Integer idPoeta) {
        this.idPoeta = idPoeta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaterno() {
        return this.paterno;
    }
    
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {
        return this.materno;
    }
    
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPseudonimo() {
        return this.pseudonimo;
    }
    
    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Set<Poema> getPoemas() {
        return this.poemas;
    }
    
    public void setPoemas(Set<Poema> poemas) {
        this.poemas = poemas;
    }




}


