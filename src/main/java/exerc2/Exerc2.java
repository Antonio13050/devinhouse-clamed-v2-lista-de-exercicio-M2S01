package exerc2;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite a sua altura:");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o seu peso:");
        double peso = Double.parseDouble(scanner.nextLine());

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %2f", imc);


    }
}
