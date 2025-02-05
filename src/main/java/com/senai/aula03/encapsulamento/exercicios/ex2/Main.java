package com.senai.aula03.encapsulamento.exercicios.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main { public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();


    public static void main(String[] args) {
        System.out.println("");
        cadastrarFuncionarios();
        mostrarFuncionarios(funcionarios);

    }

    public static void cadastrarFuncionarios(){
        System.out.println("Quantos funcionários você deseja cadastrar?");
        int qntProduto = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qntProduto; i++) {
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
    public static void mostrarFuncionarios(ArrayList funcionarios) {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("--------------");
            System.out.println(funcionarios.get(i));
        }
    }
}
