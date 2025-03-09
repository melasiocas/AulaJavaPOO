package com.senai.aula04.heranca.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;

import static com.senai.aula03.encapsulamento.ex2.Main.scanner;

class CompartilhadoNew {
    public static List<ProdutoNew> listaProdutos = new ArrayList<>();
}

public class MainMercadoNew {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcaoInt;
        do {
            System.out.print("""
                    1 - Adicionar produtos.
                    2 - Mostrar produtos.
                    3 - Editar quantidade do estoque.
                    4 - Calcular Valor de estoque.
                    5 - Sair.
                    """);
            String opcao = scanner.nextLine();
            opcaoInt = castingStringForNumber(opcao);

        } while (!(opcaoInt >= 1 && opcaoInt <= 6));

        switch (opcaoInt) {
            case 1:
                System.out.println("Quantos produtos você deseja cadastrar?");
                int qntProdutos = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < qntProdutos; i++) {
                    int id = i;

                    System.out.println("------ Produto " + (id) + " ------");


                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Quantidade no estoque: ");
                    int qnt = scanner.nextInt();
                    scanner.nextLine();

                    adicionarProduto(id, qnt, preco, nome);
                }
                espera();
                menu();
                break;
            case 2:
                mostrarProdutos();
                espera();
                menu();
                break;
            case 3:
                mostrarProdutos();
                System.out.println("Selecione o ID do produto que você deseja editar: ");
                int index1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Quantidade nova: ");
                int qntNova = scanner.nextInt();
                scanner.nextLine();

                editarQuantidade(index1, qntNova);
                espera();
                menu();
                break;
            case 4:
                System.out.println("Selecione o ID produto que deseja calcular o estoque: ");
                int index2 = scanner.nextInt();
                scanner.nextLine();

                calcularValorEstoque(index2);
                espera();
                menu();
                break;
            case 5:
                System.out.println("Encerrando o Programa...");
                espera();
                break;

        }
    }

    public static int castingStringForNumber(String input) {
        if (InputCheck(input) == true) {
            int inputInt = Integer.parseInt(input);
            return inputInt;
        } else {
            do {
                System.out.println("O valor inserido não é um número válido. Digite o valor novamente: ");
                input = scanner.nextLine();
            } while (InputCheck(input) == false);
            return Integer.parseInt(input);
        }
    }
}