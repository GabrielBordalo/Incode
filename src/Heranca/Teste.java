package Heranca;

public class Teste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.fazerAniversario();

        p2.setNome("Maria");
        p2.setCurso("Informática");
        p2.setIdade(18);
        p2.fazerAniversario();
        p2.setSexo("F");

        p3.setNome("Claúdio");
        p3.setSexo("M");
        p3.setSalario(2500.75);
        p3.fazerAniversario();

        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setSetor("Estoque");
        p4.fazerAniversario();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
