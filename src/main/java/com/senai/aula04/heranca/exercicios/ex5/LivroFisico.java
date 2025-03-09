package com.senai.aula04.heranca.exercicios.ex5;

public class LivroFisico extends Livro{
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return  "\n Nome       | " + getTitulo() +
                "\n Autor      | " + getAutor() +
                "\n Página     | " + getNumeroPaginas();
    }
}
