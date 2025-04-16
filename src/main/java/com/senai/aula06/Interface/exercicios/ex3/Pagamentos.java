package com.senai.aula06.Interface.exercicios.ex3;

public interface Pagamentos {
     void autenticar (int senha, double valor, double parcelas);
     void validar(double valor, double parcelas);
     void registrar(double valor, double parcelas);
}
