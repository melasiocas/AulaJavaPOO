package com.senai.aula03.encapsulamento.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> produtos = new ArrayList<Produto>();


    public static void main(String[] args) {

        cadastrarProdutos();
        mostrarProdutos(produtos);

    }

    public static void cadastrarProdutos(){
        System.out.println("Quantos produtos você deseja cadastrar?");
        int qntProduto = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qntProduto; i++) {
            System.out.println("------ Produto " + (i+1) + " ------");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();


            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            produtos.add(new Produto(nome, preco));
        }
    }
    public static void mostrarProdutos(ArrayList produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("--------------");
            System.out.println(produtos.get(i));
        }
    }
}

