package Polimorfismo.Sobreposicao;

public class Canguru extends Mamifero{

    public void usarBolsa() {

        System.out.println("Usou a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
