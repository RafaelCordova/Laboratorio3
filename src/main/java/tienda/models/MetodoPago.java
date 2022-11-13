package tienda.models;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
public interface MetodoPago {
    public void pagarPedido(Pedido order);
    public double devolverComision(Double montoTotal);   
                            }
<<<<<<< HEAD
=======
public class MetodoPago {

    public void pagarPedido(Pedido order){

        /* Efectivo */
        System.out.println("Pagando con efectivo | total: "+ order.getMontoTotal());
    }

}
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
