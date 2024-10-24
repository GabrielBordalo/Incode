package Lambda;

import java.util.function.UnaryOperator;

public class OperadorUniario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);

        System.out.println(resultado);

        //Existe o Compose, a diferença é que o compose vai rodar ao contrário
    }
}
