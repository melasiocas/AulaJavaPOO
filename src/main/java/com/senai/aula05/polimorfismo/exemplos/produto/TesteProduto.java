package com.senai.aula05.polimorfismo.exemplos.produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        Produto p2 = new Produto("Smartphone", 3000);
        Produto p3 = new Produto("Monitor", 1500, 5);

        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();
    }
}
