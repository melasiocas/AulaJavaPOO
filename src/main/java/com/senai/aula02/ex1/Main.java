package com.senai.aula02.ex1;

import javax.naming.spi.StateFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> ListaDeTarefas = new ArrayList<Tarefa>();

        String menu = """
                Escolha uma opção:
                    1 - Cadastrar Tarefa.
                    2 - Exibir Tarefa.
                    3 - Atualizar Tarefa.
                    4 - Deletar Tarefa.
                    5 - Sair.
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa: ");
                    String nomeTarefa = scanner.nextLine();
                    ListaDeTarefas.add(new Tarefa(nomeTarefa, false));
                    break;
                case 2:
                    for (Tarefa tarefa : ListaDeTarefas) {
                        System.out.println((ListaDeTarefas.lastIndexOf(tarefa) + 1) + " - " + tarefa);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Fim do Programa!!");
                    scanner.close();
                    break;
            }
        } while ();
    }
}
