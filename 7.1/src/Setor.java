package org.example;

public enum Setor {
    ENGENHARIA ("Engenheiro."),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");

    private String texto;

    Setores(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}