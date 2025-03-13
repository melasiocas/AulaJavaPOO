package com.senai.aula05.polimorfismo.exercicios.ex5;

public class Salario{
        private double salario;
        private Beneficio beneficio;
        private ValeAlimentacao B1 = new ValeAlimentacao(beneficio.getSalarioBruto());
        private PlanoDeSaude B2 = new PlanoDeSaude(beneficio.getSalarioBruto());
        private AuxilioTransporte B3 = new AuxilioTransporte(beneficio.getSalarioBruto());


        public String emitirFolhaDePagamento() {
            double totalBeneficios = B1.getValorBeneficio() + B2.getValorBeneficio() + B3.getValorBeneficio();
            double salarioLiquido = salario - totalBeneficios;

            return "\n-----------------------------------" +
                    "\n| Salário Bruto         R$" + String.format("%.2f", salario) + " |" +
                    "\n-----------------------------------" +
                    "\n| Vale alimentação       R$" + String.format("%.2f", B1.getValorBeneficio()) + " |" +
                    "\n| Plano de Saúde         R$" + String.format("%.2f", B2.getValorBeneficio()) + " |" +
                    "\n| Auxilio Transporte     R$" + String.format("%.2f", B3.getValorBeneficio()) + " |" +
                    "\n-----------------------------------" +
                    "\n| Total de Benefícios    R$" + String.format("%.2f", totalBeneficios) + " |" +
                    "\n| Salário Líquido        R$" + String.format("%.2f", salarioLiquido) + " |" +
                    "\n-----------------------------------";
        }

         public Salario(double salario) {
              this.salario = salario;
         }
}
