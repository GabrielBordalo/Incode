package POO;

public class MouseTeste {

    public static void main(String[] args) {

        Mouse m1 = new Mouse();
        m1.modelo = "X3";
        m1.cor = "Vermelho";
        m1.DPI = 880;
        m1.carga = 100;
        //m1.ligado = false;
        m1.status();
        m1.carregar();
        m1.desligar();
        m1.usar();

        Mouse m2 = new Mouse();
        m2.modelo = "Gpro";
        m2.cor = "Vermelho";
        m2.DPI = 880;
        m2.carga = 15;
        m2.ligado = true;
        m2.status();
        m2.carregar();
        //m2.desligar();
        m2.usar();

    }
}
