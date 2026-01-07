public class FactoryMain {
    public static void main(String[] args) {
        FactoryCarro factoryCarro = new FactoryCarro();
        factoryCarro.criarCarro("esportivo", "vermelho", 250);
        factoryCarro.criarCarro("caminhoneta", "azul", 180);
    }
}
