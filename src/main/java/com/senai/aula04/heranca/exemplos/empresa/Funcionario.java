package com.senai.aula04.heranca.exemplos.empresa;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    public void exibirDados() {
        System.out.println("-----------------------------" +
                         "\n Nome    | " + nome +
                         "\n Salário | R$" + salario
        );
    }
}
