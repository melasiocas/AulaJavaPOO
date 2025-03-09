package com.senai.aula05.polimorfismo.exercicios.ex1;

public class Relatorio {
    private String data;
    private String autor;

    public Relatorio( String data, String autor) {
        this.data = data;
        this.autor = autor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String gerar(){
        return "Relatório feito por " + getAutor() + ", no dia " + getData() + ", gerado com sucesso...";
    }
}
