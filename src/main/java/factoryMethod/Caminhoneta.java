package factoryMethod;

public class Caminhoneta extends Carro {
    public Caminhoneta(String cor, int velocidadeMaxima) {
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
        System.out.println("Caminhoneta criada: Cor - " + cor + ", Velocidade Máxima - " + velocidadeMaxima + " km/h");
    }
}
