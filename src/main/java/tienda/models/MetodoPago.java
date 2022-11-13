package tienda.models;

<<<<<<< HEAD
public interface MetodoPago {
    public void pagarPedido(Pedido order);
    public double devolverComision(Double montoTotal);   
                            }
=======
public class MetodoPago {

    public void pagarPedido(Pedido order){

        /* Efectivo */
        System.out.println("Pagando con efectivo | total: "+ order.getMontoTotal());
    }

}
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
