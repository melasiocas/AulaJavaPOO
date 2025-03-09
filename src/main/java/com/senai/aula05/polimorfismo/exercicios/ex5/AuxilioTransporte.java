package com.senai.aula05.polimorfismo.exercicios.ex5;

public class AuxilioTransporte extends Beneficio {
    private double valorBeneficio = 400.00;
    private double salarioLiquido = calcularSalarioLiquido(valorBeneficio, getSalarioBruto());



    public double getValorBeneficio() {
        return valorBeneficio;
    }

    public void setValorBeneficio(double valorBeneficio) {
        this.valorBeneficio = valorBeneficio;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public AuxilioTransporte(double salarioBruto) {
        super(salarioBruto);
    }

    @Override
    public double calcularSalarioLiquido(double descontoSalarial, double salarioBruto) {
        salarioLiquido = salarioBruto - (descontoSalarial * salarioBruto);
        return salarioLiquido;
    }

    @Override
    public String emitirFolhaDePagamento() {
        return  "\n Beneficio          |  Auxílio Transporte" +
                "\n Desconto           |  R$" + String.format("%.2f", valorBeneficio) +
                "\n Salário Bruto      |  R$" + String.format("%.2f", getSalarioBruto()) +
                "\n Salário Líquido    |  R$" + String.format("%.2f", salarioLiquido);
    }
}
