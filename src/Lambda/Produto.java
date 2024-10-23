package Lambda;

public class Produto extends Object{

    final String nome;
    final double preco;
    final double descnto;

    public Produto(String nome, double preco, double descnto) {
        this.descnto = descnto;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        double precoFinal = preco * (1 - descnto);
        return "Produto: " + nome + " tem o valor de R$" + precoFinal;
    }
}
