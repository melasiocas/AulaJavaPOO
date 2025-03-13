package com.senai.aula05.polimorfismo.exercicios.ex5;

public class FolhaDePagamento {
    public static void main(String[] args) {

        Salario salarioMinimo = new Salario(
             1500
     );
     Salario salarioMedio = new Salario(
             5500
     );
     Salario salarioMaximo = new Salario(
             9500
     );
        System.out.println(salarioMinimo.emitirFolhaDePagamento());
        System.out.println(salarioMedio.emitirFolhaDePagamento());
        System.out.println(salarioMaximo.emitirFolhaDePagamento());
    }
}
