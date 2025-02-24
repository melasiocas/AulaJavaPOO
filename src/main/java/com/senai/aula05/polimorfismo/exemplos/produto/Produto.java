package com.senai.aula05.polimorfismo.exemplos.produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor 1 - Apenas o nome do produto
    public Produto (String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidade = 0;
    }

    // Construtor 2 - Nome  e preco
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    // Construtor 3 - Nome, preco e quantidade
    public Produto (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        System.out.println(" nome: " + nome +
                           "\n preço: " + preco +
                           "\n quantidade: " + quantidade);
    }
}
