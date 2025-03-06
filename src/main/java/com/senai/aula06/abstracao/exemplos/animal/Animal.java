package com.senai.aula06.abstracao.exemplos.animal;

abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    void dormir(){
        System.out.println(nome + " está dormindo!");
    }

    abstract void fazerSom();

}
