package exercicios;

import utils.Scan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio4 implements Scan {
 // 4) Faça uma função que receba uma data no formato MM/DD/YYYY, exemplo: 03/01/2002. Você deverá informar a qual dia da semana essa data se refere.
    public static void main(String[] args) {
        System.out.println("Digite a data no formato MM/dd/yyyy");
            String data = sc.nextLine();
        LocalDate dataFormatada = LocalDate.parse(data, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            System.out.println(dataFormatada.getDayOfWeek());

    }

}
