package tienda.Lab3Pregunta2;

public class TestBridge {

    public static void main(String[] args) {

            TipoReparto obj1= new TipoRecojoTienda();
            AbstractHorarioEntrega h1 = new ConcreteManana();
            h1.determinarHorarioEntrega();

            TipoReparto obj2 = new TipoEnvioDeposito();
            AbstractHorarioEntrega h2 = new ConcreteTarde();
            h2.determinarHorarioEntrega();

            TipoReparto obj3 = new TipoEnvioDelivery();
            AbstractHorarioEntrega h3 = new ConcreteNoche();
            h3.determinarHorarioEntrega();

            //MOSTRAR LOS TESTEOS
            obj1.definirHorarioReparto(h1) ;
            obj2.definirHorarioReparto(h2) ;
            obj3.definirHorarioReparto(h3) ;
                                             }
                }

