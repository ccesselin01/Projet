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
class Plafond {
    private int idPlafond ;
    private List<Coin> listeCoins ;
    private List<Revetement> listeRevetement ;
    
   // constructeurs

    public Plafond(int idPlafond, List<Coin> listeCoins, List<Revetement> listeRevetement) { // à revoir (liste?)
        this.idPlafond = idPlafond;
        this.listeCoins = listeCoins;
        this.listeRevetement = listeRevetement;
    }
    public Plafond(int idPlafond, List<Coin> listeCoins) {
        this.idPlafond = idPlafond;
        this.listeCoins = listeCoins;
        this.listeRevetement = null; // à changer, pareil pour Sol
    }
    
    // getter
    public int getIdPlafond() {
        return idPlafond;
    }

    public List<Coin> getListeCoins() {
        return listeCoins;
    }

    public List<Revetement> getListeRevetement() {
        return listeRevetement;
    }
    // to String
    
    @Override
    public String toString() {
        return "Plafond{" + "idPlafond=" + idPlafond + ", listeCoins=" + listeCoins + ", listeRevetement=" + listeRevetement + '}';
    }
    
    // méthode surface plafond + montant revetment
}
