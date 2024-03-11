/*
Exerci­cio 2: Escreva um programa que faz a leitura de dois numeros reais e verifica se eles sao iguais.
Se forem, o programa deve mostrar uma mensagem ao usuario informando-o disso. Caso contario, o programa somente termina.
*/

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os numeros sao iguais.");
        }
    }
}
