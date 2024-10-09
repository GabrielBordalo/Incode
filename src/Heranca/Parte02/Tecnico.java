package Heranca.Parte02;

public class Tecnico extends Aluno2{

    private int resgistroProfissional;

    public void praticar() {
        System.out.println("O aluno tecnico " + getNome() + " está praticando.");

    }

    public int getResgistroProfissional() {
        return resgistroProfissional;
    }

    public void setResgistroProfissional(int resgistroProfissional) {
        this.resgistroProfissional = resgistroProfissional;
    }
}
