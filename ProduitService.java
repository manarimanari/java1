/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import dao.IDao;
import ma.projet.entity.Produit;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;
import org.hibernate.HibernateException;

public class ProduitService implements IDao<Produit> {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    @Override
    public boolean create(Produit o) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
         //   session.close();
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(o);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
           // session.close();
        }
        return false;
    }

   

    @Override
    public Produit findById(int id) {
        Session session = null;
        Produit o = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            o = (Produit) session.get(Produit.class, id);
            session.getTransaction().commit();
            return o;
        } catch (HibernateException ex) {
            session.getTransaction().rollback();
        }finally{
            //session.close();
        }
        return o;
    }

    @Override
    public List<Produit> findAll() {
        Session session = null;
        List<Produit>  produits = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            produits = session.createQuery("from Produit").list();
            session.getTransaction().commit();
            return produits;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            //session.close();
        }
        return produits;
    }

}
