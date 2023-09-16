package exerc1;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = scanner.nextLine().trim();

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine().trim();

        String nomeCompletoNãoFormatado = nome + sobrenome;
        String nomeCompletoFormatado = nome + " " + sobrenome;

        System.out.printf("Seu nome completo é %s e ele contém %d letras", nomeCompletoFormatado, nomeCompletoNãoFormatado.length());
    }
}
