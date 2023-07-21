package Personagens;

public class Jogavel extends Personagem{

    public Jogavel(String nome, String classe, int vida, int mana, int dano, String sobreClasse, String historia, String habilidade, String habilidadePassiva, int danoHabilidade, int danoHhabilidadePassiva, int inteligencia, int sorte, int nivel, float experiencia) {
        super(nome, classe, vida, mana, dano, sobreClasse, historia, habilidade, habilidadePassiva, danoHabilidade, danoHhabilidadePassiva, inteligencia, sorte, nivel, experiencia);
    }

    
    @Override
    public void mostraInimigo(String nome, double dano, double vida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostraInimigo'");
    }


   public void atacar(int dano) {
    System.out.println("Você atacou e causou " + dano + " de dano!");
   }

   public void usarHabilidade(String habilidade, int danoHabilidade) {
    System.out.println("Você usou a habilidade " + habilidade + " e causou " + " de dano!");

   }

   public void usarHabilidadePassiva(int vida, String habilidadePassiva, int cura) {
    System.out.println("Você usou a habilidade " + habilidadePassiva + " e recuperou " + cura + " de vida");
    vida += cura;
   }

    public void usarFeitico(int mana, int dano){
        System.out.println("Você usou um feitiço! Causou " + dano + " de dano e gastou " + mana + " de mana!");
    }

    public void ganharNivel(int exp, int expSoma, int nivel) {
        expSoma += exp;
        if (expSoma >= 100) {
            System.out.println("Você ganhou um nível! Agora você é nível " + nivel);}
    }

    public void ganharExperiencia(int exp, int expSoma, int nivel) {
        System.out.println("Você ganhou " + exp + " de experiência!");
        ganharNivel(exp, expSoma, nivel);
    }

}
