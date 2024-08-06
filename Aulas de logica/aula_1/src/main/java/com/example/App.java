package com.example;

import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class App 
{
    public static void main( String[] args ){

    Scanner dados = new Scanner (System.in);

    int primeiraNota, segundaNota, terceiraNota;
    double media;
    String nome;

    System.out.println("Digite o nome do usuario: ");
    nome = dados.next();

    System.out.println("Digite a primeira nota: ");
    primeiraNota = dados.nextInt();

    System.out.println("Digite a segunda nota: ");
    segundaNota = dados.nextInt();

    System.out.println("Digite a terceira nota: ");
    terceiraNota = dados.nextInt();

    media = (primeiraNota + segundaNota + terceiraNota) /2;
    
    System.out.println("nome: " + nome);
    System.out.println("media: " + media);

    if (media >= 7) {
        System.out.println("Aprovado");
    } else if (media >= 5) {
        System.out.println("Verificacao Suplementar");
    }else {
        System.out.println("Reprovado");
    }

}
}   

