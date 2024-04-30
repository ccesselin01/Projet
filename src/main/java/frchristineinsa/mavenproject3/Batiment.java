/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frchristineinsa.mavenproject3;

import java.util.List;

/**
 *
 * @author cesse
 */
public abstract class Batiment {
    private String idBatiment ;
    private List<Niveau> listeNiveaux ;

    public Batiment(String idBatiment, List<Niveau> listeNiveaux) {
        this.idBatiment = idBatiment;
        this.listeNiveaux = listeNiveaux;
    }

    public String getIdBatiment() {
        return idBatiment;
    }

    public List<Niveau> getListeNiveaux() {
        return listeNiveaux;
    }
    
    // test
    
}
