package abstractFactory.veiculoSimples;

import abstractFactory.Motocicleta;

public class MotocicletaSimples implements Motocicleta {
    
    @Override
    public void exibirInfo() {
        System.out.println("Motocicleta Simples: Modelo Básico, motor 125cc");
    }

}
