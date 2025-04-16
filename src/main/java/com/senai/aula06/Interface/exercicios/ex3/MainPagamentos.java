package com.senai.aula06.Interface.exercicios.ex3;

public class MainPagamentos {
    public static void main(String[] args) {
        CartaoDeCredito P1 = new CartaoDeCredito(
                "Melissa L.",
                5724,
                300
        );

        P1.pagar(5724, 10, 5100);
    }
}
