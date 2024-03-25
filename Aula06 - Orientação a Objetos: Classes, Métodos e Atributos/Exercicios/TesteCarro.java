package com.mycompany.testecarro;

import javax.swing.JOptionPane;

public class TesteCarro {

    public static void main(String[] args) {
        
        int velocidade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma velocidade: "));
        String modelo1 = JOptionPane.showInputDialog("Digite o modelo: ");
        
        Carro carro1 = new Carro(velocidade1,modelo1);
        
        System.out.println(carro1.getVelocidade());
        
        carro1.acelerar(30);
        
        System.out.println(carro1.getVelocidade());
        
        carro1.desacelerar(20);
        
        System.out.println(carro1.getVelocidade());
        
        carro1.verificarLimiteVelocidade();
    }
}
