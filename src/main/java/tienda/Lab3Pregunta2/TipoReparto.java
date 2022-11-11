package tienda.Lab3Pregunta2;
nvmbvm
public class TipoReparto extends AbstractTipoReparto{

    private String tipoR;
    private AbstractHorarioEntrega abstractHorarioEntrega;

    public TipoReparto() { }

    public TipoReparto(String tipoR, AbstractHorarioEntrega abstractHorarioEntrega) {
        this.tipoR = tipoR;
        this.abstractHorarioEntrega = abstractHorarioEntrega;
                                                                    }

    public String getTipoR() { return tipoR; }
    public void setTipoR(String tipoR) { this.tipoR = tipoR; }
    public AbstractHorarioEntrega getHorarioEntrega() { return abstractHorarioEntrega; }
    public void setHorarioEntrega(AbstractHorarioEntrega abstractHorarioEntrega) { this.abstractHorarioEntrega = abstractHorarioEntrega;}

    @Override
    public String toString() { return "TipoReparto{" + "tipoR='" + tipoR + '\'' +  ", abstractHorarioEntrega=" + abstractHorarioEntrega + '}'; }


    @Override
    public void definirTipoReparto() {
        System.out.println("EL TIPO DE REPARTO ES "+tipoR+" y con horario de entrega :"+ abstractHorarioEntrega);
                                     }
                                                        }
