package com.senai.aula06.abstracao.exemplos.animal;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " está latindo!");
    }
}
