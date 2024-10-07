package POO;

import Interface.Controlador;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        if (this.isLigado()){
            this.setVolume(50);
        } else {
            setVolume(0);
        }
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Metodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()){
            System.out.println("------MENU------");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
        }

        } else{
            System.out.println("Não foi possível abrir o menu.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando Menu!!");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            setVolume(getVolume() + 10);
        } else {
            System.out.println("Impossível Aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            setVolume(getVolume() - 10);
        } else {
            System.out.println("Impossível Diminuir o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui dar play.");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            setTocando(false);
        } else {
            System.out.println("Não consegui pausar.");
        }
    }


}
