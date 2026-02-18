package abstractFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FactoryClienteTest {

    @Test
    void criarVeiculoSimplesReturnsVeiculoAndPrintsInfo() {
        FactoryCliente cliente = new FactoryCliente();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            Veiculo v = cliente.CriarVeiculo("simples");
            assertNotNull(v, "esperava um Veiculo não-nulo para 'simples'");
        } finally {
            System.setOut(oldOut);
        }

        String printed = out.toString();
        assertTrue(printed.contains("Carro Simples"));
        assertTrue(printed.contains("Motocicleta Simples"));
    }

    @Test
    void criarVeiculoLuxuosoReturnsVeiculoAndPrintsInfo() {
        FactoryCliente cliente = new FactoryCliente();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            Veiculo v = cliente.CriarVeiculo("luxuoso");
            assertNotNull(v, "esperava um Veiculo não-nulo para 'luxuoso'");
        } finally {
            System.setOut(oldOut);
        }

        String printed = out.toString();
        assertTrue(printed.contains("Carro Luxuoso"));
        assertTrue(printed.contains("Motocicleta Luxuosa"));
    }

    @Test
    void criarVeiculoDesconhecidoReturnsNull() {
        FactoryCliente cliente = new FactoryCliente();
        Veiculo v = cliente.CriarVeiculo("inexistente");
        assertNull(v, "esperava null para tipo desconhecido");
    }
}
