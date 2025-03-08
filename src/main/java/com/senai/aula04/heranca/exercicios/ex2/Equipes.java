package com.senai.aula04.heranca.exercicios.ex2;

public class Equipes {
    private String nomeDaEquipe;
    private Professor professorChefe;
    private Professor professor1;
    private Professor professor2;

    public Equipes(String nomeDaEquipe, Professor professorChefe, Professor professor1, Professor professor2) {
        this.nomeDaEquipe = nomeDaEquipe;
        this.professorChefe = professorChefe;
        this.professor1 = professor1;
        this.professor2 = professor2;
    }

    public String getNomeDaEquipe() {
        return nomeDaEquipe;
    }

    public void setNomeDaEquipe(String nomeDaEquipe) {
        this.nomeDaEquipe = nomeDaEquipe;
    }

    public Professor getProfessorChefe() {
        return professorChefe;
    }

    public void setProfessorChefe(Professor professorChefe) {
        this.professorChefe = professorChefe;
    }

    public Professor getProfessor1() {
        return professor1;
    }

    public void setProfessor1(Professor professor1) {
        this.professor1 = professor1;
    }

    public Professor getProfessor2() {
        return professor2;
    }

    public void setProfessor2(Professor professor2) {
        this.professor2 = professor2;
    }

    @Override
    public String toString() {
        return nomeDaEquipe +
                "\n------------------------" +
                "\n " + professorChefe +
                "\n " + professor1 +
                "\n " + professor2
                ;
    }
}
