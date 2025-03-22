package com.senai.aula06.abstracao.exercicios.ex2;

public class CarroEntrega extends Veiculo{
    private double tempoEntrega;

    public CarroEntrega(double velocidade, double carga, double distanciaDestino) {
        super(velocidade, carga, distanciaDestino);
    }


    @Override
    double calcularTempoEntrega() {
        return tempoEntrega = 2 * (getDistanciaDestino() / getVelocidade() * 60);
    }

    @Override
    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = 60;
    }

    void verificarDados() {
        setCapacidadeMaximaCarga(getCapacidadeMaximaCarga());
        if (carga > capacidadeMaximaCarga) {
            System.out.println("Carga mais pesada do que a capacidade máxima desse veículo. Escolha outro veículo.");
            System.exit(0);
        } else {
            System.out.println(" ------- Entrega de Carro -------" +
                    "\n Velocidade           | " + String.format("%.0f", getVelocidade()) + " km/h" +
                    "\n Carga                | " + getCarga() + " kg" +
                    "\n Carga Máxima         | " + getCapacidadeMaximaCarga() +  " kg" +
                    "\n Distância do Destino | " + getDistanciaDestino() +  " Km" +
                    "\n Tempo de entrega     | " + String.format("%.1f", calcularTempoEntrega()) +  " min\n"
            );
        }
    }
}
