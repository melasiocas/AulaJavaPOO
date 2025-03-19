package com.senai.aula06.abstracao.exemplos.funcionarios;

public class FuncionarioTemporario extends Funcionario{
    private int horasExtras;
    private double valorHoraExtra;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valor) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calculoBonus() {
        return salario += horasExtras * valorHoraExtra;
    }
}
