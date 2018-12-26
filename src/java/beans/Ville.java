/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author imadeddine
 */
@Entity
public class Ville {
    @Id
    @GeneratedValue
    private int id;
    private String nom;

    public Ville() {
    }

    public Ville(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Ville(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Ville{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    
    
}
