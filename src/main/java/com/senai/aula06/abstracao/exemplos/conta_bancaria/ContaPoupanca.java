package com.senai.aula06.abstracao.exemplos.conta_bancaria;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        setSaldo(getSaldo()-(getSaldo()*0.05));
    }
}
