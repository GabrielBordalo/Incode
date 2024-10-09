package Lambda;

@FunctionalInterface //Serve para frizar que a interface só vai possuir um metodo.
public interface Calculo {

    public abstract double executar(double a, double b);



    //O metodo Default pode ser acessado a partir das intancias
    // podendo também retornar o próprio parâmetro "Executar".
    default String legal() {
        return "Muito legal";
    }


    //O metodo Static só pode ser acessado a partir da própria interface
    static String interessante() {
        return "Muito interessante";
    }
}
