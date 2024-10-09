package Heranca.Parte02;

public class Teste2 {

    public static void main(String[] args) {

        Visitante v1 = new Visitante();

        v1.setNome("joão");
        v1.setIdade(18);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno2 a1 = new Aluno2();

        a1.setNome("João");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.setCurso("Informática");
        a1.setMatricula(1111);

        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setNome("João");
        b1.setIdade(21);
        b1.setSexo("M");
        b1.setCurso("Informática");
        b1.setMatricula(1112);
        b1.setBolsa(100);

        System.out.println(b1.toString());
        b1.pagarMensalidade();


    }
}
