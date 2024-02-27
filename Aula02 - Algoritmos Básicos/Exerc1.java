// 1. Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado.

import javax.swing.JOptionPane;

public class Exerc1 {
    public static void main(String[] args) {
        // Ler a cotação do dólar
        double cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar:"));
        
        // Ler a quantidade de dólares
        double quantidadeDolares = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dólares:"));
        
        // Calcular o valor em reais
        double valorEmReais = quantidadeDolares * cotacaoDolar;
        
        // Mostrar o resultado
        JOptionPane.showMessageDialog(null, "O valor em reais é: R$" + valorEmReais);
    }
}
