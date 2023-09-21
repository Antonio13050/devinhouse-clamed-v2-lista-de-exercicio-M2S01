package exerc8;

import java.util.ArrayList;
import java.util.Scanner;



public class Exerc8 {

    public static void calculaPA(int vlrInicial, int raiz){
        for(int i = 0; i < 10; i++){
            System.out.println(vlrInicial);
            vlrInicial += raiz;
        }
    }

    public static void calculaPG(int vlrInicial, int raiz){
        for(int i = 0; i < 10; i++){
            System.out.println(vlrInicial);
            vlrInicial *= raiz;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        int valorInicial = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a raiz: ");
        int raiz = Integer.parseInt(scanner.nextLine());

        System.out.println("Para calcular os 10 primeiros valores de uma P.A. digite 1, para calcular os 10 primeiros valores de uma P.G. digite 2");
        int op = Integer.parseInt(scanner.nextLine());

        switch (op) {
            case 1:
                calculaPA(valorInicial,raiz);
                break;
            case 2:
                calculaPG(valorInicial,raiz);
                break;
            default:
                System.out.println("Operação inválida.");
        }

    }
}
//    Crie um programa em Java que, utilizando a classe Scanner, simule uma
//    calculadora de P.A. e P.G. Peça para o usuário inserir um “valor
//    inicial”, que deve ser um número inteiro. Em seguida, peça ao
//    usuário para inserir um valor para a raiz. Depois, pergunte ao
//    usuário se ele deseja calcular os 10 primeiros valores de uma P.A.
//    ou de uma P.G. para os números inseridos anteriormente. Então,
//    calcule os 10 primeiros valores de uma P.A. ou P.G. utilizando
//    os números inseridos pelo usuário, e escreva essa sequência de
//    valores na tela para o usuário visualizar o resultado.
//
//    ‌
//
//    Relembrando: P.A. (Progressão Aritmética) é uma sequência numérica
//    em que cada termo, a partir do segundo, é igual à soma do termo
//    anterior com a raiz. Exemplo:
//    Valor inicial = 1; raiz = 3; P.A. = 1, 4, 7, 10, 13, 16, 19, 22, 25, 28.
//
//    P.G. (Progressão Geométrica) é como uma P.A., mas em vez de somar,
//    multiplica-se a raiz. Exemplo:
//    Valor inicial = 1; raiz = 3; P.G. = 1, 3, 9, 27, 81...