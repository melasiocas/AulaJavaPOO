package com.senai.aula04.heranca.exercicios.ex2;

import java.util.List;

public class Coordenador extends Funcionario{

    private Equipes equipe;

    public Coordenador(String nome, int salario, Equipes equipe) {
        super(nome, salario);
        this.equipe = (Equipes) equipe;
    }

    public Equipes getEquipe() {
        return (Equipes) equipe;
    }

    public void setEquipe(Equipes equipe) {
        this.equipe = (Equipes) equipe;
    }

    @Override
    public String toString() {
        return  "\nCoordenador(a) | " + getNome() +
                "\nEquipe         | " + equipe +
                "\n------------------------"
                ;
    }
}
