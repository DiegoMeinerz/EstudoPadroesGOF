package abstractFactory.veiculoLuxuoso;

import abstractFactory.Motocicleta;

public class MotocicletaLuxuosa implements Motocicleta {
    @Override
    public void exibirInfo() {
        System.out.println("Motocicleta Luxuosa: Modelo Avançado, motor 1000cc, assento de couro");
    }

}
