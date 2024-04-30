/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frchristineinsa.mavenproject3;

/**
 *
 * @author cesse
 */
public abstract class Ouverture {
    private int idOuverture ;
    private double dimX ;
    private double dimY ;
    
// constructeur
    public Ouverture(int idOuverture, double dimX, double dimY) {
        this.idOuverture = idOuverture;
        this.dimX = dimX;
        this.dimY = dimY;
    }
    
// getter

    public int getIdOuverture() {
        return idOuverture;
    }

    public double getDimX() {
        return dimX;
    }

    public double getDimY() {
        return dimY;
    }
    
    // to String

    @Override
    public String toString() {
        return "Ouverture{" + "idOuverture=" + idOuverture + ", dimX=" + dimX + ", dimY=" + dimY + '}';
    }
    
    // méthode calcul surface de l'ouverture ...
    
}
