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
public class Mur {
    private int idm;
    private Coin cd;
    private Coin cf;
    private int nbPortes;
    private int nbFenetres;
    private List<Revetement> listeRevetement; 
    private Piece piece ; // un mur est caractérisé par la pièce (ou les pièces) à laquelle il appartient

//constructeur
    public Mur(int idm, Coin cd, Coin cf) {
        this.idm = idm;
        this.cd = cd;
        this.cf = cf;
    }
// getter pour les coins et l'identifiant
    public int getIdm() {
        return idm;
    }

    public Coin getCd() {
        return cd;
    }

    public Coin getCf() {
        return cf;
    }
    // getter pour la piece

    public Piece getPiece() {
        return piece;
    }
    // setter pour modifier le nombre de portes et fenêtres

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public void setNbFenetres(int nbFenetres) {
        this.nbFenetres = nbFenetres;
    }
    
    
 // afficher (toutes les info)

    @Override
    public String toString() {
        return "Mur{" + "idm=" + idm + ", cd=" + cd + ", cf=" + cf + ", nbPortes=" + nbPortes + ", nbFenetres=" + nbFenetres + ", listeRevetement=" + listeRevetement + '}';
    }
    
 // calcul de longueur puis surface du mur
    public double longueur() {
    return Math.sqrt(Math.pow(cf.getX() - cd.getX(), 2) + Math.pow(cf.getY() - cd.getY(), 2));
}

public double surface(double hauteur) {
    return longueur()* hauteur;
}
// sert à qlch ?
 public String getCoordonneesCoins() {
        return "Coordonnées du coin 1 : (" + cd.getX() + ", " + cd.getY() + ")\n" +
               "Coordonnées du coin 2 : (" + cf.getX() + ", " + cf.getY() + ")";
   }

   // setter piece : sert pour la méthode add dans la classe Piece

    void setPiece(Piece piece) {
        this.piece = piece;
    }
 
 
   
    
}
