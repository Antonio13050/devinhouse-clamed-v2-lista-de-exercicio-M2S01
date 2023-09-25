package exerc9;

import java.util.Scanner;



public class Exerc9 {

    public static double reajustaSalario(double salarioAtual){

        if (salarioAtual <= 1200 ) {
            salarioAtual *= 1.20;
        } else if (salarioAtual > 1200 && salarioAtual <= 1700) {
            salarioAtual *= 1.15;
        } else if (salarioAtual > 1700 && salarioAtual <= 2500) {
            salarioAtual *= 1.10;
        } else {
            salarioAtual *= 1.05;
        }
        return salarioAtual;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        double salarioInicial = Double.parseDouble(scanner.nextLine());

        double salarioAjustado = reajustaSalario(salarioInicial);
        double valorAumento = salarioAjustado - salarioInicial;

        double aumentoAplicado = ((salarioAjustado / salarioInicial) * 100 - 100);

        System.out.printf("Salario inicial: R$ %f\nAumento aplicado: %.2f%%\nValor do aumento: R$ %.2f\nNovo salário: R$ %.2f", salarioInicial, aumentoAplicado, valorAumento, salarioAjustado);

//        A sua empresa resolveu dar um aumento de salário aos seus funcionários e
//        te pediram para desenvolver o programa que calculará os reajustes.
//
//        a. Faça um programa que recebe o salário de um funcionário e
//        o reajuste segundo o seguinte critério, baseado no salário atual;
//        b. Salários até R$ 1200,00 (incluindo): aumento de 20%;
//        c. Salários entre R$ 1200,00 e R$1700,00: aumento de 15%;
//        d. Salários entre R$ 1700,00 e R$ 2500,00: aumento de 10%;
//        e. Salários de R$ 2500,00 em diante: aumento de 5%

//        Após o aumento ser realizado; informe na tela;
//
//        a. O salário antes do reajuste;
//        b. O percentual de aumento aplicado;
//        c. O valor do aumento;
//        d. O novo salário, após o aumento.
    }
}
