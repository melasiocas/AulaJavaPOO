package com.senai.aula04.heranca.exercicios.ex1;

import com.senai.aula03.encapsulamento.exercicios.ex2.Funcionario;

import java.util.ArrayList;

public class Produto {
    static ArrayList<Produto> produtos = new ArrayList<Produto>();

   private String nome;
   private double preco;
   private int quantidade;

    public Produto(int qnt, double preco, String nome) {
        this.quantidade = qnt;
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhesDoProduto(){
        System.out.println(" Nome       | " + nome +
                           "\n Preço      | " + preco +
                           "\n Quantidade | " + quantidade);
   }

}
