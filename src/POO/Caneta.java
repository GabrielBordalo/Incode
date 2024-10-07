package POO;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void status() {
        System.out.println("Uma caneta " + this.getCor() + ", do modelo " + this.getModelo() + ", com a ponta " + this.getPonta() + " e com a craga em " + this.getCarga() +"%");
        System.out.println("Esta tampada? " + this.isTampada());
    }

    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }

    public void tampar() {
        this.tampada = true;
        //this é uam referência ao próprio objeto que vai chamar o método.
    }

    protected void destampar() {
        this.tampada = false;
    }
}
