/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.christine.devis;

import java.util.List;

/**
 *
 * @author cesse
 */
public class Immeuble extends Batiment{
    
    public Immeuble( List<Niveau> listeNiveaux,int nbetages) {
        super(listeNiveaux, nbetages);
    }
    public Immeuble (int nbetages){
        super(nbetages);
    }
}
