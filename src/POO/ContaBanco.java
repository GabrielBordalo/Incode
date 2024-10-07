package POO;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Aberto: " + this.isStatus());
    }

    public ContaBanco() {
        this.setSaldo(0.0);
        this.setStatus(false);
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo.equalsIgnoreCase("CC")) {
            setSaldo(50.00);

        } else if (tipo.equalsIgnoreCase("CP")) {
            setSaldo(150.00);

        } else {
            System.out.println("Não foi possível abrir uma conta.");
        }
        System.out.println("Conta de " + this.getDono() + " aberta com sucesso!");

    }
    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débitos.");

        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso!!");
        }
    }
    public void depositar(double deposito) {
        if (status = true) {
            setSaldo(getSaldo() + deposito);
            System.out.println("Depósito realizado na conta de " + getDono());

        } else {
            System.out.println("Não é possível fazer o depósito.");
        }
    }
    public void sacar(double saque) {

        if (isStatus()) {
            if (this.getSaldo() >= saque){
                setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Não é possível efetuar o saque.");
            }
        }
    }

    public void pagarMensal() {
        double taxa;
        if (tipo.equalsIgnoreCase("CC")){
            taxa = 12.00;
        } else {
            taxa = 20.00;
        } if (isStatus() && saldo > taxa){
            setSaldo(getSaldo() - taxa);
            System.out.println("Pagamento mensal descontado na conta de " + this.getDono());
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
