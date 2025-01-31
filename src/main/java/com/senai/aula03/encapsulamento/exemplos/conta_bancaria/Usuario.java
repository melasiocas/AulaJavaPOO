package com.senai.aula03.encapsulamento.exemplos.conta_bancaria;

public class Usuario {

    private String nome;
    private int CPF;
    private String dataNasc;

    public Usuario(String nome, int CPF, String dataNasc) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return  nome +
                " (CPF: " + CPF +
                " - Data de Nasc: " + dataNasc + ")";
    }
}

