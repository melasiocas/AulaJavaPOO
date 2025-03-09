package com.senai.aula05.polimorfismo.exercicios.ex4;

public class Aparelho {
    public static void main(String[] args) {
        Sensor[] sensores = {
                new SensorTemperatura(false, "nublado"),
                new SensorUmidade(false, "nublado")
        };

        for (Sensor s : sensores) {
            s.power();
        }
    }
}
