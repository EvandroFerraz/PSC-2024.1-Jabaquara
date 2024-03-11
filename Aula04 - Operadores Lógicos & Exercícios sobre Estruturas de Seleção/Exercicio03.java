/*
ExercÃ­cio 3: Escreva um programa que faz a leitura de 2 numeros inteiros.
Caso o primeiro seja maior do que o segundo, o programa imprime "primeiro maior do que o segundo".
Caso contrario, o programa imprime "segundo maior do que o primeiro".
*/

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro: "));
        
        if (num3 > num4) {
            JOptionPane.showMessageDialog(null, "Primeiro eh maior do que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "Segundo eh maior do que o primeiro.");
        }
    }
}
