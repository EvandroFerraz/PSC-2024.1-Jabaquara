/*
Exercicio 5: Escreva um programa que leia 3 inteiros a partir do teclado e imprime a soma, a mÃ©dia, o produto, o menor e o maior desses numeros.
*/

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero inteiro: "));
        
        // Calculando a soma
        int soma = a + b + c;
        
        // Calculando a media
        double media = soma / 3.0;
        
        // Calculando o produto
        int produto = a * b * c;
        
        // Encontrando o menor numero
        int menor = a;
        int maior = a;

        // Encontrando o menor numero
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        
        // Encontrando o maior numero
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        
        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "Soma: " + soma + "\nMÃ©dia: " + media + "\nProduto: " + produto +
                                      "\nMenor: " + menor + "\nMaior: " + maior);
    }
}
