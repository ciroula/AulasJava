package org.example;

public class Motorista extends Funcionario {
    private String carteiraHabilitacao;

    public Motorista(String nome, String CPF, Endereco endereco, String RG, Setores setores, Genero genero, double salario, String dataNascimento, String carteiraHabilitacao) {
        super(nome, CPF, endereco, RG, setores, genero, salario, dataNascimento);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "Dados do motorista: " +
                super.toString() +
                "\nNome:" + nome +
                "\nCPF: " + CPF +
                "\nEndereço: " + endereco +
                "\nRG: " + RG +
                "\nSetor: " + setores +
                "\nGênero: " + genero +
                "\nSalario: " + salario +
                "\nData de nascimento: " + dataNascimento +
                "\nTipo da Carteira de habilitação: " + carteiraHabilitacao;
    }

}