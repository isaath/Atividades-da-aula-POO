package ex2_atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar todos os estudantes cadastrados
        ArrayList<Estudante> listaDeEstudantes = new ArrayList<>();

        int escolha = 0;

        System.out.println("--- CADASTRO DE ESTUDANTES ---");
        do{
            System.out.println("Insira o nome do estudante: ");
            String nome = scanner.nextLine();
            ArrayList<Double> listaDeNotas = new ArrayList<>();
            System.out.println("CADASTRO DE NOTAS");
            for (int i = 0; i < 5; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                double nota = scanner.nextDouble();
                listaDeNotas.add(nota); // adiciona na lista local
            }

            //instancia o obj estudante dentro do for com os dados da repetição
            Estudante estudante = new Estudante(nome, listaDeNotas);

            listaDeEstudantes.add(estudante); //adiciona o estudanye criado na lista principal

            System.out.println("Deseja inserir mais estudantes (1 - sim   0 - não): ");
            escolha = scanner.nextInt();
            scanner.nextLine(); //limpando o buffer do scanner
        }while(escolha!=0);

        ArrayList<Estudante> estudantesAprovados = new ArrayList<>();

        for (Estudante e : listaDeEstudantes) {
            // Se a média for maior ou igual a 6.0
            if (e.calculaMedia() >= 6.0) {
                estudantesAprovados.add(e);
            }
        }





        scanner.close();
    }
}
