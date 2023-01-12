package exercicios;

import utils.Scan;
public class Exercicio8 implements Scan {
    public static void main(String[] args) {
        int opcao;
        System.out.println("Digite o primeiro numero");
            double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero");
            double numero2 = sc.nextDouble();
        System.out.println("Operação 1: A soma de dois números\n" +
                "Operação 2: A subtração de dois números\n" +
                "Operação 3: A multiplicação de dois números\n" +
                "Operação 4: A divisão de dois números.\n" +
                "Selecione a opção desejada.");
                opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> {
                double soma = numero1 + numero2;
                System.out.println("Soma: " + numero1 + " + " + numero1 + " = " + soma);
            }
            case 2 -> {
                double substracao = numero1 - numero2;
                System.out.println("Subtração: " + numero1 + " - " + numero1 + " = " + substracao);
            }
            case 3 -> {
                double multiplicacao = numero1 * numero2;
                System.out.println("Multiplicação: " + numero1 + " x " + numero1 + " = " + multiplicacao);
            }
            case 4 -> {
                double divisao = numero1 / numero2;
                System.out.println("Divisão: " + numero1 + " / " + numero1 + " = " + divisao);
            }
            default -> System.out.println("Opção Inválida: Operacao abortada!");
        }
   }
}
