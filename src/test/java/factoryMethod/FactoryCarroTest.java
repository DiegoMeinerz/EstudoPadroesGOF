package factoryMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FactoryCarroTest {

    @Test
    void testarCarroEsportivo() {
        FactoryCarro factory = new FactoryCarro();
        Carro carro = factory.criarCarro("esportivo", "vermelho", 250);
        assertTrue(carro instanceof Esportivo);
        assertEquals("vermelho", carro.cor);
        assertEquals(250, carro.velocidadeMaxima);
    }

    @Test
    void testarCarroCaminhoneta() {
        FactoryCarro factory = new FactoryCarro();
        Carro carro = factory.criarCarro("caminhoneta", "azul", 180);
        assertTrue(carro instanceof Caminhoneta);
        assertEquals("azul", carro.cor);
        assertEquals(180, carro.velocidadeMaxima);
    }

    @Test
    void testarRetornoTipoDesconhecido() {
        FactoryCarro factory = new FactoryCarro();
        assertThrows(IllegalArgumentException.class, () -> factory.criarCarro("bike", "preto", 10));
    }
}
