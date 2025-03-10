package com.senai.aula06.ITF.exemplos.veiculo;

public interface Veiculo {
    void acelerar();

    static void buzinar() {
        System.out.println("Bi bi");
    }
}
