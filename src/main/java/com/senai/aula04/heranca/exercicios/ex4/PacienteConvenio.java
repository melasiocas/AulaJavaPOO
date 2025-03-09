package com.senai.aula04.heranca.exercicios.ex4;

public class PacienteConvenio extends PacienteParticular{
    private double desconto;

    public PacienteConvenio(String nome, int idade, int custoConsulta) {
        super(nome, idade, custoConsulta);
    }

    public double getDesconto(int custoConsulta) {
        desconto = custoConsulta - (custoConsulta * 0.5);
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return  "\n Nome              | " + getNome() +
                "\n Idade             | " + getIdade() +
                "\n Valor Consulta    | " + getCustoConsulta() +
                "\n Valor c/ Convênio | " + getDesconto(getCustoConsulta());

    }
}
