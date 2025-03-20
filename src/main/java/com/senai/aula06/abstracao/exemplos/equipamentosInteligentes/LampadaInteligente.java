package com.senai.aula06.abstracao.exemplos.equipamentosInteligentes;

public class LampadaInteligente implements AparelhoInteligente{
    private int brilho;
    private boolean power;

    public LampadaInteligente() {
        this.brilho = 0;
        this.power = false;
    }

    public void power() {
        if (!power) {
            System.out.println("Ligando lâmpada...");
            power = true;
        } else {
            System.out.println("Desligando lâmpada...");
            power = false;
        }
    }

    public void aumentarBrilho() {
        if (!power) {
            System.out.println("Ligue a lâmpada antes de ajustar o brilho.");
        } else {
            System.out.println("Brilho " + (brilho = ajustarNivel(brilho, 10)));
        }
    }

    public void baixarBrilho() {
        if (!power) {
            System.out.println("Ligue a lâmpada antes de ajustar o brilho.");
        } else {
            System.out.println("Brilho " + (brilho = ajustarNivel(brilho, -10)));
        }
    }

}
