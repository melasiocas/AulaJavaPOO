package com.senai.aula05.polimorfismo.exemplos.Veiculos;

public class Carro2 extends Veiculo {
    public Carro2(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção preventiva realizada para o carro " + getModelo());
    }
}


