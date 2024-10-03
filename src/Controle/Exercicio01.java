package Controle;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int valor = entrada.nextInt();

        if (valor >= 0 && valor <= 10 && valor % 2 == 0) {
        System.out.println(valor + " Está entre 0 e 10 e é par");
        } else if (valor >= 0 && valor <= 10){
            System.out.println(valor + " Está entre 0 e 10 e é ímpar");
        } else {
            System.out.println("Número inválido");
        }

        entrada.close();
    }
}
