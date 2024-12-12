package com.senai.aula01.exercicios.ex1;

import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void exibirDetalhes (){
        System.out.println("Nome: " + this.nome + "\n" +
                            "Preço: " + this.preco + "\n" +
                            "Quantidade: " + this.quantidade + "\n"
                );
    }
    public void atualizaEstoque (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("adicionar ou remover? (+/-)");
        String x = scanner.nextLine();

        if (x.equals("+")){
            System.out.println("Digite o valor que deseja adicionar: ");
            int qntadd = scanner.nextInt();
            this.quantidade += qntadd;
            System.out.println("A quantidade no estoque agora é " + this.quantidade);
        } else if (x.equals("-")) {
            System.out.println("Digite o valor que deseja remover: ");
            int qntrem = scanner.nextInt();
            this.quantidade -= qntrem;
            System.out.println("A quantidade no estoque agora é " + this.quantidade);
        } else {
            System.out.println("ERRO");
        }
    }
    public void verificarValorDoEstoque(){
        this.quantidade *= this.preco;
        System.out.println(" o valor do estoque é R$" + this.quantidade);
    }
}
