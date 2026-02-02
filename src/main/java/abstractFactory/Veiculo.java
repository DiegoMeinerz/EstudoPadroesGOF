package abstractFactory;

public class Veiculo {
 private Carro carro;
 private Motocicleta motocicleta;

 public Veiculo(FactoryVeiculo factory) {
     this.carro = factory.criarCarro();
     this.motocicleta = factory.criarMotocicleta();
 }
    public void exibirInfo() {
        carro.exibirInfo();
        motocicleta.exibirInfo();
    }
}
