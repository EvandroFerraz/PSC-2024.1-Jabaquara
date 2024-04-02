package com.mycompany.jogo;

public class Jogo {
    public static void main(String[] args) {
        Personagem cacador = new Personagem();
        cacador.nome = "Joao";
        
        cacador.cacar();
        cacador.comer();
        cacador.dormir();     
    }
}
