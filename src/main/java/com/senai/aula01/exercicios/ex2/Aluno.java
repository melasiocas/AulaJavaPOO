package com.senai.aula01.exercicios.ex2;

import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);

    String nome;
    int idade;
    int nota;
    boolean resultado;

    public Aluno(String nome, int idade, int nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacoes() {
        System.out.println("--------------------\n" +
                           "Nome  | " + nome +
                         "\nIdade | " + idade +
                         "\nNota  | " + nota +
                           "\n--------------------");
    }

    public void atualizarNota() {
        System.out.println("Nota atual: ");
        nota = scanner.nextInt();
    }

    public boolean verificarAprovacao() {
        if (this.nota >= 6) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
