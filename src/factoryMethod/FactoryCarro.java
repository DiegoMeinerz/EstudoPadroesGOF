public class FactoryCarro {
    public Carro criarCarro(String tipo, String cor, int velocidadeMaxima) {
        switch (tipo.toLowerCase()) {
            case "esportivo" -> {
                return new Esportivo(cor, velocidadeMaxima);
            }
            case "caminhoneta" -> {
                return new Caminhoneta(cor, velocidadeMaxima);
            }
            default -> throw new IllegalArgumentException("Tipo de carro desconhecido: " + tipo);
        }
    }
}