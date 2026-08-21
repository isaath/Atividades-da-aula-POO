package ex2_atividade;

import java.util.ArrayList;

public class Estudante {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();
    private double media = 0.0;


    //contrutor
    public Estudante(String nome, ArrayList<Double> listaDeNotas){
        this.nome = nome;
        this.notas = listaDeNotas;
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
        for (Double nota : novasNotas) { //para cada item double chamado nota eu faço isso na lista de novas notas
            this.notas.add(nota); //pegando a nota que recebi como parametro e adicionando no final da lista de notas do estudanye
        }

    }

    public double calculaMedia() {
        if (this.notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : this.notas) { //para cada num(nota) que esta na lista "notas" faça isso
            soma += nota; //soma igual a soma mais nota
        }

        media = soma / notas.size(); //calcula a média pegando o tamanho das notas
        return media;
    }

}

