/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Dell
 */
@Entity
public class Quartier {
    @Id
    @GeneratedValue
    private int id;
    private String nom;
     @OneToMany(mappedBy = "quartier", fetch = FetchType.EAGER)
    List<Immeuble> immeuble;

    public Quartier() {
    }

    public Quartier(int id, String nom) {
        this.id = id;
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
        return "Quartier{" + "nom=" + nom + '}';
    }
    
    
    
    

    
}
