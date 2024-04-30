/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frchristineinsa.mavenproject3;

/**
 *
 * @author cesse
 */
class Revetement {
    private int idrevetement ;
    private String designation ;
    private boolean pourMur ;
    private boolean pourSol ;
    private boolean pourPlafond ;
    private double prixUnitaire ;
    
//constructeur
    public Revetement(int idrevetement, String designation, boolean pourMur, boolean pourSol, boolean pourPlafond, double prixUnitaire) {
        this.idrevetement = idrevetement;
        this.designation = designation;
        this.pourMur = pourMur;
        this.pourSol = pourSol;
        this.pourPlafond = pourPlafond;
        this.prixUnitaire = prixUnitaire;
    }
    
 // getter

    public int getIdrevetement() {
        return idrevetement;
    }

    public String getDesignation() {
        return designation;
    }

    public boolean isPourMur() {
        return pourMur;
    }

    public boolean isPourSol() {
        return pourSol;
    }

    public boolean isPourPlafond() {
        return pourPlafond;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }
// to String
    @Override
    public String toString() {
        return "Revetement{" + "idrevetement=" + idrevetement + ", designation=" + designation + ", pourMur=" + pourMur + ", pourSol=" + pourSol + ", pourPlafond=" + pourPlafond + ", prixUnitaire=" + prixUnitaire + '}';
    }
    

}
