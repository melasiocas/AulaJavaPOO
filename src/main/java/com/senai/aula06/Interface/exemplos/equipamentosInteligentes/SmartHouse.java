package com.senai.aula06.Interface.exemplos.equipamentosInteligentes;

public class SmartHouse {
    public static void main(String[] args) {

        TvSmart tv1 = new TvSmart();
        LampadaInteligente lampada1 = new LampadaInteligente();
        
        AparelhoInteligente.mensagemBemVindo();
        lampada1.power();
        lampada1.power();
        tv1.power();
        tv1.power();
        tv1.aumentarVolume();
        tv1.baixarVolume();
        lampada1.aumentarBrilho();
        lampada1.baixarBrilho();
    }
}
