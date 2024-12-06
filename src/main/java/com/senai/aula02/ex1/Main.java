package com.senai.aula02.ex1;

import javax.naming.spi.StateFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  ArrayList<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();

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
                    listaDeTarefas.add(new Tarefa(nomeTarefa, false));
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    listarTarefas();
                    for (Tarefa tarefa: listaDeTarefas){
                        System.out.println("Escolha uma tarefa para marcar como concluída: ");
                        int idTarefa = scanner.nextInt();
                        listaDeTarefas.get(idTarefa-1).statusConclusao=true;
                    }
                    break;
                case 4:
                    listarTarefas();
                    System.out.println("Escolha o id da tarefa para excluir: ");
                    listaDeTarefas.remove(scanner.nextInt()-1);
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Fim do Programa!!");
                    scanner.close();
                    break;
            }
        } while (opcao!=5);
    }
    public static void listarTarefas(){
        for (Tarefa tarefa: listaDeTarefas){
            System.out.println(tarefa);
        }
    }
}
