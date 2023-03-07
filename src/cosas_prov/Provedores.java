package cosas_prov;

import java.io.Serializable;

public class Provedores implements Serializable{
    protected int id;
    protected String nombre, apellido, marca;
    protected float cT, tot;

    public Provedores(int id, String nombre, String apellido, String marca, float cT, float tot) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.marca = marca;
        this.cT = cT;
        this.tot = tot;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMarca() {
        return marca;
    }

    public float getcT() {
        return cT;
    }
    
    public float gettot() {
        return tot;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setcT(float cT) {
        this.cT = cT;
    }
    
    public void settot(float tot) {
        this.tot = tot;
    }
}
