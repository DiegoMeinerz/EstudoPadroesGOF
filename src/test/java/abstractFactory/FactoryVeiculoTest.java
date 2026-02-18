package abstractFactory;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryVeiculoTest {

    @Test
    void simplesFactoryProducesSimpleVehicleInfo() {
        FactoryVeiculo factory = new FactoryVeiculoSimples();
        Carro carro = factory.criarCarro();
        Motocicleta moto = factory.criarMotocicleta();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            carro.exibirInfo();
            moto.exibirInfo();
        } finally {
            System.setOut(oldOut);
        }

        String printed = out.toString();
        assertTrue(printed.contains("Carro Simples"), "esperava mensagem do Carro Simples");
        assertTrue(printed.contains("Motocicleta Simples"), "esperava mensagem da Motocicleta Simples");
    }

    @Test
    void luxuosoFactoryProducesLuxuriousVehicleInfo() {
        FactoryVeiculo factory = new FactoryVeiculoLuxuoso();
        Carro carro = factory.criarCarro();
        Motocicleta moto = factory.criarMotocicleta();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            carro.exibirInfo();
            moto.exibirInfo();
        } finally {
            System.setOut(oldOut);
        }

        String printed = out.toString();
        assertTrue(printed.contains("Carro Luxuoso"), "esperava mensagem do Carro Luxuoso");
        assertTrue(printed.contains("Motocicleta Luxuosa"), "esperava mensagem da Motocicleta Luxuosa");
    }

}
