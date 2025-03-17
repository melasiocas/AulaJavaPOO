package com.senai.aula06.abstracao.exemplos.conta_bancaria;

public class MainContaBanco {
    public static void main(String[] args) {
        System.out.println("---------- Conta Corrente ----------");
        infoConta(new ContaCorrente("Melissa", 1000));
        System.out.println("------------------------------------");
        System.out.println("---------- Conta Poupança ----------");
        infoConta(new ContaPoupanca("Giovanna", 1000));
        System.out.println("------------------------------------");
    }

    public static void infoConta(ContaBancaria contaBancaria) {
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }

}
