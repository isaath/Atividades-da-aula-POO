package ex3_atividade_avaliativa;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criando a lista geral que vai guardar os objetos do tipo etudante
        ArrayList<Estudante> listaDeEstudantes = new ArrayList<>();

        int escolha = 0;

        System.out.println("--- CADASTRO DE ESTUDANTES ---");
        do {
            System.out.println("Insira o nome do estudante: ");
            String nome = scanner.nextLine();

            //criando uma nova lista vazia para guardar as 5 notas do estudante atual
            ArrayList<Double> listaDeNotas = new ArrayList<>();

            System.out.println("CADASTRO DE NOTAS");
            for (int i = 0; i < 5; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                double nota = scanner.nextDouble();
                listaDeNotas.add(nota); //insere a nota no final da lista local de notas
            }

            //cria um novo objeto Estudante passando o nome e a lista de notas q criamos
            Estudante estudante = new Estudante(nome, listaDeNotas);

            listaDeEstudantes.add(estudante); //guarda o objeto estudante dentro da lista principal

            System.out.println("Deseja inserir mais estudantes (1 - sim   0 - não): ");
            escolha = scanner.nextInt();
            scanner.nextLine(); //limpando o buffer do tecladfo
        } while (escolha != 0);

        //CADASTRO DOS PESOS PARA A MÉDIA PONDERADA
        int[] pesos = new int[5]; //declara um vetor p guardar os pesos
        System.out.println("\n--- INFORME OS PESOS DAS 5 NOTAS ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Peso da Nota " + (i + 1) + ": ");
            pesos[i] = scanner.nextInt(); //preenche cada posição do vetor com o peso digitado
        }

        //cria a lista que armazena apenas os alunos aprovados
        ArrayList<Estudante> estudantesAprovados = new ArrayList<>();

        //percorre cada objeto 'e' da classe Estudante que está dentro da listaDeEstudantes
        for (Estudante e : listaDeEstudantes) {
            //executa a sobrecarga do calculaMedia passando o array de pesos - se for maior que 6 passa
            if (e.calculaMedia(pesos) >= 6.0) {
                estudantesAprovados.add(e); //adiciona o aluno aprovado na nova lista
            }
        }

        System.out.println("\n--- LISTA DE ESTUDANTES APROVADOS (MÉDIA PONDERADA >= 6.0) ---");
        if (estudantesAprovados.isEmpty()) { //verifica se a lista de aprovados esta vazia
            System.out.println("Nenhum estudante foi aprovado.");
        } else {
            for (Estudante aprovado : estudantesAprovados) {
                System.out.println("Nome: " + aprovado.getNome() + "\nMédia Ponderada: " + aprovado.calculaMedia(pesos) + "\n");
            }
        }

        scanner.close(); // Fecha o leitor para liberar recursos de sistema
    }
}