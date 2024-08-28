package org.example;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    SAO_PAULO("São Paulo", "SP");

    private String texto;
    private String sigla;

    UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
}