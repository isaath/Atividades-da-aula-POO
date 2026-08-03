public class carro_formula1 {
    // só a classe possa ter acesso
    private int numero;
    private int posicao;
    private String equipe;
    private Piloto piloto;

    //construtor EXEMPLO 1 - metodo com mesmo nome "ah ta pra cirar o carro preciso fazer o que ta dentro desse metodo"
    //esse cnstrutor não é obrigatório. Ele só vai inicializar as variáveis com valores pré-definidos
    /*carro_formula1(){
        //construtor - inicializando elas
        numero = 1;
        posicao = 1;
        equipe = "McLaren";
        piloto = "pilotoA";
    }
     */


    //construtor EXEMPLO 2 - ou podemos passar por parâmetro
    carro_formula1(int numero, int posicao, String equipe, String piloto){
        //inicializar variáveis
        this.numero = numero; //o this fala que estamos falando do numer que inicializamos la na classe
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = null;
    }

    //Exemplo de criação de objeto do tipo carro_formula1
    //carro_formula1 carro1 = new carro_formula1(); //vai receber os valores que passamos ali encima no exemplo 1
    //carro_formula1 carro2 = new carro_formula1(numero 10, posicao 10, equipe "Pudim", piloto "Pudim");
    //carro_formula1 carro3 = new carro_formula1(numero 2, posicao 3, equipe "Biscoito", piloto "Biscoito");


    //GET e SET - sao metodos da classe para acessar as variaveis da classe
    public int getNumero(){
        //get --> "trazer" variável (retornar)
        return numero;
    }
    public void setNumero(int numero){
        //set --> configurar a variável (enviar informação de fora para dentro da classe)
        //this vai na variável da classe
        this.numero = numero;
    }

    public int getPosicao(){
        return posicao;
    }
    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public String getEquipe(){
        return equipe;
    }
    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

    public Piloto getPiloto(){
        return piloto;
    }
    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }
}