package com.senai.aula05.polimorfismo.exercicios.ex1;

public class JSON extends Relatorio{
    public JSON(String data, String autor) {
        super(data, autor);
    }

    @Override
    public String gerar() {
        return "Relatório feito por " + getAutor() + ", no dia " + getData() + ", gerado como arquivo JSON com sucesso...";
    }
}
