package com.senai.aula04.heranca.exercicios.ex1;

import static com.senai.aula03.encapsulamento.ex2.Main.scanner;

public class MainMercado {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int opcaoInt;
        do {
           System.out.print("""
                   1 - Adicionar produtos.
                   2 - Mostrar produtos.
                   3 - Editar Quantidade do Estoque.
                   4 - Sair.
                   """);
           String opcao = scanner.nextLine();
           opcaoInt = castingStringForNumber(opcao);

        } while (!(opcaoInt >= 1 && opcaoInt <= 6));

            switch (opcaoInt) {
                case 1:
                    adicionarProduto();
                    menu();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    menu();
                    break;
                case 4:
                    System.out.println("Encerrando o Programa...");
                    break;
            }
        }

    public static boolean InputCheck (String input){
    try{
        Integer.parseInt(input);
        return true;
    } catch (NumberFormatException e){
        return false;
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

    public static void adicionarProduto(){
        System.out.println("Quantos produtos você deseja cadastrar?");
        int qntProdutos = scanner.nextInt();
        scanner.nextLine();


    }

}
