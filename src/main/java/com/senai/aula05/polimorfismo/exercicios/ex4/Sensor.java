package com.senai.aula05.polimorfismo.exercicios.ex4;

public class Sensor {
    private boolean ligado;
    private String clima;

    public Sensor(boolean ligado, String clima) {
        this.ligado = ligado;
        this.clima = clima;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void power() {

        if (!ligado){
            setLigado(true);
            System.out.println("Ligando aparelho...");
            System.out.println(calcular());
        } else {
            setLigado(false);
            System.out.println("Desligando aparelho...");
        }
    }

    public String calcular(){
        return "";
    }
}
