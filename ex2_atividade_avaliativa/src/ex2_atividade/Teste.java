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
            ArrayList<Double> listaDeNotas = new ArrayList<>(); //crio a lista de notas

            System.out.println("CADASTRO DE NOTAS");
            for (int i = 0; i < 5; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                double nota = scanner.nextDouble();
                listaDeNotas.add(nota); // adiciona na lista local
            }

            //cria o obj estudante dentro do for com os dados da repetição
            Estudante estudante = new Estudante(nome, listaDeNotas);

            listaDeEstudantes.add(estudante); //adiciona o estudanye criado na lista principal

            System.out.println("Deseja inserir mais estudantes (1 - sim   0 - não): ");
            escolha = scanner.nextInt();
            scanner.nextLine(); //limpando o buffer do scanner
        }while(escolha!=0);

        ArrayList<Estudante> estudantesAprovados = new ArrayList<>(); //é uma lista do tipo estudante que guarda os estudantes aprovados

        for (Estudante e : listaDeEstudantes) {  //para cada estudante e dentro da lista faça o seguinte
            //se a média for maior ou igual a 6 ele adiciona na lista de estudantes aprovados do tipo e (nome q eu dei pra estudante)
            if (e.calculaMedia() >= 6.0) {
                estudantesAprovados.add(e);
            }
        }

        System.out.println("--- LISTA DE ESTUDANTES APROVADOS ---");
        if(estudantesAprovados.isEmpty()){  //se a lista estiver vazia
            System.out.println("Nenhum estudante foi aprovado");
        }else{
            for(Estudante aprovado : estudantesAprovados){ //para cada obj da classe estudante (que vou chamar de aprovado) eu faço isso na lista de estudantes aprovados
                System.out.println("Nome: "+aprovado.getNome()+"\nMédia: "+aprovado.calculaMedia()+"\n\n");
            }
        }



        scanner.close();
    }
}
