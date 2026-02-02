package abstractFactory.veiculoLuxuoso;

import abstractFactory.Carro;

public class CarroLuxuoso implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Luxuoso: Modelo Premium, 4 portas, motor V8");
    }

}
