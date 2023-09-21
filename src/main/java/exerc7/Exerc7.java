package exerc7;

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a operação: ");
        String op = scanner.nextLine();

        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num2 - num1);
                break;
            case "*":
                System.out.println(num2 * num1);
                break;
            case "/":
                System.out.println(num2 / num1);
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }

//    Crie um programa em Java que, utilizando a classe Scanner, simule
//    uma calculadora. O programa deve pedir um número, depois outro, e
//    por último uma operação. O sistema deve aceitar como operação qualquer
//    uma dessas 4 opções: “somar”, “subtrair”, “multiplicar” ou "dividir",
//    e realizar a operação correspondente entre os 2 números inseridos,
//    para então escrever na tela do usuário o resultado.
}
