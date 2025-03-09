package com.senai.aula04.heranca.exercicios.ex4;

public class MainHospital {
    public static void main(String[] args) {
        PacienteParticular pp1 = new PacienteParticular(
                "Melissa",
                18,
                350
        );
        PacienteConvenio pc1 = new PacienteConvenio(
                "Guilherme",
                17,
                400
        );
        System.out.println(pp1);
        System.out.println(pc1);
    }
}
