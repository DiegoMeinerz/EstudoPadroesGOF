public class Esportivo extends Carro {
    protected Esportivo(String cor, int velocidadeMaxima) {
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
        System.out.println("Esportivo criado: Cor - " + cor + ", Velocidade Máxima - " + velocidadeMaxima + " km/h");
    }
}
