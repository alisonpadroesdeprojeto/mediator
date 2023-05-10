package mediator;

public class AACD {

    private static AACD instancia = new AACD();

    private AACD() {}

    public static AACD getInstancia() {
        return instancia;
    }

    public String receberDoacao(double valor) {
        return "A AACD agradece sua doação no valor de " + valor + "!";
    }
}
