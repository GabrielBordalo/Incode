package Controle;

import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor1 = 0;
        double valor2 = 0;
        double resultado = 0;
        String operacao = "";
        boolean num = false;

        while (!operacao.equalsIgnoreCase("F")) {

            System.out.println("A- Adição  B- Subtração \n C- Multiplicação  D- Divisão \n E- Módulo da Divisão  F- Sair");
            System.out.println("Escolha uma operação: ");
            operacao = entrada.next();

            if (operacao.equalsIgnoreCase("F")) {
                break;
            }
            switch (operacao.toUpperCase()) {
                case "A":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    resultado = valor1 + valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "B":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    resultado = valor1 - valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "C":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    resultado = valor1 * valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "D":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    if (valor2 == 0) {
                        System.out.println("Divisão inválida.");
                    } else
                        resultado = valor1 / valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "E":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    if (valor2 == 0) {
                        System.out.println("Divisão inválida.");
                    } else
                        resultado = valor1 % valor2;
                    System.out.println("Resultado = " + resultado);
                    break;

                default:
                    System.out.println("Operação inválida, por favor escolha entre A, B, C, D, E ou F.");
            }
        }
        entrada.close();
    }
}