package com.senai.aula03.encapsulamento.exemplos.conta_bancaria;

public class ContaBancaria {
    private Usuario usuario;
    private int numeroConta;
    private double saldo;
    private String nomeBanco;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    @Override
    public String toString() {
        return  "---------- Conta Bancaria ----------" + "\n" +
                "Usuário          | " + usuario + "\n" +
                "Nuúmero da Conta | " + numeroConta + "\n" +
                "Saldo            | " + saldo + "\n" +
                "Nome do Banco    | " + nomeBanco;
    }
}
