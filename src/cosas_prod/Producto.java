package cosas_prod;

import java.io.Serializable;

public class Producto implements Serializable{

    protected int id, Stock;
    protected String Nombre, Categoria;
    protected float Precio;

    public Producto(int id, String Categoria, int Stock, String Nombre, float Precio) {
        this.id = id;
        this.Categoria = Categoria;
        this.Stock = Stock;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public int getId() {
        return id;
    }

    public int getStock() {
        return Stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getPrecio() {
        return Precio;
    }
    
    public String getCategoria() {
        return Categoria;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setCantidad(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
        
}
