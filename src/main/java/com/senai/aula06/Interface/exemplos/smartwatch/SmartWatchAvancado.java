package com.senai.aula06.Interface.exemplos.smartwatch;

public class SmartWatchAvancado implements SensorPassos, SensorCardiaco, SensorSono{
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição Cardíaca: 80 bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 4500 passos");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade de sono: 07h30 sono profundo");
    }

    void exibirInfoDispositivo(){
        System.out.println("Smart Avançado conectado com multiplos sensores");
    }
}
