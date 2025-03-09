package com.senai.aula05.polimorfismo.exemplos.pagamentos;

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new CLT("Melissa", 15000),
                new PJ("Guilherme", 160,50),
                new Freelancer("Giovanna",4000)
        };

        for (Pagamento p : pagamentos){
            System.out.println(p.getNome() + " recebe R$" + p.calcularPagamento());
        }
    }
}
