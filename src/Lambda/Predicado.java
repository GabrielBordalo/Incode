package Lambda;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.descnto)) >= 750;
        Produto prod = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(prod));
    }
}
