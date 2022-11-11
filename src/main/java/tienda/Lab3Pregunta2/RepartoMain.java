package tienda.Lab3Pregunta2;

import tienda.Lab3_Pregunta3.ClienteFlyweight;
import tienda.repositories.impl.ClienteRepositorioImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RepartoMain {

    static Scanner entrada = new Scanner(System.in);


    public static void test() {


        String tR = " ";
        int opc;
        System.out.println("=======SELECCIONE UN TIPO DE ENTREGA========");
        System.out.println("1. RECOJO EN TIENDA");
        System.out.println("2. DESPACHO A DOMICILIO");
        System.out.println("3. ENVIO A DEPOSITO");

        do {
            System.out.print("Ingresa tu opcion :");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    tR ="RECOJO EN TIENDA";
                    break;
                case 2:
                    tR ="DESPACHO A DOMICILIO";
                    break;
                case 3:
                    tR ="ENVIO A DEPOSITO";
                    break;
            }
        } while (opc != 4);

        int opc1;
        System.out.println("=======SELECCIONE UN HORARIO========");
        System.out.println("1. EN LA MAÑANA DE 9AM A 12AM");
        System.out.println("2. EN LA TARDE DE 12PM A 3PM");
        System.out.println("3. EN LA NOCHE DE 3PM A 6PM");

        do {
            System.out.print("Ingresa tu opcion :");
            opc1 = entrada.nextInt();
            switch (opc1) {
                case 1:
                    ConcreteManana h1 = new ConcreteManana();
                    TipoReparto tipo1 = new TipoReparto(tR, h1);
                    tipo1.definirTipoReparto();
                    break;
                case 2:
                    ConcreteTarde h2 = new ConcreteTarde();
                    TipoReparto tipo2 = new TipoReparto(tR, h2);
                    tipo2.definirTipoReparto();
                    break;
                case 3:
                    ConcreteNoche h3 = new ConcreteNoche();
                    TipoReparto tipo3 = new TipoReparto(tR, h3);
                    tipo3.definirTipoReparto();
                    break;
            }
        } while (opc != 4);

    }
}
