package Polimorfismo.Sobrecarga;

public class Lobo extends Mamifero2{

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo carne");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuu");
    }
}
