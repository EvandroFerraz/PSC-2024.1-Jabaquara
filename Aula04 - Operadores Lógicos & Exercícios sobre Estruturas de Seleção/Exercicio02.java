/*
ExercÃ­cio 2: Escreva um programa que faz a leitura de dois nÃºmeros reais e verifica se eles sÃ£o iguais.
Se forem, o programa deve mostrar uma mensagem ao usuÃ¡rio informando-o disso. Caso contrÃ¡rio, o programa somente termina.
*/

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro nÃºmero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo nÃºmero: "));
        
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os nÃºmeros sÃ£o iguais.");
        }
    }
}
