package com.senai.aula05.polimorfismo.exercicios.ex5;

public class Beneficio {
    private double salarioBruto;

    public Beneficio(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double calcularSalarioLiquido(double descontoSalarial, double salarioBruto) {
        return 0;
    }

    public String emitirFolhaDePagamento() {
        return "";
    }
}
