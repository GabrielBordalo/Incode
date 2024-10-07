package POO;

public class Mouse {

    String modelo;
    String cor;
    int DPI;
    int carga;
    boolean ligado;

    void status(){
        System.out.println("É um mouse do modelo " + this.modelo + ", da cor " + this.cor + ", com " + this.DPI + " de DPI " + "e com " + this.carga +"%");
    }

    void carregar(){
        if (this.carga <= 40){
            System.out.println("O mouse está descarregando, coloque no carregador.");
        } else {
            System.out.println("O mouse está carregado.");
        }
    }

    void ligar(){
        if (this.ligado == false){
            System.out.println("O mouse está ligando.");
        } else {
            System.out.println("O mouse está ligado.");
        }
    }

    void desligar(){
        if (this.ligado == true){
            System.out.println("O mouse está desligado.");
        } else {
            System.out.println("O mouse está desligando.");
        }
    }

    void usar() {
        if (this.ligado == true){
            System.out.println("O mouse está sendo usado.");
        } else {
            System.out.println("Não é possível ultilizar o mouse desligado.");
        }
    }
}
