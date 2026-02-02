package abstractFactory;

import abstractFactory.veiculoLuxuoso.CarroLuxuoso;
import abstractFactory.veiculoLuxuoso.MotocicletaLuxuosa;

public class FactoryVeiculoLuxuoso implements FactoryVeiculo {
    @Override
    public Carro criarCarro() {
        return new CarroLuxuoso();
    }

    @Override
    public Motocicleta criarMotocicleta() {
        return new MotocicletaLuxuosa();
    }

}
