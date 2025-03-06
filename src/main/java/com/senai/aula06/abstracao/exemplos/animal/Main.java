package com.senai.aula06.abstracao.exemplos.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tobbi");
        Gato gato = new Gato("Luna Clara");

        emitirSom(cachorro);
        emitirSom(gato);

        List<Animal> listaAnimal = new ArrayList<>();
        listaAnimal.add(cachorro);
        listaAnimal.add(gato);

        listaAnimal.forEach(Animal::dormir);
        listaAnimal.forEach(System.out::println);
    }
    public static void emitirSom(Animal animal){
        animal.fazerSom();
    }
}
