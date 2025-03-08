package com.senai.mainRef;

public class Mercado {


    private int ID;
    private String nome;
    private double preco;
    private int quantidade;

    public Mercado(int ID, int qnt, double preco, String nome) {
        this.ID = ID;
        this.quantidade = qnt;
        this.preco = preco;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void mostrarProdutos() {
        Compartilhado.listaProdutos.forEach(produto -> System.out.println(produto));
    }

    public static boolean InputCheck(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void espera(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void calcularValorEstoque(int index){

        double valorTotalEstoque = Compartilhado.listaProdutos.get(index).getPreco() * Compartilhado.listaProdutos.get(index).quantidade;
        System.out.println(valorTotalEstoque + " é o valor do estoque atual do produto " + Compartilhado.listaProdutos.get(index).getNome());
    }

    public static void editarQuantidade(int index, int qntNova) {
        Compartilhado.listaProdutos.get(index).setQuantidade(qntNova);
        System.out.println(Compartilhado.listaProdutos.get(index).getNome() + " atualizado com sucesso...");
    }

    public static void adicionarProduto(int id, int qnt, double preco, String nome) {
        Mercado produto = new Mercado(id, qnt, preco, nome);
        Compartilhado.listaProdutos.add(produto);
        System.out.println(nome + " adicionado com sucesso...\n");
    }

    @Override
    public String toString() {
        return ("---------------------------" +
                "\n ID         | " + ID +
                "\n Nome       | " + nome +
                "\n Preço      | " + preco +
                "\n Quantidade | " + quantidade +
                "\n---------------------------"
        );
    }

}