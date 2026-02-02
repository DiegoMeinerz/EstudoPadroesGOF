package abstractFactory;

public class FactoryCliente {
    public Veiculo CriarVeiculo(String tipoVeiculo) {
        FactoryVeiculo factory = null;

        if (tipoVeiculo.equalsIgnoreCase("luxuoso")) {
            factory = new FactoryVeiculoLuxuoso();
        } else if (tipoVeiculo.equalsIgnoreCase("simples")) {
            factory = new FactoryVeiculoSimples();
        } else {
            System.out.println("Tipo de veículo desconhecido.");
        
        }

        // Carro carro = factory.criarCarro();
        // Motocicleta motocicleta = factory.criarMotocicleta();
        Veiculo veiculo = new Veiculo(factory);
        veiculo.exibirInfo();

        return veiculo;

    }
}
