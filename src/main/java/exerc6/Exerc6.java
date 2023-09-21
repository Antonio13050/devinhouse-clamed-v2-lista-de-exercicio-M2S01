package exerc6;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua data de nascimento? Utilize o formato dd/mm/aaaa (ex. 04/09/1992)");
        String stringDtNascimento = scanner.nextLine();

        int dia = Integer.parseInt(stringDtNascimento.substring(0, 2));
        int mes = Integer.parseInt(stringDtNascimento.substring(2, 4));
        int ano = Integer.parseInt(stringDtNascimento.substring(4, 8));

        LocalDate dtNascimento = LocalDate.of(ano, mes, dia);

        int idade = Period.between(dtNascimento, LocalDate.now()).getYears();

        System.out.println(idade);

       if (idade >= 18 && idade <= 59){
           System.out.println("O voto é obrigatório");
       } else if (idade == 16 || idade == 17 || idade > 59) {
           System.out.println("O voto é opcional");
       } else {
           System.out.println("O voto é proibido");
       }

//        Se o usuário tiver 16, 17, ou mais de 59 anos, o voto é opcional.
//        Entre 18 e 59 anos, o voto é obrigatório.
//        Abaixo de 16, o voto é proibido.
//        Informe ao usuário a situação de voto.
     }
}
