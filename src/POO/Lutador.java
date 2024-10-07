package POO;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitoria(vitoria);
        this.setDerrota(derrota);
        this.setEmpates(empates);


    }

    public void apresentar() {
        System.out.println("--------APRESENTANDO LUTADOR--------");
        System.out.println("Lutador: " + this.getNome() + "\nOrigem: " + this.getNacionalidade() +
                "\nIdade: " + this.getIdade() + " anos. " + "\nAltura: " + this.getAltura() + "m" + "\nPeso: " + this.getPeso() + "Kg" +
                "\nVitorias: " + this.getVitoria() + "\nDerrotas: " + this.getDerrota() + "\nEmpates: " + this.getEmpates());

    }

    public void status() {
        System.out.println("--------STATUS--------");
        System.out.println("Lutador: " + getNome() + "\nCategoria: " + getCategoria() + "\nVitorias: "
                + this.getVitoria() + "\nDerrotas: " + this.getDerrota() + "\nEmpates: " + this.getEmpates() );
    }

    public void ganharLuta() {
        this.setVitoria(getVitoria() + 1);
    }

    public void perderLuta() {
        this.setDerrota(getDerrota() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }



    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            categoria = "Leve";
        } else if (this.peso <= 83.9) {
            categoria = "Médio";
        } else if (this.peso <= 102.2){
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
}

