
package tienda.ISP.Modelos;

import org.bson.types.ObjectId;
import tienda.models.Producto;

public class Laptop extends Producto{
    
    private String serie;
    private double peso;
<<<<<<< HEAD
    private int aÃ±o;


    
    public Laptop(String marca, double peso, int aÃ±o) {
        this.serie = marca;
        this.peso = peso;
        this.aÃ±o = aÃ±o;
=======
    private int año;


    
    public Laptop(String marca, double peso, int año) {
        this.serie = marca;
        this.peso = peso;
        this.año = año;
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
    public int getAÃ±o() {
        return aÃ±o;
    }

    public void setAÃ±o(int aÃ±o) {
        this.aÃ±o = aÃ±o;
=======
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Laptop{" + "serie=" + serie + ", peso=" + peso + ", aï¿½o lanzamiento=" + aÃ±o + '}';
=======
        return "Laptop{" + "serie=" + serie + ", peso=" + peso + ", año lanzamiento=" + año + '}';
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }
    
    
    
}
