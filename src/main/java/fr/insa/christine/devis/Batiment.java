/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.christine.devis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesse
 */
public abstract class Batiment {
    private String idBatiment ;
    List<Niveau> listeNiveaux ;
   
    private int nbetages ;

    public Batiment(List<Niveau> listeNiveaux, int nbetages) {
        //this.idBatiment = idBatiment;
        this.listeNiveaux = listeNiveaux;
        this.nbetages = nbetages ;
    }
    public Batiment(int nbetages){
        listeNiveaux = new ArrayList<>();
        this.nbetages = nbetages ;
    }

    public void setNbetages(int nbetages) {
        this.nbetages = nbetages;
    }

    public int getNbetages() {
        return nbetages;
    }

    

    /*public void setIdBatiment(String idBatiment) {
        this.idBatiment = idBatiment;
    }*/

    public void setListeNiveaux(List<Niveau> listeNiveaux) {
        this.listeNiveaux = listeNiveaux;
    }

    

    public String getIdBatiment() {
        return idBatiment;
    }

    public List<Niveau> getListeNiveaux() {
        return listeNiveaux;
    }
    
    
    
}
