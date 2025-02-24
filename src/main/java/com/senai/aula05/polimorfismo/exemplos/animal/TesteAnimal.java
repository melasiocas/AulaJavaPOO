package com.senai.aula05.polimorfismo.exemplos.animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animalCachorro = new Cachorro();
        Animal animalGato = new Gato();

        animalGato.fazerSom();
        animalCachorro.fazerSom();
    }
}
