package exercicios;

import java.util.Arrays;
//1) Faça uma função que receba um array composto de [ 1, 2, 3, 4, 5, 6, 6 ], você deverá retornar o segundo maior número deste array.
public class Exercicio1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 6};
        int[] arraySemRepeticao = Arrays.stream(array).distinct().toArray();
        int maior = Arrays.stream(arraySemRepeticao).max().getAsInt();
        int[] arraySemMaior = Arrays.stream(arraySemRepeticao).filter(i -> i != maior).toArray();
            System.out.println("Segundo maior valor é:" + Arrays.stream(arraySemMaior).max().getAsInt());
    }
}