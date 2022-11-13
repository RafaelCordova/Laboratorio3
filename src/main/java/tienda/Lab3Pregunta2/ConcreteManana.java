package tienda.Lab3Pregunta2;

public class ConcreteManana extends AbstractHorarioEntrega {

    public ConcreteManana() {
    }

    public ConcreteManana(String horario) {
        super(horario);
    }

    @Override
    public void determinarHorarioEntrega() {
        System.out.println("EL HORARIO DE ENTREGA ES MAÑANA DE 9 A 12");
    }
}
