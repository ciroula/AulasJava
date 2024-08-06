package com.example;

public class MetodosString {
    public static void main(String[] args){

        String nome = "Marta";
        String sobrenome = "Silveira";

        //Exibind a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        //Concatenando nome + sobrenome
        String nomeCompleto = nome.concat("  ").concat(sobrenome);

        //Exibido nome completo usando metodos strings - maiusculas
        System.out.println("Concatenacao Maiuscula: " + nomeCompleto.toUpperCase());

        //Exibindo nome completo usando metodos Strings - Minusculas
        System.out.println("Concatencao minuscula: " + nomeCompleto.toLowerCase());
    }
}