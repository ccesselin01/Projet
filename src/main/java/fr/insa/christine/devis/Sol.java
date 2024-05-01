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
class Sol {
    private int idSol ;
    private List<Coin> listeCoins ;
    private List<Revetement> listeRevetement ;

    // constructeurs
    public Sol(int idSol, List<Coin> listeCoins, List<Revetement> listeRevetement) { // on veut plutôt définir un sol par un revêtement et pas une liste?
        this.idSol = idSol;
        this.listeCoins = listeCoins;
        this.listeRevetement = listeRevetement;
    }
    public Sol(int idSol, List<Coin> listeCoins) {
        this.idSol = idSol;
        this.listeCoins = listeCoins;
        this.listeRevetement = null; // à changer
    }
// getter
    public int getIdSol() {
        return idSol;
    }

    public List<Coin> getListeCoins() {
        return listeCoins;
    }

    public List<Revetement> getListeRevetement() {
        return listeRevetement;
    }
    
    // faut creer une méthode pour calculer la surface et montant du revetement

    @Override
    public String toString() {
        return "Sol{" + "idSol=" + idSol + ", listeCoins=" + listeCoins + ", listeRevetement=" + listeRevetement + '}';
    }
    
    
    
    
}
