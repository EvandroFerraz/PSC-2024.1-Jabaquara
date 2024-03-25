public class Carro {
    private int velocidade;
    private String modelo;

    // Construtor do Exercício 3
    public Carro(int velocidade, String modelo){
        this.velocidade = velocidade;
        this.modelo = modelo;
    }
    
    public void acelerar(int acrescimo){
        this.velocidade = this.velocidade + acrescimo;
    }
    
    public void desacelerar(int decrescimo){
        this.velocidade = this.velocidade - decrescimo;
    }
    
    public void verificarLimiteVelocidade(){
        if(this.velocidade > 100){
            System.out.println("Você está acima do limite");
        }else{
            System.out.println("Você está dentro do limite");
        }
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    public String getModelo() {
        return modelo;
    }     
}
