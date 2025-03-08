package com.senai.aula04.heranca.exercicios.ex1;

public class Main {
    public static void main(String[] args) {
        Alimento a1 = new Alimento(
                "Leite",
                5,
                300,
                "06-07-25"
        );

        Eletronico e1 = new Eletronico(
                "Celular",
                1000,
                150,
                500
        );
        System.out.println(a1 + "\n" + e1);
    }

}
