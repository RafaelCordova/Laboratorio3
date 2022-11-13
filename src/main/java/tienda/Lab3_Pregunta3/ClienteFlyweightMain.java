package tienda.Lab3_Pregunta3;

<<<<<<< HEAD

=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
import java.util.*;

import tienda.repositories.impl.ClienteRepositorioImpl;

public class ClienteFlyweightMain {

    static Scanner entrada = new Scanner(System.in);
    public static List<ClienteFlyweight> clientesFlyweight = new LinkedList<>();

    public static void test() {

        //System.out.println(p.operacionAbreviatura("BOLIVIA"));
        int opc;
<<<<<<< HEAD
        System.out.println("=======REGISTRO DE CLIENTES CON PATRON FLYWEIGHT========");
=======
        System.out.println("=======REGISTRO DE EMPLEADOS CON PATRON FLYWEIGHT========");
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        System.out.println("1. REGISTRAR EMPLEADO");
        System.out.println("2. MOSTRAR  EMPLEADOS");

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
<<<<<<< HEAD
            }
        } while (opc != 4);
    }


}
=======
                            }
        } while (opc != 4);
                                                }


                                }
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
