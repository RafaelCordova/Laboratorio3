package tienda.Lab3Pregunta2;

public class TipoEnvioDelivery extends TipoReparto{
    @Override
    public String definirTipoReparto() {
        this.setTipoR("ENVIO POR DELIVERY AL CLIENTE");
        return this.getTipoR();
    }
    @Override
    public void definirHorarioReparto(AbstractHorarioEntrega horarioEntrega){
        horarioEntrega.determinarHorarioEntrega();
        System.out.println("El tipo de reparto es " + definirTipoReparto() + " y con horario :" + horarioEntrega.getHorario());
    }
}