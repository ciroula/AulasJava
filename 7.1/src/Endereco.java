package org.example;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String CEP;
    private String cidade;
    private UnidadeFederativa unidadeFederativa;

    public Endereco(String logradouro, String numero, String complemento, String CEP, String cidade, UnidadeFederativa unidadeFederativa) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
    }

    @Override
    public String toString() {
        return "\nDados do endereço: " +
                "\nLogradouro:" + logradouro +
                "\nNúmero: " + numero +
                "\nComplemento: " + complemento +
                "\nCEP: " + CEP +
                "\nCidade: " + cidade +
                "\nUnidade federativa: " + unidadeFederativa;
    }
}