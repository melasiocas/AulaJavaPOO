package com.senai.aula01.exercicios.ex2;

public class boletim {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(
                "Melissa Lourenço",
                17,
                10
        );
        Aluno aluno2 = new Aluno(
                "Giovanna Santos",
                18,
                9
        );
        Aluno aluno3 = new Aluno(
                "Pedro Quidute",
                16,
                0
        );

        aluno2.atualizarNota();
        aluno1.exibirInformacoes();
        if (aluno1.verificarAprovacao() == true){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        aluno2.exibirInformacoes();
        if (aluno2.verificarAprovacao() == true){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        aluno3.exibirInformacoes();
        if (aluno3.verificarAprovacao() == true){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
