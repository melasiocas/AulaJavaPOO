package com.senai.aula06.abstracao.exemplos.funcionarios;

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    public abstract double calculoBonus();

    public void exibirDados() {
        System.out.println(nome + " recebe R$" + salario);
    }
}
