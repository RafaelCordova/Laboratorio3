package tienda.Lab3Pregunta2;

public class ConcreteNoche extends AbstractHorarioEntrega{

    public ConcreteNoche() {
    }

    public ConcreteNoche(String horario) {
        super(horario);
    }

    @Override
    public void setHorario(String horario){
        horario = "EL HORARIO DE ENTREGA ES EN LA NOCHE DE 3pm A 6pm";
    }
}
