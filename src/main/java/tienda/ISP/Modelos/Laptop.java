
package tienda.ISP.Modelos;

import org.bson.types.ObjectId;
import tienda.models.Producto;

public class Laptop extends Producto{
    
    private String serie;
    private double peso;
<<<<<<< HEAD
    private int año;


    
    public Laptop(String marca, double peso, int año) {
        this.serie = marca;
        this.peso = peso;
        this.año = año;
=======
    private int a�o;


    
    public Laptop(String marca, double peso, int a�o) {
        this.serie = marca;
        this.peso = peso;
        this.a�o = a�o;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Laptop{" + "serie=" + serie + ", peso=" + peso + ", a�o lanzamiento=" + año + '}';
=======
        return "Laptop{" + "serie=" + serie + ", peso=" + peso + ", a�o lanzamiento=" + a�o + '}';
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }
    
    
    
}
