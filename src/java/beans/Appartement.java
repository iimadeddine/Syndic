/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dell
 */
@Entity
public class Appartement {
    
    @Id
    @GeneratedValue
    private int id ;
    @Column(unique = true)
    private String num ;
    @ManyToOne
    private Immeuble immeuble ;
    private int etage;

    public Appartement() {
    }

    public Appartement(String num, Immeuble immeuble, int etage) {
        this.num = num;
        this.immeuble = immeuble;
        this.etage = etage;
    }

    public Appartement(int id, String num, Immeuble immeuble, int etage) {
        this.id = id;
        this.num = num;
        this.immeuble = immeuble;
        this.etage = etage;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    

    public Immeuble getImmeuble() {
        return immeuble;
    }

    public void setImmeuble(Immeuble immeuble) {
        this.immeuble = immeuble;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

 

    
    

}
