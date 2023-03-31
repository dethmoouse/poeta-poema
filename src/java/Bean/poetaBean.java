/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import dao.poetaDao;
import dao.poetaDaoImplement;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Poeta;

/**
 *
 * @author Usuario1
 */
@ManagedBean
@ViewScoped
public class poetaBean {
  
  private Poeta poeta;
  private List<Poeta> poetas;

    public Poeta getPoeta() {
        return poeta;
    }

    public void setPoeta(Poeta poeta) {
        this.poeta = poeta;
    }

    public List<Poeta> getPoetas() {
          poetaDao dao = new poetaDaoImplement();
        poetas= dao.mostrarpoeta();
        return poetas;
    }

    public void setPoetas(List<Poeta> poetas) {
        this.poetas = poetas;
    }
    
    
  
       public void addMessage(String sumary){
        FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO, sumary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    
    }
  
      public void insertar(){
   poetaDao dao= new poetaDaoImplement();
       dao.insertarpoeta(poeta);
          poeta=new Poeta();
        addMessage("Poeta agregado");
    }
    
    public void modificar(){
       poetaDao dao= new poetaDaoImplement();
       dao.modificarpoeta(poeta);
       poeta=new Poeta();
        addMessage("Poeta modificado");
    }
    
    public void eliminar(){
       poetaDao dao= new poetaDaoImplement();
       dao.eliminarpoeta(poeta);
       poeta=new Poeta();
        addMessage("Poeta eliminado");
    }
  
  

  public poetaBean() {
          poeta=new Poeta();
    }
    
}
