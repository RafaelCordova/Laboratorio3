package tienda.Lab3Pregunta2;

public abstract class AbstractHorarioEntrega {

    private String horario;

    public AbstractHorarioEntrega() { }
    public AbstractHorarioEntrega(String horario) { this.horario = horario; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }


    public abstract void determinarHorarioEntrega();

    @Override
    public String toString() { return "AbstractHorarioEntrega{" +  "horario='" + horario + '\'' + '}'; }

                            }


