package Polimorfismo.Sobrecarga;

public class Cachorro2 extends Lobo {

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

    public void reagir(String frase){
        if (frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("Olá")){
            System.out.println("Abanar Rabo");
        } else {
            System.out.println("Latir");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora > 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, double peso) {
        if (idade < 5) {
            if (peso < 10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else if (peso < 10) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }
}
