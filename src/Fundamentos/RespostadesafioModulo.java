package Fundamentos;

import java.util.Scanner;

public class RespostadesafioModulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número.");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número.");
        double num2 = entrada.nextDouble();

        System.out.print("Qual é a operação?");
        String operacao = entrada.next();

        //Lógica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;
        
        System.out.printf("%.2f %s %.2f = %s", num1, operacao, num2, resultado);







        entrada.close();
    }
}
