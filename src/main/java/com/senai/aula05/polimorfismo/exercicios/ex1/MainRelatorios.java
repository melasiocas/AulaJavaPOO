package com.senai.aula05.polimorfismo.exercicios.ex1;

public class MainRelatorios {
    public static void main(String[] args) {
        Relatorio[] relatorios = {
                new PDF("09/03/2025", "João"),
                new CSV("22/11/2025", "Guilherme"),
                new JSON("06/02/2025", "Melissa")
        };

        for (Relatorio r : relatorios) {
            System.out.println(r.gerar());
        }
    }
}
