package com.senai.aula06.Interface.exercicios.ex1;

public interface FlySafeContrato {
    double PESO_MAX_BAGAGEM_NACIONAL = 23;
    double PESO_MAX_BAGAGEM_INTERNACIONAL  = 32;

    void validarDocumento();
    void emitirCartaoEmbarque();

    static void boasVindas(){
        System.out.println("Bem-vindo(a) ao FlySegure - Faça suas viagens com a FlySafe");
    }

    static void mensagemCheckIn(){
        System.out.println("Check-in seguro realizado pela FrySeguro!");
    }

    default boolean pesarBagagem(double peso, boolean tipoViagem) {
        if (validarBagagem(peso, tipoViagem)){
            System.out.print("Pesando sua bagagem");
            front();
            System.out.print("\nBagagem aprovada com sucesso");
            front();
            return true;
        } else {
            System.out.print("Pesando sua bagagem");
            front();
            System.out.print("\nBagagem reprovada. Pague a taxa para conseguir embarcar");
            front();
         return false;
        }
    }

    static void front(){
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print(".");
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean validarBagagem(double peso, boolean tipoViagem) {
        if (tipoViagem && peso <= PESO_MAX_BAGAGEM_NACIONAL || !tipoViagem && peso <= PESO_MAX_BAGAGEM_INTERNACIONAL) {
            return true;
        } else {
            return false;
        }
    }
}
