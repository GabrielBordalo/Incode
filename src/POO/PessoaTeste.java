package POO;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("João", 21, "M");
        p[1] = new Pessoa("Maria", 21, "F");

        l[0] = new Livro("Aprendendo java", "EU", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "TU", 500, p[1]);
        l[2] = new Livro("Java para iniciantes", "TU", 1500, p[0]);

        l[0].abrir();
        l[0].folear(258);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();

        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folear(258);
        l[1].avancarPag();
        l[1].avancarPag();

        System.out.println(l[1].detalhes());
    }
}
