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
public class Niveau {
    
    private int idNiveau ;
    private double hauteurSousPlafond ;
    private List<Appartement> listeApparts ; // pas nécessaire? on admet 1 appart = 1 niveau ? => plutôt à écrire dans la classe Appartement

    public Niveau(int idNiveau, double hauteurSousPlafond, List<Appartement> listeApparts) {
        this.idNiveau = idNiveau;
        this.hauteurSousPlafond = hauteurSousPlafond;
        this.listeApparts = listeApparts;
    }

    public int getIdNiveau() {
        return idNiveau;
    }

    public double getHauteurSousPlafond() {
        return hauteurSousPlafond;
    }

    public List<Appartement> getListeApparts() {
        return listeApparts;
    }

    @Override
    public String toString() {
        return "Niveau{" + "idNiveau=" + idNiveau + ", hauteurSousPlafond=" + hauteurSousPlafond + ", listeApparts=" + listeApparts + '}';
    }
    
    // méthode surface + montant
    
}
