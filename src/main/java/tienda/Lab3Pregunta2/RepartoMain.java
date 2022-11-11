package tienda.Lab3Pregunta2;

import tienda.Lab3_Pregunta3.ClienteFlyweight;
import tienda.repositories.impl.ClienteRepositorioImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RepartoMain {

    static Scanner entrada = new Scanner(System.in);
    public static List<ClienteFlyweight> clientesFlyweight = new LinkedList<>();

    public static void test() {

        //System.out.println(p.operacionAbreviatura("BOLIVIA"));
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
                    ClienteRepositorioImpl obj = new ClienteRepositorioImpl();
                    ClienteFlyweight.registrarEmpleado(clientesFlyweight);
                    obj.create(clientesFlyweight.get(clientesFlyweight.size()-1));
                    break;
                case 2:
                    ClienteFlyweight.mostrarEmpleados(clientesFlyweight);
                    break;
                            }
        } while (opc != 4);
                                                }


                                }
