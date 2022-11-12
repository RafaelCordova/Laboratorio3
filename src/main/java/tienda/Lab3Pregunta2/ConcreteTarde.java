package tienda.Lab3Pregunta2;

public class ConcreteTarde extends AbstractHorarioEntrega{

    public ConcreteTarde() { }

    @Override

    public void setHorario(String horario) {
        horario = "EL HORARIO DE ENTREGA ES EN LA TARDE DE 12pm A 3pm";
    }

    public void determinarHorarioEntrega() {
        this.setHorario("TARDE --> HORARIO DE ENTREGA DE 12PM-3PM");
                                            }
                                                                        }
