
package tienda.ISP.Modelos;

import tienda.ISP.Interfaces.IDiscoDuro;
import tienda.ISP.Interfaces.IRam;


public class LaptopToshiba extends Laptop implements IDiscoDuro,IRam{

<<<<<<< HEAD
    public LaptopToshiba(String marca, double peso, int año) {
        super(marca, peso, año);
=======
    public LaptopToshiba(String marca, double peso, int a�o) {
        super(marca, peso, a�o);
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }


 
    public void datos(double capa, double ram){
  
        System.out.println("=============LAPTOP TOSHIBA=========");
        System.out.println("ID :"+getId());
        System.out.println("SERIE :"+getSerie());
        System.out.println("PESO :"+getPeso());
<<<<<<< HEAD
        System.out.println("A�O :"+getAño());
=======
        System.out.println("A�O :"+getA�o());
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        System.out.println(capacidaDisco(capa));
        System.out.println(cantidadRam(ram));
                                               }

    @Override
    public String capacidaDisco(double capacidad) {
       return "Capacidad Disco:"+capacidad;
    }

    @Override
    public String cantidadRam(double ram) {
         return "Memoria RAM :"+ram;
    }

    
                                                            }
