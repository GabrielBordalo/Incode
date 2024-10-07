package POO;

public class ObjConceitual {

    String aula;
    int horario;
    int duracao;
    boolean presente;

    void status(){
        System.out.println(this.aula + " começa as " + this.horario + "horas e vai ter " + this.duracao + "minutos de aula.");
    }

    void assitir(){
        if (this.presente == true) {
            System.out.println("A aula foi assistida.");
        } else {
            System.out.println("A aula não foi assistida.");
        }
    }
}
