/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;

import tienda.Lab2Interfaces.IConexionHDMI;
import tienda.Lab2Interfaces.IDiscoM2;
import tienda.Lab2Interfaces.ITarjetaDedicada;
import tienda.Lab2Interfaces.ITecladoLuminoso;

/**
 *
 * @author Rafael
 */

public class LaptopAcer extends Laptop implements ITecladoLuminoso,IConexionHDMI,ITarjetaDedicada,IDiscoM2{

<<<<<<< HEAD
    public LaptopAcer(double precio, int año, float peso) {
        super(precio, año, peso);
=======
    public LaptopAcer(double precio, int a�o, float peso) {
        super(precio, a�o, peso);
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }

    public int velocidad(int velocidad) {
            
        return velocidad;
            
    }

    @Override
    public String version(String version) {
        
        return version;
        
    }

    @Override
    public void disponibilidad() {
        
        System.out.println("La laptop Acer tiene conexion HDMI");
        
    }

    @Override
    public String tipo(String tipo) {
        
        return tipo;
        
    }
    public void mostrardatos(int velocidad,String version,String tipo){

        System.out.println("El precio de la laptop Acer es de: "+getPrecio());
<<<<<<< HEAD
        System.out.println("El a�o de la laptop Acer es de: "+getAño());
=======
        System.out.println("El a�o de la laptop Acer es de: "+getA�o());
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        System.out.println("El peso de la laptop Acer es de: "+getPeso());
        System.out.println("La velocidad del discoM2 de la laptop Acer es de: "+velocidad(velocidad));
        System.out.println("La version de la tarjeta dedicada de la laptop Acer es de: "+version(version));
        System.out.println("El tipo de teclado de la laptop Acer es de: "+tipo(tipo));
        System.out.println("La laptop Acer tiene conexion HDMI");
        System.out.println("La laptop Acer tiene disco M2");

    }

 
}

