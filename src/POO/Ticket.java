package POO;

import java.util.Random;

import static java.lang.System.*;

public class Teste {

   // public String operacao;
    private int numTicket = 0;
    private double preco = 8.00;
    private boolean pago;
    private double saldo;


    public void verSaldo(){
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
        out.println("========================");
        out.println("O ticket " + this.getNumTicket() + " no valor de " + preco + "R$ foi gerado.");
        out.println("========================");
    }

    public void status() {
        if (this.isPago()){
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
        double preco;
        if (!this.isPago()){
            this.setPago(true);
            out.println("===== O Ticket foi pago =====");
        } else {
            out.println("===== O Ticket foi pago =====");
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

}

