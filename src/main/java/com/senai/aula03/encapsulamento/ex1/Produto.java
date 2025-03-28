package com.senai.aula03.encapsulamento.ex1;

import java.util.ArrayList;
import java.util.Scanner;


public class Produto {
Scanner scanner = new Scanner(System.in);

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = setPreco(preco);
    }

    public double getPreco() {
        return preco;
    }

    public double setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
            return preco;
        } else {
            System.out.println("Não é possível adicionar um preço negativo ou igual a zero.");
                do{
                    System.out.println("Erro. Digite um preço novo: ");
                    preco = scanner.nextDouble();
                    scanner.nextLine();
                } while (preco < 0);
        return preco;
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


}
