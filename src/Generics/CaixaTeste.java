package Generics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Caneta");
        System.out.println(caixaA.abrir());

    }
}
