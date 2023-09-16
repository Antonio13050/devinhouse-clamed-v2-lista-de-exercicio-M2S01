package exerc4;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDigitado;

        do {
            System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
            numDigitado = Integer.parseInt(scanner.nextLine());
        } while (numDigitado < 1 || numDigitado > 5);

        int numAleatorio = (int) (Math.random() * 5  + 1);

        if (numAleatorio == numDigitado) {
            System.out.println("Você acertou!");
        } else {
            System.out.printf("Você errou, o número correto era %d", numAleatorio);
        }
    }
}
