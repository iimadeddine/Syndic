/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Dell
 */
@Entity
public class Immeuble {
    @Id
    @GeneratedValue
    private int id ;
    private String nom ; 
    @Column(unique = true)
    private int num ; 
    private String adresse ;
    private String codePostale ;
    @OneToMany(mappedBy = "immeuble", fetch = FetchType.EAGER)
    List<Appartement> appartement;
    @ManyToOne
    private Quartier quartier;
    private int etage;

    public Immeuble() {
    }

    public Immeuble(String nom, int num, String adresse, String codePostale, List<Appartement> appartement, Quartier quartier, int etage) {
        this.nom = nom;
        this.num = num;
        this.adresse = adresse;
        this.codePostale = codePostale;
        this.appartement = appartement;
        this.quartier = quartier;
        this.etage = etage;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }
    
    
    public Immeuble(int id, String nom, int num, String adresse, String codePostale, List<Appartement> appartement, Quartier quartier, int etage) {
        this.id = id;
        this.nom = nom;
        this.num = num;
        this.adresse = adresse;
        this.codePostale = codePostale;
        this.appartement = appartement;
        this.quartier = quartier;
        this.etage=etage;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public List<Appartement> getAppartement() {
        return appartement;
    }

    public void setAppartement(List<Appartement> appartement) {
        this.appartement = appartement;
    }

    @Override
    public String toString() {
        return "Immeuble{" + "id=" + id + ", nom=" + nom + ", num=" + num + ", adresse=" + adresse + ", codePostale=" + codePostale + ", appartement=" + appartement + ", quartier=" + quartier + ", etage=" + etage + '}';
    }
    
    
    

    
    
    
    
}
