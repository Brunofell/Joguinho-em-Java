public class Jogavel extends Personagens {

    public Jogavel(String nome, String classe, int vida, int dano){
        super(nome, classe, vida, dano);
    }

    @Override
    public String mostraPersonagem(String nome, int vida, int dano, Jogo jogo, String classe ){
        jogo.adicionarMensagem("Atributos de " + nome);
        jogo.adicionarMensagem(nome + " tem " + vida + " de vida");
        jogo.adicionarMensagem(nome + " tem " + dano + " de dano");
        jogo.adicionarMensagem("A classe do personagem é: " + classe);
        return " ";
    }

    @Override
    public void Atacar(String nome, int dano, Jogo jogo) {
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

