package com.senai.aula04.heranca.exercicios.ex2;

import java.util.Collection;

public class Professor extends Funcionario {
    private String diciplina;

    public Professor(String nome, int salario, String diciplina) {
        super(nome, salario);
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    @Override
    public String toString() {
        return  getNome() + " - " + getDiciplina();
    }
}
