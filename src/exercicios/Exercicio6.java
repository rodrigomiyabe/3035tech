package exercicios;

import utils.Scan;

public class Exercicio6 implements Scan {
    //6)Escreva um programa EM JAVA que lê três números reais, calcule e apresente a soma e a média dos números informados com 2 casas depois da vírgula.
    public static void main(String[] args) {
        int numero;
        int qtdeNumero = 3;
        double media;
        double soma = 0.0;

        for(int i = 1; i <= qtdeNumero; i++){
            System.out.println("Digite o " + i + "º numero ");
            numero = sc.nextInt();
            soma += numero;
        }
        media = soma/3;
        System.out.println("Soma = " + soma);
        System.out.printf("Media = %.2f", media);
    }
}
