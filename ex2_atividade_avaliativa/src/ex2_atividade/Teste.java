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



            System.out.println("Deseja inserir mais estudantes (0 - sim   1 - não): ");
            escolha = scanner.nextInt();
        }while(escolha!=0);




        // chama o metodo passando a lista pronta
        estudante.insereNotas(listaDeNotas);

        //chamar o metodo calcularMedia
        double media = estudante.calculaMedia(listaDeNotas);
        System.out.println("A média do aluno " + estudante.getNome() + " é: " + media);

        double mn = estudante.menorNota(listaDeNotas);
        System.out.println("A menor nota de "+estudante.getNome()+" é: "+mn);

        scanner.close();
    }
}
