package com.senai.aula05.polimorfismo.exercicios.ex5;

public class Salario extends Beneficio{
    ValeAlimentacao B1 = new ValeAlimentacao(getSalarioBruto());
    PlanoDeSaude B2 = new PlanoDeSaude(getSalarioBruto());
    AuxilioTransporte B3 = new AuxilioTransporte(getSalarioBruto());

    public Salario(double salarioBruto) {
        super(salarioBruto);
    }

    @Override
    public String emitirFolhaDePagamento() {
         double totalBeneficios =  B1.getValorBeneficio() + B2.getValorBeneficio() + B3.getValorBeneficio();
         double salarioLiquido = getSalarioBruto() - totalBeneficios;
         return  "\n-----------------------------------" +
                 "\n| Salário Bruto         R$" + String.format("%.2f", getSalarioBruto()) + " |" +
                 "\n-----------------------------------" +
                 "\n| Vale alimentação       R$" + String.format("%.2f", B1.getValorBeneficio()) + " |" +
                 "\n| Plano de Saúde         R$" + String.format("%.2f", B2.getValorBeneficio()) + " |" +
                 "\n| Auxilio Transporte     R$" + String.format("%.2f", B3.getValorBeneficio()) + " |" +
                 "\n-----------------------------------" +
                 "\n| Total de Benefícios    R$" + String.format("%.2f", totalBeneficios) + " |" +
                 "\n| Salário Líquido        R$" + String.format("%.2f", salarioLiquido) + " |" +
                 "\n-----------------------------------";
    }
}
