package exercicios;

import utils.Scan;
import java.util.HashSet;
import java.util.Set;


//3) Faça uma função que retorne apenas as vogais de uma palavra.
public class Exercicio3 implements Scan {
    public static void main(String[] args) {
        System.out.println("Digite a palavra");
        String palavra = sc.nextLine();
        Set<Character> lista = new HashSet<>();

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a') {
                lista.add(palavra.charAt(i));
            } else if (palavra.charAt(i) == 'e') {
                lista.add(palavra.charAt(i));
            } else if (palavra.charAt(i) == 'i') {
                lista.add(palavra.charAt(i));
            } else if (palavra.charAt(i) == 'o') {
                lista.add(palavra.charAt(i));
            } else if (palavra.charAt(i) == 'u') {
                lista.add(palavra.charAt(i));
            }
        }
        System.out.println("Vogais:");
            for (Character character: lista) {
                System.out.print(character + " ");
            }
    }
}