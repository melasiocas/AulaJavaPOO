package com.senai.aula05.polimorfismo.exercicios.ex3;

public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = {
            new ProdutoFisico(0, "Celular", 1400),
                    new ProdutoDigital(1, "Carro 3D", 50),
                    new ProdutoServico(2, "Netflix", 60)
        };

        for (Produto p : produtos) {
            System.out.println(p.mostrarDetalhes());
        }
    }
}
