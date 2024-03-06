// 1- Ler um número inteiro e exibir se ele é positivo, negativo ou neutro (0).

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exercício 1: Verificar se um número é positivo, negativo ou neutro");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é neutro.");
        }
    }
}
