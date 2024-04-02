package com.mycompany.jogo;

public class Personagem {
    String nome;
    int energia, fome, sono;
    
    public void cacar(){
        System.out.println(nome + " está caçando");
    }  
    public void comer(){
        System.out.println(nome + " está comendo");
    }
    public void dormir(){
        System.out.println(nome + " está dormindo");
    }
}
