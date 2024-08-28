package org.example;

public abstract class Gerente extends CargoDeConfianca {
    public Gerente(String nome, String CPF, Endereco endereco, String RG, Setores setores, Genero genero, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, CPF, endereco, RG, setores, genero, salario, dataNascimento, bonificacao);
    }
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * super.bonificacao.GERENTE.getValor();
        salarioFinal += super.salario;
        return salarioFinal;
    }
    @Override
    public String toString() {
        return "\nDados do gerente: " +
                "\nBonificação: " + bonificacao +
                "\nSalário final: " + this.getSalarioFinal();
    }
}