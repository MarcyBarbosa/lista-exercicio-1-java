import java.util.Scanner;
import Math;

public class exerc6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double l1;
        double l2;
        double r;

        System.out.println("Digite um numero para calcular log:");
        l1 = scanner.nextDouble();

        System.out.println("Qual e a base do calculo logaritmo:");
        l2 = scanner.nextDouble();

        r = (Math.log(l1)) / (Math.log(l2));

        System.out.println("O resultado de log:" + r);

        scanner.close();
    }
}

