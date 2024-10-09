package Lambda;

public class CalculoTeste02 {

    public static void main(String[] args) {

        //Aqui é mostrado que as funções lambdas podem ser
        // representadas de formas diferentes, escritas de
        // forma diferente, mas obtendo o mesmo resultado.

        Calculo calc = (x, y) -> {
            return x + y;
        };

        System.out.println(calc.executar(2,3));

        Calculo multiplicar = (x, y) -> {
            return x * y;
        };

        System.out.println(multiplicar.executar(2,3));

        calc = (x, y) -> {
            return x * y;
        };
        System.out.println(calc.executar(3,3));

        calc = (x , y) -> x - y;
        System.out.println(calc.executar(3,3));

        //O metodo Default pode ser acessado a partir das intancias
        // podendo também retornar o próprio parâmetro "Executar".
        System.out.println(calc.legal());

        //O metodo Static só pode ser acessado a partir da própria interface
        System.out.println(Calculo.interessante());
    }
}
