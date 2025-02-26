package com.senai.aula04.heranca.exemplos.empresa;

public class Empresa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 3000);
        Gerente g1 = new Gerente("Carlos", 4000, 1500);

        f1.exibirDados();
        g1.exibirDados();
    }
}
