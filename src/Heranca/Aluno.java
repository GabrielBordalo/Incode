package Heranca;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void cancelarMatricula() {
        setMatricula(0);
        System.out.println("==================");
        System.out.println("Matrícula foi cancelada.");
        System.out.println("==================");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
