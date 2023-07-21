package Personagens;

public class Inimigos extends Personagem {

    public Inimigos(String nome, String classe, int vida, int mana, int dano, String sobreClasse, String historia, String habilidade, String habilidadePassiva, int danoHabilidade, int danoHabilidadePassiva, int inteligencia, int sorte, int nivel, float experiencia) {
        super(nome, classe, vida, mana, dano, sobreClasse, historia, habilidade, habilidadePassiva, danoHabilidade, danoHabilidadePassiva, inteligencia, sorte, nivel, experiencia);
    }

    public void danoGoblins(double vidaCaracter, double danoInimigo ){
         System.out.println("_ o Goblin vai atacar!");
         vidaCaracter -= danoInimigo;

    }

    public void danoOrcs(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Orc vai atacar!");
        vidaCaracter -= danoInimigo;
    }


    public void danoLobos(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Lobo vai atacar!");
        vidaCaracter -= danoInimigo;
    }


    public void danoEsqueletos(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Esqueleto vai atacar!");
        vidaCaracter -= danoInimigo;
    }

    public void danoAranha(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Aranha vai atacar!");
        vidaCaracter -= danoInimigo;
    }


    public void danoDemonio(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Demonio vai atacar!");
        vidaCaracter -= danoInimigo;
    }

    public void danoGigantes(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Gigante vai atacar!");
        vidaCaracter -= danoInimigo;
    }


    public void danoDragoes(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Dragão vai atacar!");
        vidaCaracter -= danoInimigo;
    }

    public void danoZumbis(double vidaCaracter, double danoInimigo ){
        System.out.println("_ O Zumbi vai atacar!");
        vidaCaracter -= danoInimigo;
    }

    public void danoBruxa(double vidaCaracter, double danoInimigo ){
        System.out.println("_ A Bruxa vai atacar!");
        vidaCaracter -= danoInimigo;
    }


    @Override
    public void mostraInimigo(String nome, double vida, double dano){
        System.out.println("Você encontrou um " + nome);
        System.out.println("O inimigo tem " + vida + " de vida");
        System.out.println("O inimigo tem " + dano + " de dano");
    }

    public static void main(String[] args) {

        Inimigos inimigo1 = new Inimigos("Bruxa", "Maga", 200, 1600, 250, "È uma feiticeira maligna", "Feiticeira que nasceu nos pantanos e nunca mais saiu de lá, muito má", "Possui uma magia muito forte", "Ela da uma risada de vez enquanto que tira dano.", 200, 200, 250,250, 160, 5000);

        inimigo1.mostraInimigo(inimigo1.getNome(), inimigo1.getVida(), inimigo1.getDano());
    }




}

