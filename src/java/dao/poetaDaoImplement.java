/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Poeta;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.NewHibernateUtil;

/**
 *
 * @author Usuario1
 */
public class poetaDaoImplement implements poetaDao{

    @Override
    public void insertarpoeta(Poeta poeta) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session= null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(poeta);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(""+e.getMessage());
            session.getTransaction().rollback();
        } finally{
            if(session != null){
                session.close();
        }
        } 
    }

    @Override
    public void modificarpoeta(Poeta poeta) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Session session= null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(poeta);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(""+e.getMessage());
            session.getTransaction().rollback();
        } finally{
            if(session != null){
                session.close();
        }
        }
    }

    @Override
    public void eliminarpoeta(Poeta poeta) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      Session session= null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(poeta);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(""+e.getMessage());
            session.getTransaction().rollback();
        } finally{
            if(session != null){
                session.close();
        }
        }
    }

    @Override
    public List<Poeta> mostrarpoeta() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Session session =null;
        List <Poeta> lista= null;
        
        try{
            session=NewHibernateUtil.getSessionFactory().openSession();
            Query query =session.createQuery("from Poeta");
            lista=(List <Poeta>) query.list();
                    
                    }catch (HibernateException e){
                        System.out.println(e.getMessage());
                    }finally {
        
            if(session != null){
                session.close();
            }
        }
        
        return lista;
    }
    
}
