package com.senai.aula06.abstracao.exercicios.ex2;

public class BicicletaEntrega extends Veiculo {
    private static final double velocidadeMaxima = 30;

    public BicicletaEntrega(double velocidade, double carga, double distanciaDestino ) {
        super(velocidade, carga, distanciaDestino);
    }


    @Override
    double calcularTempoEntrega() {
        return 2 * (getDistanciaDestino() / getVelocidade() * 60);
    }

    @Override
    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = 10;
    }

    void verificarDados() {
        setCapacidadeMaximaCarga(getCapacidadeMaximaCarga());
        if (carga > capacidadeMaximaCarga) {
            System.out.println("Carga mais pesada do que a capacidade máxima desse veículo. Escolha outro veículo.");
            System.exit(0);
        } else if (velocidade > velocidadeMaxima) {
            System.out.println("Esse veículo não consegue alcançar essa velocidade. Escolha outro veículo");
        } else {
            System.out.println(" ------- Entrega de Bike -------" +
                    "\n Velocidade           | " + String.format("%.0f", getVelocidade()) + " km/h" +
                    "\n Carga                | " + getCarga() + " kg" +
                    "\n Carga Máxima         | " + getCapacidadeMaximaCarga() + " kg" +
                    "\n Distância do Destino | " + getDistanciaDestino() + " Km" +
                    "\n Tempo de entrega     | " + String.format("%.1f", calcularTempoEntrega()) + " min\n"
            );
        }
    }
}
