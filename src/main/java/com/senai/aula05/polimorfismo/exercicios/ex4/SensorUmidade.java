package com.senai.aula05.polimorfismo.exercicios.ex4;

public class SensorUmidade extends Sensor{
    public SensorUmidade(boolean ligado, String clima) {
        super(ligado, clima);
    }

    @Override
    public String calcular() {
        return switch (getClima()) {
            case "sol" -> "Umidade atual: 0%";
            case "chuva" -> "Umidade atual: 100%";
            case "nublado" -> "Umidade atual: 50%";
            default -> "";
        };
    }
}
