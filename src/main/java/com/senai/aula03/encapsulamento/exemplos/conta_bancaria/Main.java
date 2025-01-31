package com.senai.aula03.encapsulamento.exemplos.conta_bancaria;

import com.senai.aula03.encapsulamento.exemplos.conta_bancaria.ContaBancaria;
import com.senai.aula03.encapsulamento.exemplos.conta_bancaria.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria contaBancaria1 = new ContaBancaria(
                new Usuario(
                        "Melissa",
                        494135,
                        "06/02/2007"
                ),
                001,
                1000,
                "NuBank"
        );
        ContaBancaria contaBancaria2 = new ContaBancaria(
                new Usuario(
                        "Giovanna",
                        494135,
                        "05/12/2006"
                ),
                002,
                500,
                "itaú"
        );
        ContaBancaria contaBancaria3 = new ContaBancaria(
                new Usuario(
                        "Quidute",
                        345456,
                        "10/12/2008"
                ),
                003,
                1500,
                "Bradesco"
        );

        System.out.println(contaBancaria1);

        System.out.println(" 1. Sacar \n 2. Depositar \n 3. Transferir");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quanto você deseja sacar? ");
                int valorSaque = scanner.nextInt();
                contaBancaria1.sacar(valorSaque);
                break;
            case 2:
                System.out.println("Quanto você deseja depositar? ");
                int valorDeposito = scanner.nextInt();
                contaBancaria1.depositar(valorDeposito);
                break;
            case 3:
                System.out.println("Valor que você deseja transferir: ");
                int valorTransferencia = scanner.nextInt();

                System.out.println("Selecione o usuário que você deseja transferir: \n 1. " + contaBancaria1.getUsuario().getNome()
                        + "\n 2. " + contaBancaria2.getUsuario().getNome()
                        + "\n 3. " + contaBancaria3.getUsuario().getNome()
                );
                int opcao2 = scanner.nextInt();
                switch (opcao2) {
                    case 1:
                        contaBancaria1.transferir(valorTransferencia, contaBancaria1);
                        break;
                    case 2:
                        contaBancaria1.transferir(valorTransferencia, contaBancaria2);
                        break;
                    case 3:
                        contaBancaria1.transferir(valorTransferencia, contaBancaria3);
                }

        }
    }
}