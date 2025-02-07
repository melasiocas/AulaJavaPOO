package com.senai.aula03.encapsulamento.exercicios.ex2;

import java.util.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {

static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

Scanner scanner = new Scanner(System.in);
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = setNome(nome);
        this.salario = setSalario(salario);
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        if (nome == null || nome.isBlank()){
            do {
                System.out.println("Campo Nome não pode ser vazio ou nulo. Nome: ");
                nome = scanner.nextLine();
            } while (nome == null || nome.isBlank());
                return nome;
        } else {
            return nome;
        }

    }

    public double getSalario() {
        return salario;
    }

    public double setSalario(double salario) {
        if(salario < 1320.00){
            salario = 1320.00;
            return salario;
        } else {
            this.salario = salario;
            return salario;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static void mostrarFuncionarios(ArrayList funcionarios) {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("ID      | " + i);
            System.out.println(funcionarios.get(i));
        }
    }

    public void alterarSalario(int id, double novoSalario) {
        try{
        funcionarios.get(id).setSalario(novoSalario);
    } catch (IndexOutOfBoundsException e) {
            System.out.println("Problema detectado. Talvez id solicitado não foi encontrado no sistemas");
        }
        System.out.println("Salário Alterado com sucesso.");
        System.out.println("Funcionário: " + funcionarios.get(id).getNome() +
                "\nSalário novo: " + funcionarios.get(id).getSalario());
        }
    @Override
    public String toString() {
        return  "Nome    | " + nome + "\n" +
                "Salário | " + salario + "\n" +
                "Cargo   | " + cargo + "\n";
    }
}
