package com.senai.aula05.polimorfismo.exercicios.ex3;

public class ProdutoDigital extends Produto{
    private double imposto = 0.1;
    private double precoFinal = calcularPrecoFinal(getPreco(), imposto);

    public ProdutoDigital(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
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
                "\n | Nome         " + getNome()  + " |" +
                "\n | Preço            " + getPreco() + " |" +
                "\n | Imposto           10% |" +
                "\n ------------------------- " +
                "\n | Preço Total      " + precoFinal + " |" +
                "\n ------------------------- ";
    }
}
