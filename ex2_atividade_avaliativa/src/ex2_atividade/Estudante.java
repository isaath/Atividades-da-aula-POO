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
        for (Double nota : novasNotas) {
            this.notas.add(nota);
        }

    }

    public double calculaMedia() {
        if (this.notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : this.notas) {
            soma += nota;
        }

        this.media = soma / this.notas.size();
        return this.media;
    }

    }


}
