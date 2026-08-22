public class Periodico extends ItensBlibioteca{
    private int numeroVolume;

    //contrutor
    public Periodico(String titulo, int numeroVolume){
        super(titulo);
        this.numeroVolume = numeroVolume;
    }

    //gets e sets
    public int getNumeroVolume(){
        return numeroVolume;
    }
    public void setNumeroVolume(int numeroVolume){
        this.numeroVolume = numeroVolume;
    }
}
