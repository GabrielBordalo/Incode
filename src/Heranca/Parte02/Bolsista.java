package Heranca.Parte02;

public class Bolsista extends Aluno2 {

    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + " é bolsista, pagamento facilitado de " + getBolsa() + "% de desconto.");

    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
