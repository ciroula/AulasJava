package org.example;

public class Advogado extends Funcionario {
    private String OAB;

    public Advogado(String nome, String CPF, Endereco endereco, String RG, Setores setores, Genero genero, double salario, String dataNascimento, String OAB) {
        super(nome, CPF, endereco, RG, setores, genero, salario, dataNascimento);
        this.OAB = OAB;

    }
    @Override
    public String toString() {
        return "\nDados do advogado: " +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nEndereço: " + endereco +
                "\nRG: " + RG +
                "\nSetor: " + setores +
                "\nGênero: " + genero +
                "\nSalario: " + salario +
                "\nData de nascimento: " + dataNascimento +
                "\nOAB: " + OAB;
    }
}
