package model;
// Generated 05-oct-2019 19:24:31 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Poema generated by hbm2java
 */
public class Poema  implements java.io.Serializable {


     private Integer idPoema;
     private Poeta poeta;
     private String titulo;
     private String tipo;
     private Date fecha;
     private String nacionalidad;

    public Poema() {
    }

    public Poema(Poeta poeta, String titulo, String tipo, Date fecha, String nacionalidad) {
       this.poeta = poeta;
       this.titulo = titulo;
       this.tipo = tipo;
       this.fecha = fecha;
       this.nacionalidad = nacionalidad;
    }
   
    public Integer getIdPoema() {
        return this.idPoema;
    }
    
    public void setIdPoema(Integer idPoema) {
        this.idPoema = idPoema;
    }
    public Poeta getPoeta() {
        return this.poeta;
    }
    
    public void setPoeta(Poeta poeta) {
        this.poeta = poeta;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }




}


