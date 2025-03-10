package com.senai.aula06.ITF.exemplos.eletronico;

public class MainEletronicos {
    public static void main(String[] args) {
        ligarDesligar(new Computador());
        ligarDesligar(new Televisao());
    }
    public static void ligarDesligar(AparelhoEletronico aparelhoEletronico) {
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
