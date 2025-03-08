package com.senai.aula04.heranca.exercicios.ex2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professor p1 = new Professor(
                "Rafael Costa",
                5000,
                "PBEND"
        );

        Professor p2 = new Professor(
                "Ricardo Orrico",
                5000,
                "LGM"
        );

        Professor p3 = new Professor(
                "Tércio",
                3000,
                "BD"
        );

        Professor p4 = new Professor(
                "Roger",
                3500,
                "PS"
        );

        Professor p5 = new Professor(
                "Rafael Oliveira",
                5000,
                "PFEND"
        );

        Professor p6 = new Professor(
                "Lucas Felfoldi",
                4500,
                "ARI"
        );

        Equipes equipe1 = new Equipes(
                "Professores Dev-1",
                p2,
                p1,
                p6
        );

        Equipes equipe2 = new Equipes(
                "Professores Dev-2",
                p3,
                p4,
                p5
        );

        Coordenador c1 = new Coordenador(
                "Tatiane",
                5000,
                equipe1
        );

        Coordenador c2 = new Coordenador(
                "Denise",
                7000,
                equipe2
        );

        System.out.println(c1);
        System.out.println(c2);
    }
}
