package com.senai.aula03.encapsulamento.exemplos.conta_bancaria;

import com.senai.aula03.encapsulamento.exemplos.conta_bancaria.Usuario;

public class ContaBancaria {
    private Usuario usuario;
    private int numeroConta;
    private int saldo;
    private String nomeBanco;

    public ContaBancaria(Usuario usuario, int numeroConta, int saldo, String nomeBanco) {
        this.usuario = usuario;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeBanco = nomeBanco;
    }

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
    public void sacar (int valor){

        if(this.saldo >= valor && valor > 0){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso. Saldo atual do cliente : " + this.saldo); //arrumar, colocar o cliente que vai receber
        } else {
            System.out.println("Saque não aprovado, saldo insuficiente");
        }
    }
    public void depositar(int valor){
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito efetuado com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Depósito cancelado. Você não pode realizar um depósito negativo."); //arrumar, colocar o cliente que vai receber
        }
    }
    public void transferir(int valor, ContaBancaria contadestino){
        sacar(valor);
        contadestino.depositar(valor);
    }
}



