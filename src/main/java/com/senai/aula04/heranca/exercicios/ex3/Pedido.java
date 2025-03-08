package com.senai.aula04.heranca.exercicios.ex3;

public class Pedido {
    private int numeroPedido;
    private double valorTotal;

    public Pedido(int numeroPedido, int valorTotal) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
}
