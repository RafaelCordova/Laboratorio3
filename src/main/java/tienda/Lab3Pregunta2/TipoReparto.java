package tienda.Lab3Pregunta2;

public abstract class TipoReparto{

    private String tipoR;

    private AbstractHorarioEntrega horarioEntrega;

    public abstract String definirTipoReparto();

    public abstract void definirHorarioReparto(AbstractHorarioEntrega horario);

<<<<<<< Updated upstream
    @Override
    public String toString() { return "TipoReparto{" + "tipoR='" + tipoR + '\'' +  ", abstractHorarioEntrega=" + abstractHorarioEntrega + '}'; }
    

    @Override
    public void definirTipoReparto() {
        System.out.println("EL TIPO DE REPARTO ES "+tipoR+" y con horario de entrega :"+ abstractHorarioEntrega.getHorario());
                                     }
=======

    public String getTipoR() {
        return tipoR;
    }

    public void setTipoR(String tipoR) {
        this.tipoR = tipoR;
    }

    public AbstractHorarioEntrega getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setHorarioEntrega(AbstractHorarioEntrega abstractHorarioEntrega) {
        this.horarioEntrega = abstractHorarioEntrega;
    }

    @Override
    public String toString() {
        return "TipoReparto{" + "tipoR='" + tipoR + '\'' +  ", horarioEntrega=" + horarioEntrega + '}';
    }

>>>>>>> Stashed changes
                                                        }
