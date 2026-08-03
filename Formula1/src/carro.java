//package aula;

public class Carro {
    //Atributos
    private int rodas;
    private String cor;

    //Construtor de classe
    public Carro(){
        rodas = 0;
        cor = "Vermelho";
    }

    public Carro(String corParam){
        rodas = 0;
        cor = corParam;
    }

    public int getRodas(){
        return rodas;
    }

    public void setRodas(int rodas){ //rodasParam
        this.rodas = rodas;
        //rodas = rodasParam
    }

    //métodos
    public void ligar(){

    }

    public void andar(){

    }
}
