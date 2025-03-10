package com.senai.aula06.abstracao.exemplos.veiculos;

public class TesteVeiculo {
    public static void main(String[] args) {
        ligarAcelerarVeiculo(new Carro(), 10);
        ligarAcelerarVeiculo(new Moto(), 20);
    }
    public static void ligarAcelerarVeiculo(Veiculo veiculo, int incremento) {
        veiculo.ligar();
        veiculo.acelerar(incremento);
    }
}
