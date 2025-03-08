package com.senai.aula04.heranca.exercicios.ex1;

public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, double preco, int qnt, String dataValidade) {
        super(nome, preco, qnt);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return  "--------------------------" +
                "\n Nome       | " + getNome() +
                "\n Preço      | " + getPreco() +
                "\n Quantidade | " + getQnt() +
                "\n Validade   | " + dataValidade
                ;
    }
}
