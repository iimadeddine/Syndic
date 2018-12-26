/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Quartier;
import beans.Quartier;
import dao.IDao;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Dell
 */
public class QuartierService implements IDao<Quartier>{
    
      @Override
    public void create(Quartier o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Quartier findById(int id) {
        Quartier c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = (Quartier) session.get(Quartier.class, id);
        session.getTransaction().commit();
        session.close();
        return c;
    }

    @Override
    public void update(Quartier o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Quartier o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Quartier> findAll() {
        List<Quartier> certificat = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        certificat = session.createQuery("From Quartier").list();
        session.getTransaction().commit();
        session.close();
        return certificat;
    }

    
    
}
