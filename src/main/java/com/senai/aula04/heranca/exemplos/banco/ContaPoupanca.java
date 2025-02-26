package com.senai.aula04.heranca.exemplos.banco;

public class ContaPoupanca extends Conta{
    private double tavaRedimento;

    public ContaPoupanca(String titular, double saldo, double tavaRedimento) {
        super(titular, saldo);
        this.tavaRedimento = tavaRedimento;
    }

    public double getTavaRedimento() {
        return tavaRedimento;
    }

    public void setTavaRedimento(double tavaRedimento) {
        this.tavaRedimento = tavaRedimento;
    }

    public void aplicarRendimento() {
        super.saldo += super.saldo * tavaRedimento;
    }
}
