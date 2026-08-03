public class Lampada {
    private boolean estado;
    private float potencia;
    private float potenciav;

    public Lampada(){
        estado = false;
    }

    Lampada(boolean estado){
        this.estado = estado;
    }

    public void interruptor(){
       if(estado == true){
           estado = false;
       }else{
           estado = true;
       }
    }

    public boolean result(){
        interruptor();
        return estado;
    }

    public float getPotencia(){
        return potencia;
    }
    public void setPotencia(){
        this.potencia = potencia;
    }
}