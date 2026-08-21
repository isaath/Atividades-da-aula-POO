package ex2_atividade;

import java.util.ArrayList;

public class Estudante {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();
    private double media = 0.0;


    //contrutor
    public Estudante(String nome, ArrayList<Double> listaDeNotas){
        this.nome = nome;
        this.notas = notas;
    }

    //gets e sets
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Double> getNotas(){
        return notas;
    }

    public void setNotas(ArrayList<Double> notas){
        this.notas = notas;
    }

    //metodos
    public void insereNotas(ArrayList<Double> novasNotas) {
        for (Double nota : novasNotas) {
            this.notas.add(nota);
        }
        System.out.println("\nNotas salvas para " + getNome() + ": " + getNotas()); // exibe o resultado final
    }

    public double calculaMedia(ArrayList<Double> notas){
        //evitar divisoes por 0 se estiver vazia
        if(this.notas.isEmpty()){  //isEmpty --> verifica se o array está totalmente vazio
            return 0.0;
        }

        //somar todas as notas do arraylist
        double soma = 0.0;
        for (double nota : this.notas){
            soma = soma + nota;
        }

        media = soma / this.notas.size(); //divide a soma pelo tamanho do arraylist
        return media;
    }

    public double menorNota(ArrayList<Double> notas){
        double mn = 10.0;
        for(double nota : this.notas){
            if(nota < mn){
                mn = nota;
            }
        }

        return mn;
    }

}
