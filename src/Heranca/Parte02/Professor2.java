package Heranca.Parte02;

public class Professor2 extends Pessoa2{

    private String especialidade;
    private double salario;

    public void receberAumento(double aumento) {
        setSalario(getSalario() + aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
