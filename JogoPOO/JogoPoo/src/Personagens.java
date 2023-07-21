public abstract class Personagens {
    private String nome;
    private String classe;
    private int vida;
    private int dano;

    public Personagens(String nome, String classe, int vida, int dano) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.dano = dano;
    }

    public abstract String mostraPersonagem(String nome, int vida, int dano, Jogo jogo, String classe);


    public abstract void Atacar(String nome, int dano, Jogo jogo);


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getDano() {
        return dano;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVida() {
        return vida;
    }

    public String getClasse() {
        return classe;
    }
}
