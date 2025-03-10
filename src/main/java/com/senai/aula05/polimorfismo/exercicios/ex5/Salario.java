package com.senai.aula05.polimorfismo.exercicios.ex5;

public class Salario{
    private double Salario;
    private ValeAlimentacao B1 = new ValeAlimentacao(Salario);
    private PlanoDeSaude B2 = new PlanoDeSaude(Salario);
    private AuxilioTransporte B3 = new AuxilioTransporte(Salario);

    public Salario(double salario) {
        Salario = salario;
    }

    public String emitirFolhaDePagamento() {
         double totalBeneficios = B1.getValorBeneficio() + B2.getValorBeneficio() + B3.getValorBeneficio();
         double salarioLiquido = Salario - totalBeneficios;

         return  "\n-----------------------------------" +
                 "\n| Salário Bruto         R$" + String.format("%.2f", Salario) + " |" +
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
