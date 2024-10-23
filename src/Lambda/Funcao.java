package Lambda;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
        num -> num % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        System.out.println(oResultadoE.apply("20"));

        String resultadoFinal =
                parOuImpar.andThen(oResultadoE).apply(32);
        //Para continuar relacionando funções, é nescessário que
        //a saída de uma função seja a entrada da função seguinte.

        System.out.println(resultadoFinal);
    }
}
