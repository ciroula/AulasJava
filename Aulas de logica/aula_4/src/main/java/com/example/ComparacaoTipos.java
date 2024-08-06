package com.example;

public class ComparacaoTipos {
    public static void main(String[] args) {

        //Declaracao de variaveis
        String nomeUSuario = "Marta";
        int senha = 123;

        //Comparacao de String e inteiros
        boolean resultadoNome = nomeUSuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        //Exibindo resultado
        System.out.println("O nome do usuario esta correto? " + resultadoNome);
        System.out.println("A senha esta correta? " + resultadoSenha);
    }        
}
