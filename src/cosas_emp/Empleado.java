
package cosas_emp;

import java.io.Serializable;

public class Empleado implements Serializable{
    protected int id, hT, edad;
    protected float pH;
    protected String nom, ape;

    public Empleado(int id, String nom, String ape, int edad, int hT, float pH) {
        this.id = id;
        this.hT = hT;
        this.edad = edad;
        this.pH = pH;
        this.nom = nom;
        this.ape = ape;
    }

    public int getId() {
        return id;
    }

    public int gethT() {
        return hT;
    }

    public int getEdad() {
        return edad;
    }

    public float getpH() {
        return pH;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sethT(int hT) {
        this.hT = hT;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
}
