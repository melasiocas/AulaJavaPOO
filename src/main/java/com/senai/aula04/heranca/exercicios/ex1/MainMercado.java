package com.senai.aula04.heranca.exercicios.ex1;

import static com.senai.aula03.encapsulamento.exercicios.ex2.Main.scanner;

public class MainMercado {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcaoInt;
        do {
           System.out.print("""
                   1 - Exibir Produtos existentes.
                   2 - Mostrar Quantidade no Estoque.
                   3 - Mostrar Valor total de Estoque.
                   5 - Mudar Quantidade do Estoque.
                   5 - Adicionar novos produtos.
                   6 - Sair.
                   """);
           String opcao = scanner.nextLine();
           opcaoInt = castingStringForNumber(opcao);

        } while (!(opcaoInt >= 1 && opcaoInt <= 6));

            switch (opcaoInt) {
                case 1:
                    menu();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    menu();
                    break;
                case 4:
                    menu();
                    break;
                case 5:
                    menu();
                    break;
                case 6:
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


}
