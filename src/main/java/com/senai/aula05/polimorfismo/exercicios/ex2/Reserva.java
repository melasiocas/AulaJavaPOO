package com.senai.aula05.polimorfismo.exercicios.ex2;

public class Reserva {
    private String nome;
    private int dias;
    private int custoTotal;

    public Reserva(String nome, int dias) {
        this.nome = nome;
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(int custoTotal) {
        this.custoTotal = custoTotal;
    }

    public int calcularCustoTotal(){
        return 0;
    }

    @Override
    public String toString() {
        return "Reserva no nome de " + nome + " para " + dias + " dias" + " no valor de " + calcularCustoTotal();
    }
}
