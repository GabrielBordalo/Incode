package Generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        CaixaInt c1 = new CaixaInt();

        c1.guardar(123);

        Integer coisaA = c1.abrir();
        System.out.println(coisaA);
    }
}
