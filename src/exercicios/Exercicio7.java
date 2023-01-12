package exercicios;

import utils.Scan;

//7) Crie um programa EM JAVA que leia um número real,
// calcule e exiba na tela os valores correspondentes
// a 5%, 50% e 150% do valor informado com 1, 2 e 3 casas decimais.
public class Exercicio7 implements Scan {
    public static void main(String[] args) {
        double calculo1, calculo2, calculo3;
        System.out.println("Digite um numero");
            int numero = sc.nextInt();
            calculo1 = numero * 0.05;
            calculo2 = numero * 0.5;
            calculo3 = numero * 1.5;

        System.out.println("Porcentagem: 5%");
            System.out.printf("%.1f\n", calculo1);
            System.out.printf("%.2f\n", calculo1);
            System.out.printf("%.3f\n", calculo1);

        System.out.println("Porcentagem: 50%");
            System.out.printf("%.1f\n", calculo2);
            System.out.printf("%.2f\n", calculo2);
            System.out.printf("%.3f\n", calculo2);

        System.out.println("Porcentagem: 150%");
            System.out.printf("%.1f\n", calculo3);
            System.out.printf("%.2f\n", calculo3);
            System.out.printf("%.3f\n", calculo3);
    }
}
