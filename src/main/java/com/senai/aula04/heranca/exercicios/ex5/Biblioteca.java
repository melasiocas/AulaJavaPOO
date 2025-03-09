package com.senai.aula04.heranca.exercicios.ex5;

public class Biblioteca {
    public static void main(String[] args) {
        LivroDigital ld1 = new LivroDigital(
                "Se não eu, quem vai fazer vc feliz?",
                "Grazi",
                500
        );
        LivroFisico lf1 = new LivroFisico(
                "As santas",
                "Neil",
                230
        );
        System.out.println(lf1);
        System.out.println(ld1);
    }
}
