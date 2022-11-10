package tienda.Lab3_Pregunta3;

import tienda.models.Cliente;
import tienda.models.Pedido;
import tienda.Lab3_Pregunta3.interfaces.*;

public class BaseDecoratorInspeccion implements IEmpresaInspeccion{
    protected IEmpresaInspeccion empresaInspeccion;
    public BaseDecoratorInspeccion(){
    }

    public BaseDecoratorInspeccion(IEmpresaInspeccion empresaInspeccion){

        this.empresaInspeccion = empresaInspeccion;
    }

    @Override
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden) {
        this.empresaInspeccion.inspeccionBasica(cliente, montoTotal, orden);
    }

    protected IEmpresaInspeccion getInspeccion(){
        return empresaInspeccion;
    }
}
