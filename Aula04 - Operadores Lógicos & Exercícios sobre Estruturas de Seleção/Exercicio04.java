/*
Exerci­cio 4: Escreva um programa que pede para o usuario inserir dois numeros, obtem os numeros do usuario
e entao imprime o maior numero seguido pelas palavras "eh o maior".
Se os numeros forem iguais, imprime a mensagem "Estes nUmeros sAo iguais".
*/

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, numero1 + " eh o maior.");
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, numero2 + " eh o maior.");
        } else {
            JOptionPane.showMessageDialog(null, "Estes numeros sao iguais.");
        }
    }
}
