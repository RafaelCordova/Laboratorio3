package tienda.models;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
public class BlockChainMetodoPago implements MetodoPago {

    private String walletId;
    
    @Override
    public  void pagarPedido(Pedido order){   walletPayOrder(order); }

    public double devolverComision(Double montoTotal){ return montoTotal*0.05; }

    public void walletPayOrder(Pedido order){
        System.out.println("Procesando el pago con wallet "+getWalletId()+
        " | total: "+order.getMontoTotal() + " comision: " +this.devolverComision(order.getMontoTotal()));  }
<<<<<<< HEAD
=======
public class BlockChainMetodoPago extends MetodoPago {

    private String walletId;
    private Double comision;

    @Override
    public  void pagarPedido(Pedido order){
        walletPayOrder(order);
    }

    public void walletPayOrder(Pedido order){
        
        comision = order.getMontoTotal() * 0.05;
        /* Doing Blok Chain Validation */
        System.out.println("Procesando el pago con wallet "+getWalletId()+" | total: "+order.getMontoTotal() + " comision: " +comision);
    }
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

    public String getWalletId() {
        if(this.walletId == null){
            UUID uuid = Generators.timeBasedGenerator().generate();
            setWalletId(uuid.toString());
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
                                 }
        return walletId;
                                }

    public void setWalletId(String walletId){   this.walletId = walletId; }
<<<<<<< HEAD
=======
        }
        return walletId;
    }

    public void setWalletId(String walletId){
        this.walletId = walletId;
    }
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
}
