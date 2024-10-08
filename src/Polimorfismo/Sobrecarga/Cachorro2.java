package Polimorfismo.Sobreposicao;

public class Cachorro extends Mamifero{

    public void enterrarOsso() {
        System.out.println("Enterrou o osso");
    }

    public void abanarRabo() {
        System.out.println("Abanou o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo");
    }
}
