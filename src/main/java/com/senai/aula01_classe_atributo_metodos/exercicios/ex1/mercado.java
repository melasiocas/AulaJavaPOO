package com.senai.aula01_classe_atributo_metodos.exercicios.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class mercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto(
                "leite",
                6,
                1000
        );
        Produto produto2 = new Produto(
                "Café",
                12,
                1000
        );

        Produto[] produtos = new Produto[2];
        produtos[0] = produto1;
        produtos[1] = produto2;


        System.out.println("-------- Produtos -------- \n 1 - Leite \n 2 - Café");
        System.out.println("Escolha um produto para editar: ");
        int opcaoproduto = scanner.nextInt();

        if(opcaoproduto == 1) {
            int opcao;
            do {
                System.out.println("1 - Exibir detalhes do produto \n" +
                        "2 - Atualizar estoque \n" +
                        "3 - Verificar valor do estoque atual \n" +
                        "4 - Fechar o sistema."
                );
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        produto1.exibirDetalhes();
                    case 2:
                        produto1.atualizaEstoque();
                    case 3:
                        produto1.verificarValorDoEstoque();
                    case 4:
                        scanner.close();
                }
            } while (opcao != 4);
        } else if (opcaoproduto == 2) {

        int opcao2;
                do {
                    System.out.println("1 - Exibir detalhes do produto \n" +
                            "2 - Atualizar estoque \n" +
                            "3 - Verificar valor do estoque atual \n" +
                            "4 - Fechar o sistema."
                    );
                    opcao2 = scanner.nextInt();
                    switch (opcao2) {
                        case 1:
                            produto2.exibirDetalhes();
                        case 2:
                            produto2.atualizaEstoque();
                        case 3:
                            produto2.verificarValorDoEstoque();
                        case 4:
                            scanner.close();
                    }
                } while (opcao2 != 4);
        } else {
            System.out.println("Digite um valor válido!");
        }
    }
}