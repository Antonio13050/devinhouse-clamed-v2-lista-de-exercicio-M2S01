package exerc5;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a segunda nota:");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a terceira nota:");
        double nota3 = Double.parseDouble(scanner.nextLine());

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média final é: %.2f", media);

    }
}
