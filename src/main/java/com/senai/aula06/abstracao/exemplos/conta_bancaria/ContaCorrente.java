package com.senai.aula06.abstracao.exemplos.conta_bancaria;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        setSaldo(getSaldo()-20);
    }
}