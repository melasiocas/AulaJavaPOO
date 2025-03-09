package com.senai.aula05.polimorfismo.exercicios.ex5;

public class ValeAlimentacao extends Beneficio {
    private double descontoSalarial = 0.15;
    private double valorBeneficio = descontoSalarial * getSalarioBruto();
    private double salarioLiquido = calcularSalarioLiquido(descontoSalarial, getSalarioBruto());

    public double getDescontoSalarial() {
        return descontoSalarial;
    }

    public void setDescontoSalarial(double descontoSalarial) {
        this.descontoSalarial = descontoSalarial;
    }

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

    public ValeAlimentacao(double salarioBruto) {
        super(salarioBruto);
    }

    @Override
    public double calcularSalarioLiquido(double descontoSalarial, double salarioBruto) {
        salarioLiquido = salarioBruto - (descontoSalarial * salarioBruto);
        return salarioLiquido;
    }

    @Override
    public String emitirFolhaDePagamento() {
        return  "\n Beneficio          |  Vale Alimentação" +
                "\n Desconto           |  25% - R$" + String.format("%.2f", valorBeneficio) +
                "\n Salário Bruto      |  R$" + String.format("%.2f", getSalarioBruto()) +
                "\n Salário Líquido    |  R$" + String.format("%.2f", salarioLiquido);
    }
}
