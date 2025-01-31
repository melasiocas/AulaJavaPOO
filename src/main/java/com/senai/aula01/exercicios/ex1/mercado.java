package com.senai.aula01.exercicios.ex1;

import java.util.Scanner;

public class mercado {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);

        Produto produto1 = new Produto(
                "leite",
                6,
                10
        );
        Produto produto2 = new Produto(
                "Café",
                12,
                10
        );

        produto1.atualizaEstoque();
        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto1.verificarValorDoEstoque();
        produto2.verificarValorDoEstoque();
    }
}