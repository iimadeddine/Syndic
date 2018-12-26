/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Appartement;
import dao.IDao;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Dell
 */
public class AppartementService implements  IDao<Appartement>{
     @Override
    public void create(Appartement o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Appartement findById(int id) {
        Appartement c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = (Appartement) session.get(Appartement.class, id);
        session.getTransaction().commit();
        session.close();
        return c;
    }

    @Override
    public void update(Appartement o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Appartement o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Appartement> findAll() {
        List<Appartement> certificat = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        certificat = session.createQuery("From Appartement").list();
        session.getTransaction().commit();
        session.close();
        return certificat;
    }

    
}
