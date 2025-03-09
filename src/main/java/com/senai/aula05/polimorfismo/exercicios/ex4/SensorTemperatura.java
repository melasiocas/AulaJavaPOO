package com.senai.aula05.polimorfismo.exercicios.ex4;

public class SensorTemperatura extends Sensor{
    public SensorTemperatura(boolean ligado, String clima) {
        super(ligado, clima);
    }

    @Override
    public String calcular() {
        return switch (getClima()) {
            case "sol" -> "Temperatura atual: 25°C";
            case "chuva" -> "Temperatura atual: 20°C";
            case "nublado" -> "Temperatura atual: 15°C";
            default -> "";
        };
    }
}
