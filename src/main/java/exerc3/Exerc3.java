package exerc3;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            System.out.printf("O número %d é par", num);
        } else {
            System.out.printf("O número %d é impar", num);
        }
    }
}
