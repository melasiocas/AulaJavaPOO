package com.senai.aula03.encapsulamento.exercicios;

import java.util.ArrayList;

public class Produto {

    static ArrayList<Produto> listaProdutos = new ArrayList<>();
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Não é possível adicionar um preço negativo ou igual a zero.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "Nome  | " + nome + "\n" +
                "Preço | " + preco;
    }

    public void cadastrarProduto(Produto nomeProduto) {
        listaProdutos.add(nomeProduto);
    }
    public void mostrarArray(){
        for (Produto item : listaProdutos) {
            System.out.println(item.toString());
        }
    }
}
