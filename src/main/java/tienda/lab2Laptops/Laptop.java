/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;

/**
 *
 * @author Rafael
 */
public abstract class Laptop {
    
    private double precio;
<<<<<<< HEAD
    private int año;
    private float peso;

    public Laptop(double precio, int año, float peso) {
        this.precio = precio;
        this.año = año;
=======
    private int a�o;
    private float peso;

    public Laptop(double precio, int a�o, float peso) {
        this.precio = precio;
        this.a�o = a�o;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        this.peso = peso;
    }
    
    public Laptop() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

<<<<<<< HEAD
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
=======
    public int getA�o() {
        return a�o;
    }

    public void setA�o(int a�o) {
        this.a�o = a�o;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString() {
<<<<<<< HEAD
        return "Laptop{" + "precio=" + precio + ", a\u00f1o=" + año + ", peso=" + peso + '}';
=======
        return "Laptop{" + "precio=" + precio + ", a\u00f1o=" + a�o + ", peso=" + peso + '}';
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }
    
}
