package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    @Test
    void deveEnviarDoacaoAACD() {
        Banco banco = new Banco("PycPai");
        Cliente cliente = new Cliente(banco);
        assertEquals("PycPai enviou sua doação para a instituição.\n" +
                "A instituição agradeceu seu apoio:\n" +
                ">> A AACD agradece sua doação no valor de 100.0!",
                cliente.enviarDoacaoAACD(100.0));
    }

    @Test
    void deveEnviarDoacaoAPAE() {
        Banco banco = new Banco("PycPai");
        Cliente cliente = new Cliente(banco);
        assertEquals("PycPai enviou sua doação para a instituição.\n" +
                        "A instituição agradeceu seu apoio:\n" +
                        ">> A APAE agradece sua doação no valor de 999.99!",
                cliente.enviarDoacaoAPAE(999.99));
    }

    @Test
    void deveEnviarDoacaoGreenpeace() {
        Banco banco = new Banco("PycPai");
        Cliente cliente = new Cliente(banco);
        assertEquals("PycPai enviou sua doação para a instituição.\n" +
                        "A instituição agradeceu seu apoio:\n" +
                        ">> A Greenpeace agradece sua doação no valor de 1.0!",
                cliente.enviarDoacaoGreenpeace(1.0));
    }
}