package com.senai.aula01_classe_atributo_metodos.carro;

import java.util.Objects;

public class Carro {
    String marca;
    String modelo;
    String placa;
    byte portas;
    String cor;
    double precoBase;
    int anoFabricacao;

    public Carro(String marca, String modelo, String placa, byte portas, String cor, double precoBase, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.portas = portas;
        this.cor = cor;
        this.precoBase = precoBase;
        this.anoFabricacao = anoFabricacao;
    }
    public void verificarInformacoes (){
        System.out.println("marca = " + marca + "\n" +
                            "modelo = " + modelo + "\n" +
                            "placa = " + placa + "\n" +
                            "portas = " + portas + "\n" +
                            "cor = " + cor + "\n");
    }
    public void ligarCarro(){
        System.out.println("Vrumm!!");
    }
    public void testarSom(){
        System.out.println("Som ligado. Aproveite a música");
    }
    public void consultarPlaca(){
        System.out.println("A placa +" + placa + " está sem restrições.");
    }
    public void consultarPreco(int anoAtual){
        int idadeDoCarro = anoAtual - anoFabricacao;
        double precoAtual = precoBase;
        if (idadeDoCarro > 0){
            for (int i = 0; i < idadeDoCarro; i++) {
                precoAtual -= precoAtual * 0.05;
            }
        }
        System.out.printf("O valor do %s %s é: %.2f \n", marca, modelo, precoAtual);
    }

    @Override
    public String toString() {
        return "carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", portas=" + portas +
                ", cor='" + cor + '\'' +
                ", precoBase=" + precoBase +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return portas == carro.portas && Double.compare(precoBase, carro.precoBase) == 0 && anoFabricacao == carro.anoFabricacao && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(placa, carro.placa) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, placa, portas, cor, precoBase, anoFabricacao);
    }
}
