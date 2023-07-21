public class Pocoes {
    private int potForca;
    private int potDefesa;



    public Pocoes(int potForca, int potDefesa){
        this.potForca = potForca;
        this.potDefesa = potDefesa;
    }

    public void PotForca(Jogo jogo, int potForca, int danoPersonagem){
        jogo.adicionarMensagem("Você usou bebeu a poção de força e ganhou "+ potForca + " a mais de dano");
        jogo.adicionarMensagem("O seu dano agora é de " + danoPersonagem);
    }
    public void PotDefesa(Jogo jogo, int potDefesa, int vidaPersonagem){
        jogo.adicionarMensagem("Você bebeu a poção de vida e ganhou "+ potDefesa + " a mais de vida");
        jogo.adicionarMensagem("A sua vida atual é de: " + vidaPersonagem);
    }

    public int getPotDefesa() {
        return potDefesa;
    }

    public int getPotForca() {
        return potForca;
    }
}
