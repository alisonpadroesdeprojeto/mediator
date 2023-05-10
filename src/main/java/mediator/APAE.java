package mediator;

public class APAE {

    private static APAE instancia = new APAE();

    private APAE() {}

    public static APAE getInstancia() {
        return instancia;
    }

    public String receberDoacao(double valor) {
        return "A APAE agradece sua doação no valor de " + valor + "!";
    }
}
