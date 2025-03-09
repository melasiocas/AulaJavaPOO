package com.senai.aula05.polimorfismo.exemplos.Veiculos;

public class GestaoFrota {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro2("Toyota Corolla"),
                new Moto("Honda CB500"),
                new Caminhao("Volvo FH")
        };

        for (Veiculo v : frota) {
            v.realizarManutencao();
        }
    }
}
