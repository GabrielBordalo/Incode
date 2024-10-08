package Lambda;

import java.util.function.BinaryOperator;

//Usando uma FunctionalInterface e uma função Lambda já existente.
public class CalculoTeste03 {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.apply(2.0,3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,3.0));
    }
}
