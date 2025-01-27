package com.senai.aula03.encapsulamento.exemplos.conta_bancaria;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();

        usuario1.setNome("Melissa");
        usuario1.setCPF(494135);
        usuario1.setDataNasc("06/02/2007");

        ContaBancaria contaBancaria1 = new ContaBancaria();

        contaBancaria1.setUsuario(usuario1);
        contaBancaria1.setNumeroConta(123);
        contaBancaria1.setNomeBanco("NuBank");
        contaBancaria1.setSaldo(294838.30);

        System.out.println(contaBancaria1);
    }
}
