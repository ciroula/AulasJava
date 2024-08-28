package org.example;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 0.5;


    public Diretor(String nome, String CPF, Endereco endereco, String RG, Setores setores, Genero genero, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, CPF, endereco, RG, setores, genero, salario, dataNascimento, bonificacao);

    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * super.bonificacao.DIRETOR.getValor();
        salarioFinal += super.salario;
        return salarioFinal;
    }



    @Override
    public String toString() {
        return "\nDados do diretor: " +
                "\nPrêmio: " + PREMIO +
                "\nSalário: " + this.getSalarioFinal();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\n - Admitindo o funcionário - ");
        System.out.println("\nDados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {

    }
}