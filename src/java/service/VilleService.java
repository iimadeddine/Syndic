/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Ville;
import dao.IDao;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author imadeddine
 */
public class VilleService implements IDao<Ville> {

    @Override
    public void create(Ville o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Ville o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void update(Ville o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Ville> findAll() {
        List<Ville> villes;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        villes = session.createQuery("From Ville").list();
        session.getTransaction().commit();
        session.close();
        return villes;
    }

    @Override
    public Ville findById(int id) {
        Ville ville = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ville = (Ville) session.get(Ville.class, id);
        session.getTransaction().commit();
        session.close();
        return ville;
    }

}
