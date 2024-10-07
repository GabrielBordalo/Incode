package POO;

public class Caneta02 {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    //Vai conseguir acessar uma classe privada atravez de um "metodo"
    // ele sendo publico ou protegido, pois ao tenatr acessar diretamenta o atributo vai dar erro pois o
    //atributo é privado, porém o metodo por fazer parte da classe vai ter acesso a esse atributo privado.
    // (LEMBRAR DA ANALOGIA DO CAIXA DE SUPERMERCADO.)


    public Caneta02(String modelo, String cor, double ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void status() {
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

    protected void tampar() {
        this.tampada = true;
        //this é uam referência ao próprio objeto que vai chamar o método.
    }

    protected void destampar() {
        this.tampada = false;
    }
}
