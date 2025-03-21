package com.senai.aula06.Interface.exemplos.smartwatch;

public class MainSmartWatch  {
    public static void main(String[] args) {
        SmartWatchAvancado s1 = new SmartWatchAvancado();

        s1.exibirInfoDispositivo();
        s1.medirFrequenciaCardiaca();
        s1.medirQualidadeSono();
        s1.contarPassos();
    }
}
