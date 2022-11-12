package tienda.Lab3Pregunta2;

public class ConcreteManana extends AbstractHorarioEntrega {

    public ConcreteManana() { }

    @Override
    public void setHorario(String horario) {
        horario = "EL HORARIO DE ENTREGA ES EN LA MAÑANA DE 9am A 12am";
    }


    public void determinarHorarioEntrega() {
        this.setHorario("MANANA --> HORARIO DE ENTREGA DE 9AM-12PM");
                                     }
                                                             }

