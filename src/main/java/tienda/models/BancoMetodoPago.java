package tienda.models;

<<<<<<< HEAD
public class BancoMetodoPago implements MetodoPago {

    private String bankId;
    
    @Override
    public  void pagarPedido(Pedido order){
        bankPayOrder(order);            }

    public double devolverComision(Double montoTotal){    return montoTotal*0.15;  }

    public void bankPayOrder(Pedido order){
        System.out.println("Procesando el pago con Banco "+getBankId()+
        " | total: "+order.getMontoTotal() + " comision: " +this.devolverComision(order.getMontoTotal())); }

    public String getBankId() {
        if(this.bankId == null){ setBankId("B90000000001"); }
        return bankId;
                             }

    public void setBankId(String bankId){   this.bankId = bankId; }
                                                    }
=======
public class BancoMetodoPago extends MetodoPago {

    private String bankId;
    private Double comision;

    @Override
    public  void pagarPedido(Pedido order){
        bankPayOrder(order);
    }

    public void bankPayOrder(Pedido order){
        
        comision = order.getMontoTotal() * 0.15;
        /* Doing Blok Chain Validation */
        System.out.println("Procesando el pago con Banco "+getBankId()+" | total: "+order.getMontoTotal() + " comision: " +comision);
    }

    public String getBankId() {
        if(this.bankId == null){
            setBankId("B90000000001");
        }
        return bankId;
    }

    public void setBankId(String bankId){
        this.bankId = bankId;
    }
}
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
