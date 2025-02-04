package com.senai.aula03.encapsulamento.exercicios.ex2;

import static com.senai.aula03.encapsulamento.exercicios.ex2.Main.scanner;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = setNome(nome);
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {

        return nome;
    }

    public String setNome(String nome) {
        if (null == nome || nome.isBlank()){
            do {
                System.out.println("Campo Nome não pode ser vazio ou nulo. Nome: ");
                nome = scanner.nextLine();
            } while (null == nome || nome.isBlank());
            return nome;
        } else {
            this.nome = nome;
            return nome;
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  "Nome    | " + nome + "\n" +
                "Salário | " + salario + "\n" +
                "Cargo   | " + cargo + "\n";
    }
}
