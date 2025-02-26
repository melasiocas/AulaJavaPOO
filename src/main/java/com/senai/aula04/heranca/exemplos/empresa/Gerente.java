package com.senai.aula04.heranca.exemplos.empresa;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados(){
        System.out.println( "-----------------------------" +
                          "\n Nome          | " + getNome() +
                          "\n Salário Total | R$" + (getSalario() + bonus)
        );
    }
}
