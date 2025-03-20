package com.senai.aula06.abstracao.exemplos.equipamentosInteligentes;

public class TvSmart implements AparelhoInteligente{
    private int volume;
    private boolean power;

    public TvSmart() {
        this.volume = 0;
        this.power = false;
    }

    public void power() {
     if (!power) {
            System.out.println("Ligando TV...");
            power = true;
        } else {
            System.out.println("Desligando TV...");
            power = false;
        }
    }

    public void aumentarVolume() {
        if (power == false) {
            System.out.println("Ligue a TV antes de ajustar o volume.");
        } else {
            System.out.println("Volume " + (volume = ajustarNivel(volume, 10)));
        }
    }

    public void baixarVolume() {
        if (power == false) {
            System.out.println("Ligue a TV antes de ajustar o volume.");
        } else {
            System.out.println("Volume " + (volume = ajustarNivel(volume, -10)));
        }
    }
}
