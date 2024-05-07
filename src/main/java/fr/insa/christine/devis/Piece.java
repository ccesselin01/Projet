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
public class Piece {
     private int idp ;
     private Sol s ;
     private Plafond p ;
     private List<Mur> listeMurs ;
     

     //constructeur 
    public Piece(int idp, Sol s, Plafond p) {
        this.idp = idp;
        this.s = s;
        this.p = p;
        this.listeMurs = new ArrayList<>(); // tut01 -9min44 : on initialise la liste qui sera modifiée avec la méthode add
    }
// tous les getter
    public int getIdp() {
        return idp;
    }

    public Sol getS() {
        return s;
    }

    public Plafond getP() {
        return p;
    }

    public List<Mur> getListeMurs() {
        return listeMurs;
    }
// to String
    @Override
    public String toString() {
        return "Piece{" + "idp=" + idp + ", s=" + s + ", p=" + p + ", listeMurs=" + listeMurs + '}';
    }
    
// ajouter un mur à la liste des murs de la piece
    public void add (Mur m){
        if (m.getPiece()!= this){
            this.listeMurs.add(m);
            m.setPiece(this);
        }
    }
    
// méthode pour calculer surface du sol ? comment accéder aux coins des murs? le montant des revêtements?
   
// test ci dessous marche pas 
    public static Piece pieceTest(){
        Coin cd1 = new Coin(1, 10, 0);
        Coin cf1 = new Coin (2, 10,10);
        Coin cd2 = new Coin(3, 10, 5);
        Coin cf2 = new Coin(4, 5, 5);
        ArrayList<Coin> listecoins = new ArrayList<>();
        listecoins.add(cf1);
        listecoins.add(cd1);
        listecoins.add(cf2);
        listecoins.add(cd2);
        Mur m1 = new Mur(1, cd1, cf1);
        Mur m2 = new Mur (2, cd2, cf2);
        Plafond p = new Plafond (1, listecoins );
        Sol s = new Sol (1, listecoins);
        Piece chambre = new Piece(1, s, p);
        chambre.add(m2);
        chambre.add(m1);
        return chambre ;
         
    }
public static void test1(){
    System.out.println("pièce est :\n "+Piece.pieceTest());
}

public static void main (String[]args){
    test1();
    
    }
    
    
}
