package com.senai.aula04.heranca.exercicios.ex5;

public class LivroDigital extends Livro{
    private int tamanhosArquivoMB;

    public LivroDigital(String titulo, String autor, int tamanhosArquivoMB) {
        super(titulo, autor);
        this.tamanhosArquivoMB = tamanhosArquivoMB;
    }

    public int getTamanhosArquivoMB() {
        return tamanhosArquivoMB;
    }

    public void setTamanhosArquivoMB(int tamanhosArquivoMB) {
        this.tamanhosArquivoMB = tamanhosArquivoMB;
    }

    @Override
    public String toString() {
        return  "\n Nome       | " + getTitulo() +
                "\n Autor      | " + getAutor() +
                "\n Tamanho MB | " + getTamanhosArquivoMB();
    }
}
