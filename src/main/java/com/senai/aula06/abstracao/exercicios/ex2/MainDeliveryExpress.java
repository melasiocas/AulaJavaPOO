package com.senai.aula06.abstracao.exercicios.ex2;

public class MainDeliveryExpress {
    public static void main(String[] args) {
        MotoEntrega v1 = new MotoEntrega(
                80,
                20,
                23
        );
        CarroEntrega v2 = new CarroEntrega(
                80,
                20,
                23
        );
        BicicletaEntrega v3 = new BicicletaEntrega(
                15,
                5,
                23
        );
            v1.verificarDados();
            v2.verificarDados();
            v3.verificarDados();
    }
}
