package org.example;

public class Principal {
    public static void main(String[] args) {
        Advogado advogado = new Advogado("nome", "000",
                new Endereco("hshs", "6", "hhs", "78", "hdhdhd", UnidadeFederativa.BAHIA),
                "888", Setores.ENGENHARIA, Genero.MASCULINO, 555, "14/05/899", "8");

        System.out.println(advogado);
    }
}