package atv_avaliativa;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do estudante: ");
        String nome = scanner.nextLine();

        // cria a lista local e le as notas
        ArrayList<Double> listaDeNotas = new ArrayList<>();
        System.out.println("CADASTRO DE NOTAS");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            listaDeNotas.add(nota); // adiciona na lista local
        }

        //cria o obj estudante
        Estudante estudante = new Estudante(nome);

       // chama o metodo passando a lista pronta
        estudante.insereNotas(listaDeNotas);

        //chamar o metodo calcularMedia
        double media = estudante.calculaMedia(listaDeNotas);
        System.out.println("A média do aluno " + estudante.getNome() + " é: " + media);

        double mn = estudante.menorNota(listaDeNotas);
        System.out.println("A menor nota de "+estudante.getNome()+" é: "+mn);

        scanner.close();
    }a
}