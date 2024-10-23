package Generics;

public class CaixaObjTeste {

    public static void main(String[] args) {

        //exemplo sem gererics.

        CaixaObj caixa1 = new CaixaObj();
        caixa1.guardar(2.3);

        Integer coisa = (Integer) caixa1.abrir();

        System.out.println(coisa);
    }
}
