import java.nio.MappedByteBuffer;

public class Inimigos extends Personagens {

    public Inimigos(String nome, String classe, int vida,  int dano){
        super(nome, classe, vida, dano);
    }

    @Override
    public String mostraPersonagem(String nome, int vida, int dano, Jogo jogo, String classe ){
        jogo.adicionarMensagem("Você encontrou o " + nome);
        jogo.adicionarMensagem("O inimigo tem " + vida + " de vida");
        jogo.adicionarMensagem("O inimigo tem " + dano + " de dano");
        jogo.adicionarMensagem("A Classe dele é: " + classe);
        return "Vamos lutar!";
    }

    @Override
    public void Atacar(String nome, int dano, Jogo jogo) {
        jogo.adicionarMensagem("O " + nome + " vai te atacar!");
        jogo.adicionarMensagem("Ele causa " + dano + " em você!");
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public void setDano(int dano) {
        super.setDano(dano);
    }

    @Override
    public int getVida() {
        return super.getVida();
    }

    @Override
    public void setVida(int vida) {
        super.setVida(vida);
    }
}

