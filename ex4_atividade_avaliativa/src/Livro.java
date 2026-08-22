public class Livro extends ItensBlibioteca{
    private boolean disponivel;

    //construtor
    public Livro(String titulo, boolean disponivel){
        super(titulo);
        this.disponivel = disponivel;
    }

    //gets e sets
    public boolean getDisponivel(){
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }


}
