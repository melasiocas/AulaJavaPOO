package com.senai.aula06.abstracao.exercicios.ex2;

abstract class Veiculo {
    double velocidade;
    double carga;
    double capacidadeMaximaCarga;
    double distanciaDestino;

    public Veiculo(double velocidade, double carga, double distanciaDestino) {
        this.velocidade = velocidade;
        this.carga = carga;
        this.distanciaDestino = distanciaDestino;
    }

    abstract void calcularTempoEntrega();
    abstract void verificarCarga();


    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    public void setDistanciaDestino(double distanciaDestino) {
        this.distanciaDestino = distanciaDestino;
    }

    void aumentarVelocidade(double incremento) {
        velocidade += incremento;
        setVelocidade(velocidade);
    }
}
