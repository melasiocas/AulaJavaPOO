package com.senai.aula05.polimorfismo.exercicios.ex1;

public class PDF extends Relatorio{
    public PDF(String data, String autor) {
        super(data, autor);
    }

    @Override
    public String gerar() {
        return "Relatório feito por " + getAutor() + ", no dia " + getData() + ", gerado como arquivo PDF com sucesso...";

    }
}
