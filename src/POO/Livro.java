package POO;

import Interface.Publicacao;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    @Override
    public String detalhes() {
        System.out.println("===============================");
        return "Livro{ " +
                "titulo= '" + titulo + '\'' +
                ", autor= '" + autor + '\'' +
                ", \ntotPaginas= " + totPaginas +
                ", pagAtual= " + pagAtual +
                ", aberto= " + aberto +
                ", \nleitor= " + getLeitor().getNome() +
                " Idade= " + getLeitor().getIdade() +
                " Sexo= " + getLeitor().getSexo() +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folear(int p) {
        if (p > this.totPaginas){
            setPagAtual(0);

        } else {
            setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual() + 1);

    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);

    }
}
