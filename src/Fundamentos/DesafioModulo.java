package Fundamentos;

import java.util.Scanner;

public class DesafioModulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número.");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número.");
        double num2 = entrada.nextDouble();

        System.out.println("Qual é a operação?");
        String operacao = entrada.nextLine();

        entrada.close();

        double soma = num1 + num2;
        System.out.println("A soma é " + soma);

        double subtracao = num1 - num2;
        System.out.println("A subtração é " + subtracao);

        double divisao = num1 / num2;
        System.out.println("A divisão é " + divisao);

        double multiplicacao = num1 * num2;
        System.out.println("A multiplicação é " + multiplicacao);

        double RestoDivisao = num1 % num2;
        System.out.println("O resto da divisão é " + RestoDivisao);


    }
}
