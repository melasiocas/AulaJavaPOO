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

            int opcao;
            int opcaoproduto;
            do {
                System.out.println("\n--------- Produtos ---------\n" +
                                   "| 1 - Leite.               |\n" +
                                   "| 2 - Café.                |\n" +
                                   "| 3 - Fechar o sistema.    |\n" +
                                   "----------------------------"
                );
                opcaoproduto = scanner.nextInt();
                scanner.nextLine();

                do {
                    System.out.println("-----------------------------------------\n" +
                                       "| 1 - Exibir detalhes do produto.       |\n" +
                                       "| 2 - Atualizar estoque.                |\n" +
                                       "| 3 - Verificar valor do estoque atual. |\n" +
                                       "| 4 - Voltar ao menu.                   |\n" +
                                       "-----------------------------------------\n"
                );
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcaoproduto == 1){
                switch (opcao) {
                    case 1:
                        produto1.exibirDetalhes();
                        break;
                    case 2:
                        produto1.atualizaEstoque();
                        break;
                    case 3:
                        produto1.verificarValorDoEstoque();
                        break;
                    case 4:
                        scanner.close();
                        break;
                    }
                } else if (opcaoproduto == 2) {
                switch (opcao) {
                    case 1:
                        produto2.exibirDetalhes();
                        break;
                    case 2:
                        produto2.atualizaEstoque();
                        break;
                    case 3:
                        produto2.verificarValorDoEstoque();
                        break;
                    case 4:
                        break;
                }
                } else if (opcaoproduto == 3) {
                    System.out.println("---------- Fim do Programa ----------");
                    scanner.close();
                }
                } while (opcao != 4);
            } while (opcaoproduto != 3);
    }
}