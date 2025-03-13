package com.senai.aula05.polimorfismo.exercicios.ex5;

abstract class Beneficio {
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


}
