package com.senai.aula06.Interface.exercicios.ex1;

import static com.senai.aula03.encapsulamento.ex2.Main.scanner;

public class MainAeroporto {
    public static void main(String[] args) {
        FlySafeContrato.boasVindas();

        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("CPF: ");
        int CPF = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Peso da bagagem: ");
        double pesoBagagem = scanner.nextDouble();
        scanner.nextLine();


        int opcaoInt;
            System.out.println(""" 
                        Viagem:
                        1 - Nacional.
                        2 - Internacional."""
            );
            opcaoInt = scanner.nextInt();
            scanner.nextLine();

            boolean tipoViagem = false;

            if (opcaoInt == 1) {
                tipoViagem = true;
            } else if (opcaoInt == 2) {
                tipoViagem = false;
            }

        AirFlyer c1 = new AirFlyer(
        nomeCliente,
        CPF,
        pesoBagagem,
        tipoViagem
);
            c1.validarDocumento();
            c1.emitirCartaoEmbarque();

            }
        }


