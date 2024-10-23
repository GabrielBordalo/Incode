package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.System.*;

public class Ticket {

    private  List<Ticket> armazenamento = new ArrayList<>(); // Alterado para ArrayList

    private String ticket;
    private int numTicket = 0;
    private double preco = 8.00;
    private boolean pago;
    private double saldo;

    public void verSaldo() {
        if (this.isPago()) {
            this.setSaldo(this.getSaldo() + this.preco);
            out.println("===========================");
            out.println("O saldo é: " + this.getSaldo());
            out.println("===========================");
        }
    }

    public void gerarTicket(int num) {
        Ticket ticket = new Ticket();
        out.println(num);
        this.setNumTicket(num);

        armazenamento.add(ticket); // Adiciona o ticket ao ArrayList

        out.println("========================");
        out.println(this.getTicket() + " ticket " + this.getNumTicket() + " no valor de " + preco + "R$ foi gerado.");
        out.println("========================");

        for (Ticket t : armazenamento) {
            out.println(t);
        }



    }





    public void status() {
        if (!this.isPago()) {
            out.println("=============================");
            out.println("O ticket " + this.getNumTicket() + " já foi pago.");
            out.println("=============================");
        } else if (numTicket == 0) {
            out.println("==============================");
            out.println("Nenhum ticket foi gerado.");
            out.println("==============================");
        } else {
            out.println("=============================");
            out.println("O ticket " + this.getNumTicket() + " não foi pago.");
            out.println("=============================");
        }
    }

    public void pagarTicket() {

        if (this.isPago()) {
            this.setPago(true);
            out.println("===== O Ticket foi pago =====");
        } else {
            out.println("===== O Ticket já foi pago =====");
        }
    }


    
    public void listaTickets() {
        if (armazenamento.isEmpty()) {
            out.println("Nenhum ticket foi gerado.");
        } else {
            out.println("==== Lista de Tickets ====");
            int contador = 1;
            for (Ticket t : armazenamento) {
                out.println("Ticket "+ getNumTicket() + ", Pago: " + t.isPago());
            }
        }
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public  List<Ticket> getArmazenamento() {
        return armazenamento;
    }



    @Override
    public String toString() {
        return "Ticket{" +
                "numTicket=" + numTicket +
                ", ticket='" + ticket + '\'' +
                ", preco=" + preco +
                ", pago=" + pago +
                ", saldo=" + saldo +
                '}';
    }
}