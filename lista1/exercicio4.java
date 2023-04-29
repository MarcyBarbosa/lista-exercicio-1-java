import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args){

        float valorOriginal;
        float NovoValor; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preco do produto");
        valorOriginal = scanner.nextFloat();
        scanner.close();

        NovoValor = valorOriginal + 5;

        System.out.println("O novo preco deste produto:\n" + NovoValor);



    }

    
}
