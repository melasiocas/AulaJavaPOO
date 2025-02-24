package com.senai.aula04.heranca.exercicios.ex1;

import static com.senai.aula03.encapsulamento.exercicios.ex2.Main.scanner;

public class MainMercado {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Main Mercado!");
       menu();
    }
    public static void menu(){
            System.out.println("""
                    1 - Exibir Produtos existentes.
                    2 - Mostrar Quantidade no Estoque.
                    3 - Mostrar Valor total de Estoque.
                    5 - Mudar Quantidade do Estoque.
                    6 - Adicionar novos produtos.
                    6 - Sair.
                    """);
            int opcao = scanner.nextInt();
            scanner.nextLine();
        do{

            switch (opcao){
                case 1:
                    menu();
                case 2:
                    menu();
                case 3:
                    menu();
                case 4:
                    menu();
                case 5:
                    break;
            }
        } while (opcao != 5);
    }
}
