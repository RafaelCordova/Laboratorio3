package tienda.Lab3Pregunta2;

public class ConcreteNoche extends  AbstractHorarioEntrega{

    public ConcreteNoche() {
    }

    public ConcreteNoche(String horario) {
        super(horario);
    }

    @Override
    public void determinarHorarioEntrega() {
        System.out.println("EL HORARIO DE ENTREGA ES DE NOCHE 3 A 6");
    }
}
