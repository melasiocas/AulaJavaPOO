package com.senai.aula04.heranca.exercicios.ex1;

public class Alimento extends Produto{
    private int dataValidade;

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Alimento(int ID, int qnt, double preco, String nome, int dataValidade) {
        super(ID, qnt, preco, nome);
        this.dataValidade = dataValidade;
    }
}
