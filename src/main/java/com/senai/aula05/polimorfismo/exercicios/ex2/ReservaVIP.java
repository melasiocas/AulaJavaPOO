package com.senai.aula05.polimorfismo.exercicios.ex2;

public class ReservaVIP extends Reserva{
    public ReservaVIP(String nome, int dias) {
        super(nome, dias);
    }

    @Override
    public int calcularCustoTotal() {
        int calculo = getDias() * 300;
        setCustoTotal(calculo);
        return calculo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
