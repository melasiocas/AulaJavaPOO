package com.senai.aula01_classe_atributo_metodos.pessoas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco(
                "Rua Biri",
                159,
                "A.E. Carvalho",
                "São Paulo",
                8220120
        );
        Pessoa pessoa1 = new Pessoa(
                "melissa",
                17,
                endereco1
        );
        Pessoa pessoa2 = new Pessoa(
                "melissa",
                17,
                new Endereco(
                        "Rua Biri",
                        159,
                        "A.E. Carvalho",
                        "São Paulo",
                        8220120
                )
        );
        Pessoa pessoa3 = new Pessoa(
                "giovanna",
                18,
                new Endereco(
                        "Praça Ubatuba",
                        50,
                        "Diadema",
                        "São Paulo",
                        345365
                )
        );

        System.out.println(pessoa1.endereco.rua); //exibe o último, nesse caso "rua".

        System.out.println(pessoa1); //exibe tudo.
        System.out.println(pessoa2);

        System.out.println(pessoa1 == pessoa2); //compara endereços.
        System.out.println(pessoa1.equals(pessoa2)); //compara valores.

        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;
        pessoas[2] = pessoa3;

        ArrayList pessoasList = new ArrayList<>();

        pessoasList.add(pessoa1);
        pessoasList.add(pessoa2);
        pessoasList.add(pessoa3);
        pessoasList.add("Teste");
        pessoasList.add(12);
        pessoasList.add(true);

        System.out.println(pessoasList.get(4));

        pessoasList.remove(4);

        System.out.println(pessoasList.get(4));
        pessoasList.clear();
    }
}
