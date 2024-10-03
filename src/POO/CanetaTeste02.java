package POO;

public class CanetaTeste {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Esferográfica";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 100;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        //c2.modelo = "";
        c2.cor = "Vermelha";
        c2.ponta = 1.0;
        c2.carga = 50;
        //c2.tampada = false;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
