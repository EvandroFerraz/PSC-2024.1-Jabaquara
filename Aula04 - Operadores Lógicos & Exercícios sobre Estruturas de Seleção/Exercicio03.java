/*
ExercÃ­cio 3: Escreva um programa que faz a leitura de 2 nÃºmeros inteiros.
Caso o primeiro seja maior do que o segundo, o programa imprime â€œprimeiro maior do que o segundoâ€.
Caso contrÃ¡rio, o programa imprime â€œsegundo maior do que o primeiroâ€.
*/

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro nÃºmero inteiro: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo nÃºmero inteiro: "));
        
        if (num3 > num4) {
            JOptionPane.showMessageDialog(null, "Primeiro Ã© maior do que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "Segundo Ã© maior do que o primeiro.");
        }
    }
}
