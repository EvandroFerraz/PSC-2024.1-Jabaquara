import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exercício 2: Calcular raízes de uma equação de segundo grau");
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c: "));
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Não existem raízes reais para esta equação.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Existe uma única raiz: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "As raízes são: " + raiz1 + " e " + raiz2);
        }
    }
}
