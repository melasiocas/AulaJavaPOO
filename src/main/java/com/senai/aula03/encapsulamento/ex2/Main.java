package com.senai.aula03.encapsulamento.ex2;

import java.util.Scanner;

import static com.senai.aula03.encapsulamento.ex2.Funcionario.funcionarios;
import static com.senai.aula03.encapsulamento.ex2.Funcionario.mostrarFuncionarios;

public class Main { public static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        menu();
    }

    public static void menu (){
        int opcao;

        System.out.print("""
                --------------------------------------
                |             Bem-Vindo!             |
                --------------------------------------
                | 1 - Cadastrar                      |
                | 2 - Alterar                        |
                | 3 - Mostrar todos os funcionário   |
                | 4 - Sair                           |
                --------------------------------------
                """);
        opcao = scanner.nextInt();
        scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarFuncionarios();
                    break;
                case 2:
                    alterarSalario();
                    break;
                case 3:
                    mostrarFuncionarios(funcionarios);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente:");
                    do{
                        menu();
                    } while (opcao < 0 || opcao > 4);
                    break;
            }

    }
    public static void alterarSalario() {
        mostrarFuncionarios(funcionarios);
        System.out.print("Id do funcionário que você deseja alterar o salário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Novo salário:");
        double novoSalario = scanner.nextDouble();
        scanner.nextLine();

        funcionarios.get(id).alterarSalario(id, novoSalario);
        menu();
    }

    public static void cadastrarFuncionarios(){
        System.out.print("Quantos funcionários você deseja cadastrar? ");
        int qntFuncionario = scanner.nextInt();
        scanner.nextLine();

        if(qntFuncionario <= 0){
                System.out.println("Não é possível cadastrar menos que 1 funcionário.");
            cadastrarFuncionarios();
        } else {

            for (int i = 0; i < qntFuncionario; i++) {
                System.out.println("------ Funcionário " + (i + 1) + " ------");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();


                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("----- Cargo ----- \n" +
                        " 1 - Gerente \n" +
                        " 2 - Analista \n" +
                        " 3 - Programador");
                int opcaoCargo = scanner.nextInt();
                scanner.nextLine();

                String cargo = switch (opcaoCargo) {
                    case 1 -> "Gerente";
                    case 2 -> "Analista";
                    case 3 -> "Programador";
                    default -> "";
                };

                funcionarios.add(new Funcionario(nome, salario, cargo));
                menu();
            }
        }
    }
}
