/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.ISP.Modelos;

import tienda.ISP.Interfaces.IDiscoDuro;
import tienda.ISP.Interfaces.IRam;
import tienda.ISP.Interfaces.ITarjetaVideo;


public class LaptopHP extends Laptop implements ITarjetaVideo,IDiscoDuro,IRam{

<<<<<<< HEAD
    public LaptopHP(String serie, double peso, int aÃ±o) {
        super(serie, peso, aÃ±o);
=======
    public LaptopHP(String serie, double peso, int año) {
        super(serie, peso, año);
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
                                                        }

    
    public void datos(String marcaVideo, String modeloVideo, double capacidadDisco, double Caparam){
        System.out.println("==============LAPTOP HP=============");
           System.out.println("ID: "+getId());
        System.out.println("SERIE :"+getSerie());
        System.out.println("PESO :"+getPeso());
<<<<<<< HEAD
        System.out.println("Aï¿½O :"+getAÃ±o());
=======
        System.out.println("AÑO :"+getAño());
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        System.out.println(mostrarVideo(marcaVideo,modeloVideo));
        System.out.println(capacidaDisco(capacidadDisco));
        System.out.println(cantidadRam(Caparam));
                                                                                        }
    
    
    @Override
    public String mostrarVideo(String marca, String modelo) {
        return "Tarjeta Video "+marca+" y modelo "+modelo;
                                                            }

    @Override
    public String capacidaDisco(double capacidad) {
        return "Capacidad :"+capacidad;
    }

    @Override
    public String cantidadRam(double ram) {
       return "Cantidad RAM:"+ram;
    }
    
}
