package tienda.Lab3_Pregunta3;

import org.bson.types.ObjectId;
import tienda.models.Cliente;

import javax.swing.*;
import java.util.List;


public class ClienteFlyweight extends Cliente {

    private String paisNacimiento;
    private String paisDomiciliado;

    public static int indice = 0;

    public ClienteFlyweight() { }

    public ClienteFlyweight(String paisN, String paisDomicilio) {
        this.paisNacimiento = paisN;
        this.paisDomiciliado = paisDomicilio;
    }

    public static void registrarEmpleado(List<ClienteFlyweight> p) {

        String id, nombre, direccion, numeroDocumento, paisNacimiento, paisDomicilio;
        id = new ObjectId().toString();

        System.out.print("INGRESE SU NOMBRE :");
        nombre = entrada.next();
        System.out.print("INGRESA TU DIRECCION :");
        direccion = entrada.next();
        System.out.print("INGRESA TU DNI :");
        numeroDocumento = entrada.next();
        System.out.print("PAIS DE NACIMIENTO :");
        paisNacimiento = entrada.next();
        System.out.print("PAIS DE DOMICILIO :");
        paisDomicilio = entrada.next();

        p.add(new ClienteFlyweight(id, nombre, direccion, numeroDocumento, paisNacimiento, paisDomicilio));

        p.get(indice).setPaisDomiciliado(AbreviaturasFlyweightFactory.getOperacionAbreviatura(p.get(indice).getPaisDomiciliado()));
        p.get(indice).setPaisN(AbreviaturasFlyweightFactory.getOperacionAbreviatura(p.get(indice).getPaisN()));

        indice++;
        JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO");
    }


    public static void mostrarEmpleados(List<ClienteFlyweight> p) {
        p.stream().map(s -> s.getId() + "\t" + s.getNombre() + "\t" + s.getDireccion() + "\t" + s.getPaisN() + "\t" + s.getPaisDomiciliado()).forEach(System.out::println);
    }



    public ClienteFlyweight(String id, String nombre, String direccion, String numeroDocumento, String paisNacimiento, String paisDomicilio) {
        super(id, nombre, direccion, numeroDocumento);
        this.paisNacimiento = paisNacimiento;
        this.paisDomiciliado = paisDomicilio;
    }


    public String getPaisN() {
        return paisNacimiento;
    }

    public void setPaisN(String paisN) {
        this.paisNacimiento = paisN;
        }

    public String getPaisDomiciliado() {
        return paisDomiciliado;
    }

    public void setPaisDomiciliado(String paisDomiciliado) {
        this.paisDomiciliado = paisDomiciliado;
    }

    @Override
    public String toString() {
        return "ClienteFlyweight{" +
                "paisNacimiento='" + paisNacimiento + '\'' +
                ", paisDomiciliado='" + paisDomiciliado + '\'' +
                '}';
    }
}
