/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frchristineinsa.mavenproject3;

/**
 *
 * @author cesse
 */
public class Coin {
    private int id;
    private double x;
    private double y;

    // constructeur

    public Coin(int id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
// afficher l'identifiant
    public int getId() {
        return id;
    }
// modifier l'identifiant
    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coin{" + "id=" + id + ", x=" + x + ", y=" + y + '}';
    }
}
