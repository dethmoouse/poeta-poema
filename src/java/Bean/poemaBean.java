/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.poemaDao;
import dao.poemaDaoImplement;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Poeta;
import model.Poema;


/**
 *
 * @author Usuario1
 */
@ManagedBean
@ViewScoped
public class poemaBean {
 
    private Poema poema;
    private List<Poema> poemas;
    private Integer poeta_idPoeta;

    public Poema getPoema() {
        return poema;
    }

    public void setPoema(Poema poema) {
        this.poema = poema;
    }

    public List<Poema> getPoemas() {
           poemaDao dao = new poemaDaoImplement();
        poemas=dao.mostrarpoema();
        return poemas;
    }

    public void setPoemas(List<Poema> poemas) {
        this.poemas = poemas;
    }

    public Integer getPoeta_idPoeta() {
        return poeta_idPoeta;
    }

    public void setPoeta_idPoeta(Integer poeta_idPoeta) {
        this.poeta_idPoeta = poeta_idPoeta;
    }

    
    
     public void addMessage(String sumary){
        FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO, sumary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    
    }
    
    
     
     
     
     
      public void insertar(){
          poemaDao dao=new poemaDaoImplement();
       
       Poeta mario1 = new Poeta();
       mario1.setIdPoeta(poeta_idPoeta);
       poema.setPoeta(mario1);

       dao.insertarpoema(poema);
       poema=new Poema();
       addMessage("Poema Agregado");
    }
     
      
        public void modificar(){
          poemaDao dao=new poemaDaoImplement();
       
       Poeta mario1 = new Poeta();
       mario1.setIdPoeta(poeta_idPoeta);
       poema.setPoeta(mario1);

       dao.modificarpoema(poema);
       poema=new Poema();
       addMessage("Poema Modificado");
    }
     
     
       public void eliminar(){
          poemaDao dao=new poemaDaoImplement();
       
       Poeta mario1 = new Poeta();
       mario1.setIdPoeta(poeta_idPoeta);
       poema.setPoeta(mario1);

       dao.eliminarpoema(poema);
       poema=new Poema();
       addMessage("Poema Eliminado");
    }
    
    public poemaBean() {
        poema= new Poema();
    }
    
}
