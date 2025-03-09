package com.senai.aula04.heranca.exercicios.ex1;

public class Main {
    public static void main(String[] args) {
        AlimentoNew a1 = new AlimentoNew(
                "Leite",
                5,
                300,
                "06-07-25"
        );

        EletronicoNew e1 = new EletronicoNew(
                "Celular",
                1000,
                150,
                500
        );
        System.out.println(a1 + "\n" + e1);
    }

}
