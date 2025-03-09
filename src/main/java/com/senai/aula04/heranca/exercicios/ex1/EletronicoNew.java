package com.senai.aula04.heranca.exercicios.ex1;

public class EletronicoNew extends ProdutoNew {
    private int voltagem;

    public EletronicoNew(String nome, double preco, int qnt, int voltagem) {
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
