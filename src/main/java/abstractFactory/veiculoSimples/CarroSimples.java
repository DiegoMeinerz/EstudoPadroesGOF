package abstractFactory.veiculoSimples;

import abstractFactory.Carro;

public class CarroSimples implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Simples: Modelo Econômico, 2 portas, motor 1.0");
    }

}
