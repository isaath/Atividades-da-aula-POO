package atv_avaliativa;

import java.util.ArrayList;

public class Estudante {
    private String nome;
    private ArrayList<Double> notas;


    //contrutor
    public Estudante(String nome, ArrayList<Double> notas){
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

}
