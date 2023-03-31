/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Poema;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.NewHibernateUtil;

/**
 *
 * @author Usuario1
 */
public class poemaDaoImplement implements poemaDao{

    @Override
    public void insertarpoema(Poema poema) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      Session session= null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(poema);
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
    public void modificarpoema(Poema poema) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session= null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(poema);
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
    public void eliminarpoema(Poema poema) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Session session= null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(poema);
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
    public List<Poema> mostrarpoema() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Session session =null;
        List <Poema> lista= null;
        
        try{
            session=NewHibernateUtil.getSessionFactory().openSession();
            Query query =session.createQuery("from Poema");
            lista=(List <Poema>) query.list();
                    
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
