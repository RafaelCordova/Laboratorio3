package tienda.Lab3Pregunta2;

public class ConcreteManana extends AbstractHorarioEntrega {

    public ConcreteManana() {
    }

    public ConcreteManana(String horario) {
        super(horario);
    }

    @Override
    public void setHorario(String horario) {
        horario = "EL HORARIO DE ENTREGA ES EN LA MAÑANA DE 9am A 12am";
    }
}
