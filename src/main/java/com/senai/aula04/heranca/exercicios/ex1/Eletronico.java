package com.senai.aula04.heranca.exercicios.ex1;

public class Eletronico extends Produto {
    private int voltagem;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public Eletronico(int ID, int qnt, double preco, String nome, int voltagem) {
        super(ID, qnt, preco, nome);
        this.voltagem = voltagem;
    }
}
