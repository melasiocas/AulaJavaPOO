package com.senai.aula05.polimorfismo.exercicios.ex2;

public class MainHotel {
    public static void main(String[] args) {
        Reserva[] reservas = {
                new ReservaSimples("Melissa", 3),
                new ReservaVIP("Guilherme", 6),
        };

        for (Reserva r : reservas) {
            System.out.println(r.toString());
        }
    }
}
