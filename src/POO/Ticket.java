package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.*;

public class Ticket {

    private static List<Ticket> armazenamento = new ArrayList<>(); // Alterado para ArrayList
    private String caractere = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
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

    public void gerarTicket() {
        Random gerar = new Random();
        int num = gerar.nextInt(100000);
        this.setNumTicket(getNumTicket() + num);

        Random t = new Random();
        int v = t.nextInt(getCaractere().length());
        char numAleatorio = getCaractere().charAt(v);
        this.setTicket(Character.toString(numAleatorio));

        Ticket ticket = new Ticket();

        armazenamento.add(this); // Adiciona o ticket ao ArrayList

        out.println("========================");
        out.println(this.getTicket() + " ticket " + this.getNumTicket() + " no valor de " + preco + "R$ foi gerado.");
        out.println("========================");
    }

    public void status() {
        if (this.isPago()) {
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
        if (!this.isPago()) {
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
                out.println("Ticket " + contador++ + ", Pago: " + t.isPago());
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

    public static List<Ticket> getArmazenamento() {
        return armazenamento;
    }

    public static void setArmazenamento(List<Ticket> armazenamento) {
        Ticket.armazenamento = armazenamento;
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }
}