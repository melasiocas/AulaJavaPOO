package com.senai.aula05.polimorfismo.exercicios.ex1;

public class CSV extends Relatorio{
    public CSV(String data, String autor) {
        super(data, autor);
    }

    @Override
    public String gerar() {
        return "Relatório feito por " + getAutor() + ", no dia " + getData() + ", gerado como arquivo CSV com sucesso...";
    }
}
