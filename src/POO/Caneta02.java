package POO;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Uma caneta " + this.cor + ", do modelo " + this.modelo + ", com a ponta " + this.ponta + " e com a craga em " + this.carga +"%");
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }

    void tampar() {
        this.tampada = true;
        //this é uam referência ao próprio objeto que vai chamar o método.
    }

    void destampar() {
        this.tampada = false;
    }
}
