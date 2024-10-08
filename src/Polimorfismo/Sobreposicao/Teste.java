package Polimorfismo.Sobreposicao;

public class Teste {
    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();

        m1.setPeso(65.5);
        m1.setIdade(4);
        m1.setQuantMembros(4);
        System.out.println(m1.toString());
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();

        Canguru c1 = new Canguru();

        c1.setPeso(65.5);
        c1.setIdade(3);
        c1.setQuantMembros(4);
        System.out.println(c1.toString());
        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        c1.usarBolsa();

        Cachorro k1 = new Cachorro();

        k1.setPeso(15);
        k1.setIdade(1);
        k1.setQuantMembros(4);
        System.out.println(k1.toString());
        k1.locomover();
        k1.alimentar();
        k1.emitirSom();
        k1.abanarRabo();
        k1.enterrarOsso();


        Peixe p1 = new Peixe();

        p1.setPeso(0.35);
        p1.setIdade(2);
        p1.setQuantMembros(0);
        System.out.println(p1.toString());
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();

        Ave a1 = new Ave();

        a1.setPeso(0.89);
        a1.setIdade(2);
        a1.setQuantMembros(2);
        System.out.println(a1.toString());
        a1.locomover();
        a1.alimentar();
        a1.emitirSom();
        a1.fazerNinho();
    }
}
