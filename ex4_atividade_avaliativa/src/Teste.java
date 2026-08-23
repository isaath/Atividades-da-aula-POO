import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criando a lista de livros e a de periodicos
        ArrayList<Livro> listaLivros = new ArrayList<>();
        ArrayList<Periodico> listaPeriodicos = new ArrayList<>();

        int escolha_soun = 0;
        int escolha_loup = 0;
        int escolha1 = 0;
        int escolha2 = 0;
        int escolha3 = 0;
        int escolha4 = 0;
        int escolha5 = 0;


        System.out.println("--- SISTEMA DE BIBLIOTECA ---");
        do {
            System.out.println("Você deseja: 1 - cadastrar livros  ou  2 - registrar empréstimo: ");
            escolha1 = scanner.nextInt();
            while(escolha1!=1 && escolha1!=2){
                System.out.println("Opção inválida. Insira 1 - cadastrar livros  ou  2 - registrar empréstimo: ");
                escolha1 = scanner.nextInt();
            }
            if(escolha1==1){
                do {
                    System.out.println("--- SISTEMA DE CADASTRO DE LIVROS E PERIÓDICOS");
                    System.out.println("Deseja inserir um livro (insira 1) ou um periódico (insira 2)");
                    escolha_loup = scanner.nextInt();

                    //se a pessoa digitar algo diferente de 1 ou 2
                    while (escolha_loup!=1 && escolha_loup!=2){
                        System.out.println("Escolha inválida. Insira '1' para livro ou '2' para periódico: ");
                        escolha_loup = scanner.nextInt();
                    }
                    if (escolha_loup == 1){
                        do {
                            System.out.println("--- CADASTRO DE LIVRO ---");
                            System.out.println("Insira o título do livro: ");
                            scanner.nextLine(); //limpando buffer do teclado
                            String titulo = scanner.nextLine();
                            System.out.println("Insira a situação dele (1 - disponível   2 - indisponível): ");
                            int situacao = scanner.nextInt();

                            //se a pessoa digitar diferente de 1 ou 2
                            while(situacao != 1 && situacao != 2){
                                System.out.println("Opção inválida. Digite 1 para disponível ou 2 para indisponível: ");
                                situacao = scanner.nextInt();
                            }

                            //true se a situacao for 1 e false se a situacao for 2
                            boolean disponivel = (situacao == 1);
                            disponivel = (situacao == 2);

                            //criando o obj antes de adicionar na lista
                            Livro livro = new Livro(titulo, disponivel);
                            listaLivros.add(livro);

                            System.out.println("Deseja inserir mais livros (1 - sim   0 - não): ");
                            scanner.nextLine();
                            escolha2 = scanner.nextInt();
                        }while(escolha2 != 0);

                    }else{
                        do {
                            System.out.println("--- CADSTRO DE PERIÓDICOS ---");
                            System.out.println("Insira o título: ");
                            scanner.nextLine(); //limpando o buffer
                            String titulo = scanner.nextLine();
                            System.out.println("Insira o número do volume: ");
                            scanner.nextLine(); //limpando o buffer
                            int numeroVolume = scanner.nextInt();

                            //criando o obj
                            Periodico periodico = new Periodico(titulo, numeroVolume);
                            listaPeriodicos.add(periodico);

                            System.out.println("Deseja inserir mais periódicos (1 - sim   0 - não): ");
                            scanner.nextLine();
                            escolha3 = scanner.nextInt();
                        }while (escolha3!=0);
                    }
                    System.out.println("Insira 1 para continuar cadastrando ou 0 para sair: ");
                    scanner.nextLine();
                    escolha_soun = scanner.nextInt();

                }while(escolha_soun!=0);
            }else{
                do {
                    System.out.println("--- SISTEMA DE REGISTRO DE EMPRÉSTIMO ---");

                    for (Livro livro : listaLivros) {
                        System.out.println("Titulo: "+livro.getTitulo()+"\n");
                    }

                    System.out.println("Insira o título do livro que deseja registrar: ");
                    scanner.nextLine(); //limpa o enter anterior
                    String livroEmprestado = scanner.nextLine();

                    for (Livro livro : listaLivros) {
                        //pega o título do livro e compara com o digitado
                        if (livro.getTitulo().equals(livroEmprestado)) { //equals --> metodo para comparar strings
                            //mostra a situacao atual
                            if (livro.isDisponivel()) { //verifica qual a situação do livro - pega la no get (isDisponivel --> true)
                                System.out.println("Atualmente ele está: Indisponível");
                            } else {
                                System.out.println("Atualmente ele está: Disponível");
                            }

                            //pergunta a nova opção
                            System.out.println("Alterar para: (1 - Disponível ou 2 - Indisponível): ");
                            int novaOpcao = scanner.nextInt();

                            // Atualiza
                            livro.setDisponivel(novaOpcao == 1);
                            System.out.println("Situação alterada!");
                        }
                    }

                    System.out.println("Insira 1 para continuar registrando ou 0 para sair: ");
                    scanner.nextLine();
                    escolha5 = scanner.nextInt();
                }while(escolha5!=0);
            }

            System.out.println("Insira 1 para continuar com o sistema ou 0 para sair: ");
            scanner.nextLine();
            escolha4 = scanner.nextInt();
        }while (escolha4!=0);
        System.out.println("Sistema finalizado!");
    }
}
