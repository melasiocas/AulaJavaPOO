package com.senai.aula04.heranca.exercicios.ex4;

public class PacienteParticular extends Paciente{
    private int custoConsulta;

    public PacienteParticular(String nome, int idade, int custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    public int getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(int custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    @Override
    public String toString() {
        return  "\n Nome              | " + getNome() +
                "\n Idade             | " + getIdade() +
                "\n Valor Consulta    | " + custoConsulta +
                "\n Valor c/ Convênio | Você não tem convênio";
    }
}
