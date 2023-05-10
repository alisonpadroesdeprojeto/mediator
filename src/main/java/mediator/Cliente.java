package mediator;

public class Cliente {
    private Banco banco;

    public Cliente(Banco banco) {
        this.banco = banco;
    }

    public String enviarDoacaoAACD(double valor) {
        return banco.enviarDoacaoAACD(valor);
    }

    public String enviarDoacaoAPAE(double valor) {
        return banco.enviarDoacaoAPAE(valor);
    }

    public String enviarDoacaoGreenpeace(double valor) {
        return banco.enviarDoacaoGreenpeace(valor);
    }
}
