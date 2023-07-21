package Personagens;

public abstract class Personagem {
    private String nome;
    private String classe;
    private double vida;
    private int mana;
    private double dano;
    private String sobreClasse;
    private String historia;
    private String habilidade;
    private String habilidadePassiva;
    private int danoHabilidade;
    private int danoHabilidadePassiva;
    private int inteligencia;
    private int sorte;
    private int nivel;
    private float experiencia;


    public Personagem(String nome, String classe, int vida, int mana, int dano, String sobreClasse, String historia, String habilidade, String habilidadePassiva, int danoHabilidade, int danoHabilidadePassiva, int inteligencia, int sorte, int nivel, float experiencia) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.mana = mana;
        this.dano = dano;
        this.sobreClasse = sobreClasse;
        this.historia = historia;
        this.habilidade = habilidade;
        this.habilidadePassiva = habilidadePassiva;
        this.danoHabilidade = danoHabilidade;
        this.danoHabilidadePassiva = danoHabilidadePassiva;
        this.inteligencia = inteligencia;
        this.sorte = sorte;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public abstract void mostraInimigo(String nome, double dano, double vida);

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getMana() {
        return mana;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }
    public double getDano() {
        return dano;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getClasse() {
        return classe;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    public double getVida() {
        return vida;
    }

    public void setSobreClasse(String sobreClasse) {
        this.sobreClasse = sobreClasse;
    }
    public String getSobreClasse() {
        return sobreClasse;
    }


}
