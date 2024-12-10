package com.senai.aula01_classe_atributo_metodos.exercicios.ex1;

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
        System.out.println("Nome: " + nome + "\n" +
                            "Preço: " + preco + "\n" +
                            "Quantidade: " + quantidade + "\n"
                );
    }
    public void atualizaEstoque (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("adicionar ou remover? (+/-)");
        String x = scanner.nextLine();

        if (x.equals("+")){
            System.out.println("Digite o valor que deseja adicionar: ");
            int qntadd = scanner.nextInt();
            quantidade += qntadd;
            System.out.println("A quantidade no estoque agora é " + quantidade);
        } else if (x.equals("-")) {
            System.out.println("Digite o valor que deseja remover: ");
            int qntrem = scanner.nextInt();
            quantidade -= qntrem;
            System.out.println("A quantidade no estoque agora é " + quantidade);
        } else {
            System.out.println("Digite uma resposta válida!");
        }
    }
    public void verificarValorDoEstoque(){
        quantidade *= preco;
        System.out.println(" o valor do estoque é R$" + quantidade);
    }
}
