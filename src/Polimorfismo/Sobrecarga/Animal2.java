package Polimorfismo.Sobreposicao;

public abstract class Animal {
    private double peso;
    private int idade;
    private int quantMembros;

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantMembros() {
        return quantMembros;
    }

    public void setQuantMembros(int quantMembros) {
        this.quantMembros = quantMembros;
    }

    @Override
    public String toString() {
        System.out.println("====================================================");
        return "Animal{" +
                "peso = " + peso +
                ", idade = " + idade +
                ", quantMembros = " + quantMembros +
                '}';
    }
}
