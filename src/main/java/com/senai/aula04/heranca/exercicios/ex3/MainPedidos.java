package com.senai.aula04.heranca.exercicios.ex3;

public class MainPedidos {
    public static void main(String[] args) {
        PedidoOnline po1 = new PedidoOnline(
                1,
                20
        );

        PedidoPresencial pp1 = new PedidoPresencial(
                2,
                30
        );

        System.out.println(pp1);
        System.out.println(po1);
    }
}
