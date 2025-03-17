package com.senai.aula06.Interface.exemplos.veiculo;

public interface Veiculo {
    void acelerar();

    static void buzinar() {
        System.out.println("Bi bi");
    }
}
