package com.senai.aula05.polimorfismo.exercicios.ex3;

public class ProdutoFisico extends Produto{
    private double imposto = 0.3;
    private double precoFinal = calcularPrecoFinal(getPreco(), imposto);

    public ProdutoFisico(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public double calcularPrecoFinal(double preco, double imposto) {
        precoFinal = preco + (preco * imposto);
        return precoFinal;
    }

    @Override
    public String mostrarDetalhes() {
        return  "\n ------------------------- "+
                "\n | ID                  " + getId() + " |" +
                "\n | Nome          " + getNome()  + " |" +
                "\n | Preço          " + getPreco() + " |" +
                "\n | Imposto           30% |" +
                "\n ------------------------- " +
                "\n | Preço Total    " + precoFinal + " |" +
                "\n ------------------------- ";
    }
}
