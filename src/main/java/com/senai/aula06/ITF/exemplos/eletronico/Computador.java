package com.senai.aula06.ITF.exemplos.eletronico;

public class Computador implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("Computador Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador Desligado");
    }
}
