package com.senai.aula04.heranca.exercicios.ex3;

public class PedidoOnline extends Pedido{
    private double taxaEntrega = (getValorTotal() * 0.1);

    public PedidoOnline(int numeroPedido, int valorTotal) {
        super(numeroPedido, valorTotal);
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(int taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public double ValorFinal(){
        double valorFinal = getValorTotal() + taxaEntrega;
        return valorFinal;
    }

    @Override
    public String toString() {
        return   "\n ------- Pedido " + getNumeroPedido() + " -------" +
                "\n| Valor             " + getValorTotal() + " |" +
                "\n| Taxa               " + taxaEntrega + " |" +
                "\n ------------------------" + " "+
                "\n| Total             " + ValorFinal() + " |" +
                "\n ------------------------";
    }
}
