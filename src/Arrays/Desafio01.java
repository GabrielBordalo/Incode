package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você vai calcular?");
        int notas = entrada.nextInt();

        double[] n1 = new double[notas];

        for (int i = 0; i < n1.length; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
            n1[i] = entrada.nextDouble();
        }

        System.out.println(Arrays.toString(n1));

        double total2 = 0;
        for (int a = 0; a < n1.length; a++) {
        total2 += n1[a];
        }
        System.out.println("A média do aluno é: " + total2 / n1.length);

        entrada.close();
    }
}
