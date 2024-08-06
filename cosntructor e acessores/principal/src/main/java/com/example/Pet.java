package com.example;

public class Pet {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentacao;

    //contructor
    public pet(String nome, int idade, String raca, String porte, String alimentacao) {
        this.nome = nome
        this.idade = idade
        this.raca = raca
        this.porte = porte
        this.alimentacao = alimentacao
    }

    //metodos de acesso
    public String get.Nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome
    }

    public String get.Idade() {
        return idade;
    }

    public void setIdae(String idade) {
        this.idade = idade
    }

    public String get.Raca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca
    }

    public String get.porte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte
    }

        public String get.alimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimetacao) {
        this.alimentacao = alimetacao
    }
}