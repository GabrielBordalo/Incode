package POO;

import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {

        String operacao = "";
        Teste t1 = new Teste();

        Scanner entrada = new Scanner(System.in);

        while (!operacao.equalsIgnoreCase("E")) {

            System.out.println("A - Gerar ticket.  B - Pagar ticket. \n C - Ver saldo.  D - Status. \n E - Sair.");
            System.out.println("Selecione uma operação: ");
            operacao = entrada.next();



            if (operacao.equalsIgnoreCase("E")){

                break;
            }

            switch (operacao.toUpperCase()){

                case "A":
                    t1.gerarTicket();


                    break;

                case "B":
                    t1.pagarTicket();

                    break;

                case "C":
                    t1.verSaldo();

                    break;

                case "D":
                    t1.status();
            }
        }
        entrada.close();
    }
}
