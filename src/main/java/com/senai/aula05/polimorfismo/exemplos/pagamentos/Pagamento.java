package com.senai.aula05.polimorfismo.exemplos.pagamentos;

public class Pagamento {
    private String nome;

    public Pagamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularPagamento(){
        return 0.0; // metodo generico
    }
}
