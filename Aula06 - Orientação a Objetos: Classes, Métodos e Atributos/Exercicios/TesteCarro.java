import javax.swing.JOptionPane;

public class TesteCarro {

    public static void main(String[] args) {
        
        int velocidade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma velocidade: "));
        String modelo1 = JOptionPane.showInputDialog("Digite o modelo: ");

        /* Código antes dos Exercícios 3 e 4, utilizando um construtor padrão e atribuindo valores iniciais aos atributos através dos métodos setters.          
        Carro carro1 = new Carro();
        carro1.setVelocidade(velocidade1);
        carro1.setModelo(modelo1); */
        
        // Construtor após Exercício 4, que agora deve receber valores para os atributos velocidade e modelo por parâmetro.
        // Utilizando o construtor atualizado, não é mais necessário utilizar os métodos setters para atribuir um valor inicial para os atributos.
        Carro carro1 = new Carro(velocidade1,modelo1);
        
        System.out.println(carro1.getVelocidade());
        
        carro1.acelerar(30);
        
        System.out.println(carro1.getVelocidade());
        
        carro1.desacelerar(20);
        
        System.out.println(carro1.getVelocidade());
        
        carro1.verificarLimiteVelocidade();
    }
}
