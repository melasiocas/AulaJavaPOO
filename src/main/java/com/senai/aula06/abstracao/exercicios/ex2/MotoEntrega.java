package com.senai.aula06.abstracao.exercicios.ex2;

public class MotoEntrega extends Veiculo{
    private double tempoEntrega;

    public MotoEntrega(double velocidade, double carga, double distanciaDestino) {
        super(velocidade, carga, distanciaDestino);
    }


    @Override
    void calcularTempoEntrega() {
        tempoEntrega = (getDistanciaDestino() / getVelocidade() * 60);
    }

    @Override
    public void setCapacidadeMaximaCarga(double getCapacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = 30;
    }

    @Override
    void verificarCarga() {
        if (carga > capacidadeMaximaCarga) {
            System.out.println("Carga mais pesada do que a capacidadeMáxima desse veículo. Escolha outro veículo.");
            System.exit(0);
        }
    }
}
