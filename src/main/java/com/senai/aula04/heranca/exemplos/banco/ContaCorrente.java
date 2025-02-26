package com.senai.aula04.heranca.exemplos.banco;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente (String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (super.getSaldo() + limite)) {
            System.out.println();
        } else {
            System.out.println("Saldo e limite insuficiente");
        }
    }
}
