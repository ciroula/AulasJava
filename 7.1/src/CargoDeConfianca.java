package org.example;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String CPF, Endereco endereco, String RG, Setores setores, Genero genero, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, CPF, endereco, RG, setores, genero, salario, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "CargoDeConfianca: " +
                "bonificacao=" + bonificacao +
                '}';
    }
}