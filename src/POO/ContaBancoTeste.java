package POO;

import java.util.Scanner;

public class ContaBancoTeste {
    public static void main(String[] args) {

       ContaBanco conta01 = new ContaBanco();
       conta01.setNumConta(1111);
       conta01.setDono("João");
       conta01.abrirConta("CC");
       conta01.depositar(500);
       conta01.sacar(250);
       conta01.sacar(300);
       conta01.fecharConta();
       //conta01.pagarMensal();

       ContaBanco conta02 = new ContaBanco();
       conta02.setNumConta(2222);
       conta02.setDono("Maria");
       conta02.abrirConta("CP");
       conta02.depositar(500);
       conta02.sacar(850);

       conta01.estadoAtual();
       conta02.estadoAtual();

    }
}
