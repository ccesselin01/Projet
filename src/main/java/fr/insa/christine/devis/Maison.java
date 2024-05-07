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
public class Maison extends Batiment {

    public Maison(List<Niveau> listeNiveaux, int nbetages) { // on admet nb niveaux = 1 ou pas? sinon aucune différence avec immeuble
        super(listeNiveaux, nbetages);
    }
    
    public Maison (int nbetages){
        super(nbetages);
    }
}
