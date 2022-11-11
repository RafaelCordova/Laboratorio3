package tienda.Lab3Pregunta2;

public class ConcreteTarde extends  AbstractHorarioEntrega{

    public ConcreteTarde() {
    }

    public ConcreteTarde(String horario) {
        super(horario);
    }

    @Override
    public void determinarHorarioEntrega() {
        System.out.println("EL HORARIO DE ENTREGA ES DE TARDE 12 A 3");
    }
}
