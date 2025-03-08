package com.senai.aula04.heranca.exercicios.ex1;

public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(String nome, double preco, int qnt, int voltagem) {
        super(nome, preco, qnt);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return  "--------------------------" +
                "\n Nome       | " + getNome() +
                "\n Preço      | " + getPreco() +
                "\n Quantidade | " + getQnt() +
                "\n Voltagem   | " + voltagem
                ;
    }
}
