package Interface;

public interface Publicacao {

    String detalhes();

    public abstract void abrir();
    public abstract void fechar();
    public abstract void folear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
