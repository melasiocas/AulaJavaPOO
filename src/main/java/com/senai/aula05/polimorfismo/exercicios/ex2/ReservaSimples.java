package com.senai.aula05.polimorfismo.exercicios.ex2;

public class ReservaSimples extends Reserva{
    public ReservaSimples(String nome, int dias) {
        super(nome, dias);
    }

    @Override
    public int calcularCustoTotal() {
        int calculo = getDias() * 150;
        setCustoTotal(calculo);
        return calculo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
