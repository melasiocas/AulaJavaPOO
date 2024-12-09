package com.senai.aula02.ex1;

public class Tarefa {
    String nomeTarefa;
    boolean statusConclusao;

    public Tarefa(String nomeTarefa, boolean statusConclusao) {
        this.nomeTarefa = nomeTarefa;
        this.statusConclusao = statusConclusao;
    }

    @Override
    public String toString() {
        return String.format("%s - [%s]", nomeTarefa, statusConclusao ? "Concluída." : "Pendente.");
    }
}
