//Transforme piloto em um objeto que tenha nome, idade e nacionalidade

public class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;

    //construtor
    Piloto(String nome, int idade, String nacionalidade){
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    //GEt e SET
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

}