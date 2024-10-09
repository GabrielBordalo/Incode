package Polimorfismo.Sobrecarga;

public class Teste {

    public static void main(String[] args) {

        Cachorro2 c1 = new Cachorro2();

        c1.reagir("Olá");
        c1.reagir("Vai apanhar");
        c1.reagir(11,45);
        c1.reagir(21,00);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5);
        c1.reagir(17, 4.5);
        c1.emitirSom();

        Lobo l1 = new Lobo();
        l1.emitirSom();
    }
}
