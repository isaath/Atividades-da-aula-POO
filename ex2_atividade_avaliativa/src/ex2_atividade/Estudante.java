package ex2_atividade;

import java.util.ArrayList;

public class Estudante {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();
    private double media = 0.0;

    //construtor
    public Estudante(String nome, ArrayList<Double> listaDeNotas) {
        this.nome = nome;
        this.notas = listaDeNotas;
    }

    //gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    // media aritmetica simples
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

    //SOBRECARGA: média ponderada (recebe o array de pesos)
    public double calculaMedia(int[] pesos) {
        if (this.notas.isEmpty() || pesos == null || pesos.length != 5) {
            return 0.0;
        }

        double somaNotasVezesPesos = 0.0;
        int somaDosPesos = 0;

        //calcular a media ponderada das 5 notas
        for (int i = 0; i < 5; i++) {
            somaNotasVezesPesos += this.notas.get(i) * pesos[i]; //this.notas.get(i) --> pega a nota do numero i da lista de notas
            somaDosPesos += pesos[i];
        }

        this.media = somaNotasVezesPesos / somaDosPesos;
        return this.media;
    }
}