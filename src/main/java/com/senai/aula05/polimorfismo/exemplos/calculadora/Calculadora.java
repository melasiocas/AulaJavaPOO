package com.senai.aula05.polimorfismo.exemplos.calculadora;

public class Calculadora {

    // sobrecarga de metodos

    // metodo para somar dois inteiros
   int somar(int a, int b) {
       return a + b;
   }

    // metodo para somar tres inteiros (mesmo nome, diferente quantidade de parametro)
   int somar (int a, int b, int c){
      return a + b + c;
   }

    // metodo para somar dois numero de ponto flutuante (mesmo nome, diferentes tipos de parametros)
   double somar (double a , double b) {
       return a + b;
   }
}
