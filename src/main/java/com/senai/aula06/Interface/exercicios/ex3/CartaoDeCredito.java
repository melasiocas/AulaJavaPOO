package com.senai.aula06.Interface.exercicios.ex3;

public class CartaoDeCredito implements Pagamentos {
    protected String usuario;
    protected int senha;
    protected double limite;

    public void pagar(int senhaScanner, double parcelas, double valor) {
        autenticar(senhaScanner, valor, parcelas);
    }

    @Override
    public void autenticar(int senhaScanner, double parcelas, double valor) {
        if (senhaScanner == getSenha()) {
            System.out.println("Autenticação Ok...");
        } else {
            System.out.println("Erro na autenticação da conta...");
            System.exit(0);
        }
        validar(valor, parcelas);
    }

    @Override
    public void validar(double valor, double parcelas) {
        if (!(getLimite() < valor || valor > 1000.00)) {
            System.out.println("Validação Ok...");
            registrar(valor);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    @Override
    public void registrar(double valor, double parcelas) {
        double valorParcela = valor / parcelas;

        System.out.println(" --- Transação registrada ---" +
                         "\n Usuário  | " + getUsuario() +
                         "\n Valor    | " + valor );
        System.out.printf("Parcela  | %.0f (%dx)%n", valorParcela, (int) parcelas);
    }

    public CartaoDeCredito(String usuario, int senha, double limite) {
        this.usuario = usuario;
        this.senha = senha;
        this.limite = limite;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
