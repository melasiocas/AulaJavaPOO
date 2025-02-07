package com.senai.aula03.encapsulamento.exercicios.ex2;

import java.util.ArrayList;
import java.util.Scanner;

import static com.senai.aula03.encapsulamento.exercicios.ex2.Funcionario.funcionarios;
import static com.senai.aula03.encapsulamento.exercicios.ex2.Funcionario.mostrarFuncionarios;

public class Main { public static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        cadastrarFuncionarios();
        mostrarFuncionarios(funcionarios);
        alterarSalario();

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
    }

    public static void cadastrarFuncionarios(){
        System.out.print("Quantos funcionários você deseja cadastrar? ");
        int qntFuncionario = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qntFuncionario; i++) {
            System.out.println("------ Funcionário " + (i+1) + " ------");
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
        }
    }
}
