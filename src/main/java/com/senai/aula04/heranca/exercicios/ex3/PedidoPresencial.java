package com.senai.aula04.heranca.exercicios.ex3;

public class PedidoPresencial extends Pedido{
    private double descontoPagamentoAvista = (getValorTotal() * 0.1);

    public PedidoPresencial(int numeroPedido, int valorTotal) {
        super(numeroPedido, valorTotal);
    }

    public double getDescontoPagamentoAvista() {
        return descontoPagamentoAvista;
    }

    public void setDescontoPagamentoAvista(int descontoPagamentoAvista) {
        this.descontoPagamentoAvista = descontoPagamentoAvista;
    }

    public double ValorFinal() {
        double valorFinal = getValorTotal() - descontoPagamentoAvista;
        return valorFinal;
    }

    @Override
    public String toString() {
        return   "\n ------- Pedido " + getNumeroPedido() + " -------" +
                "\n| Valor             " + getValorTotal() + " |" +
                "\n| Desconto           " + descontoPagamentoAvista + " |" +
                "\n ------------------------" +
                "\n| Total             " + ValorFinal() + " |" +
                "\n ------------------------";
    }
}
