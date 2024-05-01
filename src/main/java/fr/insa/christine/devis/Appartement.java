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
public class Appartement {
    private int idAppartement ;
    private int idNiveauAppartement ;
    private List<Piece> listePieces ;

    public Appartement(int idAppartement, int idNiveauAppartement, List<Piece> listePieces) {
        this.idAppartement = idAppartement;
        this.idNiveauAppartement = idNiveauAppartement;
        this.listePieces = listePieces;
    }

    public int getIdAppartement() {
        return idAppartement;
    }

    public int getIdNiveauAppartement() {
        return idNiveauAppartement;
    }

    public List<Piece> getListePieces() {
        return listePieces;
    }

    @Override
    public String toString() {
        return "Appartement{" + "idAppartement=" + idAppartement + ", idNiveauAppartement=" + idNiveauAppartement + ", listePieces=" + listePieces + '}';
    }
    
    // méthode surface appart + montant revetement
    
}
