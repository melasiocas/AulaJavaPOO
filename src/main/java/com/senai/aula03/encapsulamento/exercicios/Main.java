package com.senai.aula03.encapsulamento.exercicios;

import java.util.Scanner;

public class Main {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Preço: ");
        double preco = scanner.nextDouble();

        Produto produto1 = new Produto(nome, preco);


        produto1.cadastrarProduto(produto1);
        produto1.mostrarArray();
    }

    }

