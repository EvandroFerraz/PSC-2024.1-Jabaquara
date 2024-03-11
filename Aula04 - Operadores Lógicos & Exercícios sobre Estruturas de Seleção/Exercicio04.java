/*
ExercÃ­cio 4: Escreva um programa que pede para o usuÃ¡rio inserir dois nÃºmeros, obtÃ©m os nÃºmeros do usuÃ¡rio
e entÃ£o imprime o maior nÃºmero seguido pelas palavras â€œÃ© o maiorâ€.
Se os nÃºmeros forem iguais, imprime a mensagem â€œEstes nÃºmeros sÃ£o iguaisâ€.
*/

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro nÃºmero: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo nÃºmero: "));
        
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, numero1 + " Ã© o maior.");
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, numero2 + " Ã© o maior.");
        } else {
            JOptionPane.showMessageDialog(null, "Estes nÃºmeros sÃ£o iguais.");
        }
    }
}
