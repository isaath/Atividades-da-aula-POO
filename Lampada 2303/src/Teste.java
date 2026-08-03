import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        boolean resultado;
        int escolha;
        float valor_watts;
        float potencia = 60;

        resultado = lampada.result();
        System.out.println(resultado);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deseja informar quantos watss tem a lâmpada?(1 - sim e 2-não)");
        escolha = scanner.nextInt();

        if(escolha == 1){
            System.out.println("Insira o valor da potência: ");
            valor_watts = scanner.nextFloat();
            System.out.println("Valor da potência: "+valor_watts+"W");
        }else{
            System.out.println("Valor da potência: "+potencia+"Ws");
        }
    }
}
