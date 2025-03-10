package com.senai.aula06.abstracao.exemplos.veiculos;

abstract class Veiculo {
    int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    void acelerar (int incremento) {
        velocidade += incremento;
        System.out.println("Acelerando para a velocidade " + velocidade + " Km/h");
    }
    abstract void ligar();
}
