package com.senai.aula06.abstracao.exemplos.funcionarios;

public class FuncionarioEfetivo extends Funcionario {
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calculoBonus() {
        return salario += bonusMensal;
    }
}
