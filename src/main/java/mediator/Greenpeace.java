package mediator;

public class Greenpeace {

    private static Greenpeace instancia = new Greenpeace();

    private Greenpeace() {}

    public static Greenpeace getInstancia() {
        return instancia;
    }

    public String receberDoacao(double valor) {
        return "A Greenpeace agradece sua doação no valor de " + valor + "!";
    }
}
