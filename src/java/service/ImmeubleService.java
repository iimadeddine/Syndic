/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Immeuble;
import beans.Immeuble;
import dao.IDao;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Dell
 */
public class ImmeubleService implements IDao<Immeuble> {
      @Override
    public void create(Immeuble o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Immeuble findById(int id) {
        Immeuble c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = (Immeuble) session.get(Immeuble.class, id);
        session.getTransaction().commit();
        session.close();
        return c;
    }

    @Override
    public void update(Immeuble o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Immeuble o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Immeuble> findAll() {
        List<Immeuble> certificat = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        certificat = session.createQuery("From Immeuble").list();
        session.getTransaction().commit();
        session.close();
        return certificat;
    }

    
    
}
