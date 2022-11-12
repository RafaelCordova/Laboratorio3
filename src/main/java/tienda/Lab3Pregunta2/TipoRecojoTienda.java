package tienda.Lab3Pregunta2;

public class TipoRecojoTienda extends TipoReparto{
    @Override
    public String definirTipoReparto() {
        this.setTipoR("RECOJO EN TIENDA POR PARTE DEL CLIENTE");
        return this.getTipoR();
    }
    @Override
    public void definirHorarioReparto(AbstractHorarioEntrega horarioEntrega){
        horarioEntrega.determinarHorarioEntrega();
        System.out.println("El tipo de reparto es " + definirTipoReparto() + " y con horario :" + horarioEntrega.getHorario());
    }
}