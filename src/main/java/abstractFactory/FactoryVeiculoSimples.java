package abstractFactory;

import abstractFactory.veiculoSimples.CarroSimples;
import abstractFactory.veiculoSimples.MotocicletaSimples;

public class FactoryVeiculoSimples implements FactoryVeiculo {
    @Override
    public Carro criarCarro() {
        return new CarroSimples();
    }

    @Override
    public Motocicleta criarMotocicleta() {
        return new MotocicletaSimples();
    }}
