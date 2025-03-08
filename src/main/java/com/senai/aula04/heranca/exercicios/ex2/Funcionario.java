package com.senai.aula04.heranca.exercicios.ex2;

public class Funcionario {
    private String nome;
    private int salario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
