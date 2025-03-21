package com.senai.aula06.Interface.exercicios.ex1;

public class AirFlyer implements FlySafeContrato {
    private String nomeCLiente;
    private int CPF;
    private String validacao;
    private double pesoBagagem;
    private boolean tipoViagem;
    private String tipoViagemString;

    public AirFlyer(String nomeCLiente, int CPF, double pesoBagagem, boolean tipoViagem) {
        this.nomeCLiente = nomeCLiente;
        this.CPF = CPF;
        this.pesoBagagem = pesoBagagem;
        this.tipoViagem = tipoViagem;
    }


    public void validarDocumento() {
        if (pesarBagagem(getPesoBagagem(), isTipoViagem())){
            setValidacao("Aprovado");
        } else {
            setValidacao("Reprovado");
            System.out.println("\nDocumento inválido. Procure um atendente");
            System.exit(0);
        }

    }


    public void emitirCartaoEmbarque() {
        System.out.print("\nEmitindo o seu Cartão de Embarque");
        FlySafeContrato.front();
        System.out.println(  "\n--------------------------------------------" +
                    "\nNome                   | " + getNomeCLiente() +
                    "\nCPF                    | " + getCPF() +
                    "\nPeso da bagagem        | " + getPesoBagagem() +
                    "\nAprovação da bagagem   | " + getValidacao() +
                    "\nTipo de Viagem         | " + getTipoViagemString() +
                    "\n--------------------------------------------" +
                    "\nVerifique se os dados estão corretos. Caso ao contrário, procure um atendente."
        );
            FlySafeContrato.mensagemCheckIn();
    }

    public String getTipoViagemString() {
        if (tipoViagem) {
            return "Nacional";
        } else {
            return "Internacional";
        }
    }


    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getValidacao() {
        return validacao;
    }

    public void setValidacao(String validacao) {
        this.validacao = validacao;
    }

    public double getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(double pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    public boolean isTipoViagem() {
        return tipoViagem;
    }

    public void setTipoViagem(boolean tipoViagem) {
        this.tipoViagem = tipoViagem;
    }
}
