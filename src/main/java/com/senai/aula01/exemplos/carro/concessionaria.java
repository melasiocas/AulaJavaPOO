package com.senai.aula01_classe_atributo_metodos.carro;

public class concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Honda",
                "City",
                "XXX4444",
                (byte) 4,
                "grena",
                10000.0,
                2013);

        carro1.marca = "Honda";
        carro1.anoFabricacao = 2013;
        carro1.placa = "XXX4444";
        carro1.cor = "grena";
        carro1.precoBase = 10000.0;
        carro1.portas = 4;

        carro1.verificarInformacoes();
        carro1.ligarCarro();
        carro1.testarSom();
        carro1.consultarPlaca();
        carro1.consultarPreco(2024);

        Carro carro2 = new Carro(
                "Chevrolet",
                "Trailblazer Premier",
                "PJX4899", (byte) 4,
                "preto",
                277900.0,
                2023);

        carro2.marca = "Chevrolet";
        carro2.anoFabricacao = 2023;
        carro2.placa = "PJX4899";
        carro2.cor = "preto";
        carro2.precoBase = 277900.0;
        carro2.portas = 4;

        carro2.consultarPreco(2024);

        Carro carro3 = new Carro(
                "Chevrolet",
                "Trailblazer Premier",
                "PJX4899", (byte) 4,
                "preto",
                277900.0,
                2023);

        carro3.marca = "Chevrolet";
        carro3.anoFabricacao = 2023;
        carro3.placa = "PJX4899";
        carro3.cor = "preto";
        carro3.precoBase = 277900.0;
        carro3.portas = 4;

        carro3.consultarPreco(2024);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

        String texto = "Teste";
        System.out.println(texto);

        carro1 = carro2;
        System.out.println();
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro1.equals(carro2));
        System.out.println(carro2.equals(carro3));
    }
}