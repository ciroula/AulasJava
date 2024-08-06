package com.example;

public class Pricinpal {
    public static void main(String[] args) {
        Pet pets = new Pet("Mavin", 1, "Alguma", "Medio", "Boa");

        System.out.println("Nome: " + pets.getNome());
        System.out.println("Idade: " + pets.getIdade());
        System.out.println("Raca: " + pets.getRaca());
        System.out.println("Porte: " + pets.getPorte());
        System.out.println("Alimentacao: " + pets.getAlimentacao());
    }
    
}
