package exercicios;

import utils.Scan;

//2) Faça uma função que receba uma string, você deverá retornar esta string ao contrário.
public class Exercicio2 implements Scan {
    public static void main(String[] args) {
        System.out.println("Digite a palavra que deseja inverter");
        String palavra = sc.nextLine();
        System.out.println(new StringBuilder(palavra).reverse());
    }

}
