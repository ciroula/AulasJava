package com.example;

public class Funcionarios {
    private String nome;
    private String funcao;
    private double salario;

    //contructor
    public Funcionarios(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }


    //metodos acessores
    public String getNome () {
        return nome;
    }

    public void setNome (String mnome) {
        this.nome = nome;
    }
    
}
