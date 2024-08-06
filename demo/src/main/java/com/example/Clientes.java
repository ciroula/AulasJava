package com.example;

public class Clientes {
    private String nome;
    private int idade;

    //contructor
    public Clientes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //metodos de acesso.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    }
