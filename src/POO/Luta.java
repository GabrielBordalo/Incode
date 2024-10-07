package POO;

import java.util.Random;

public class Luta {

    //Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Metodos

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1.getNome() != l2.getNome()) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }

    }

    public void lutar() {
        if (isAprovada()){
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            Random resultado = new Random();
            int vencedor = resultado.nextInt(3);

            System.out.println("========RESULTADO========");
            switch (vencedor) {

                case 0:
                    System.out.println("Empate entre os lutadores " + desafiado.getNome() + " e " + desafiante.getNome());
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();

                    break;

                case 1:
                    System.out.println("Vitoria desafiado: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();

                    break;

                case 2:
                    System.out.println("Vitoria desafiante: " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();

                    break;

            }
            System.out.println("================");

        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    //Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
