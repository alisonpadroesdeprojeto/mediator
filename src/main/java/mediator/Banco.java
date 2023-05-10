package mediator;

public class Banco {
    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String enviarDoacaoAACD(double valor) {
        return nome + " enviou sua doação para a instituição.\n" +
                "A instituição agradeceu seu apoio:\n" +
                ">> " + AACD.getInstancia().receberDoacao(valor);
    }

    public String enviarDoacaoAPAE(double valor) {
        return nome + " enviou sua doação para a instituição.\n" +
                "A instituição agradeceu seu apoio:\n" +
                ">> " + APAE.getInstancia().receberDoacao(valor);
    }

    public String enviarDoacaoGreenpeace(double valor) {
        return nome + " enviou sua doação para a instituição.\n" +
                "A instituição agradeceu seu apoio:\n" +
                ">> " + Greenpeace.getInstancia().receberDoacao(valor);
    }
}
