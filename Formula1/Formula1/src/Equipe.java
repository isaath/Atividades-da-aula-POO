//Transforme equipe em classe com nome, ano de fundação e um vetor de patrocinadores

public class Equipe {
    private String nome;
    private int ano_fun;
    private String[] patrocinadores;

    //construtor
    Equipe(String nome, int ano_fun, String[] patrocinadores){
        this.nome = nome;
        this.ano_fun = ano_fun;
        this.patrocinadores = patrocinadores;
    }

    //GET e SET
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno_fun(){
        return ano_fun;
    }
    public void setAno_fun(int ano_fun){
        this.ano_fun = ano_fun;
    }

    public String[] getPatrocinadores(){
        return patrocinadores;
    }
    public void setPatrocinadores(String[] patrocinadores){
        this.patrocinadores = patrocinadores;
    }
}
