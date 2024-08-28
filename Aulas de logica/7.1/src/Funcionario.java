package org.example;

public abstract class Funcionario {
    protected String nome;
    protected String CPF;
    protected Endereco endereco;
    protected String RG;
    protected Setores setores;
    protected Genero genero;
    protected double salario;
    protected String dataNascimento;


    public Funcionario(String nome, String CPF, Endereco endereco, String RG, Setores setores, Genero genero, double salario, String dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.RG = RG;
        this.setores = setores;
        this.genero = genero;
        this.salario = salario;
        this.dataNascimento = dataNascimento;

    }
    @Override
    public String toString() {
        return "Dados do funcionário: " +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nEndereço: " + endereco +
                "\nRG: " + RG +
                "\nSetores: " + setores +
                "\nGênero: " + genero +
                "\nSalario: " + salario +
                "\nData de nascimento: " + dataNascimento;
    }
}