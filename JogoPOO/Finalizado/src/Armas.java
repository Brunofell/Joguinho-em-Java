public class Armas {
    private int dano;
    public Armas(int dano){
        this.dano = dano;

    }


    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void Espada(int danoEspada, Jogo jogo){
        jogo.adicionarMensagem("");
        jogo.adicionarMensagem("Você comprou a espada!");
        jogo.adicionarMensagem("A espada te dá " + danoEspada + " de dano adicional");
    }


    public void adagas(int danoadaga, Jogo jogo){
        jogo.adicionarMensagem("");
        jogo.adicionarMensagem("Você comprou a adaga");
        jogo.adicionarMensagem("A Adaga te dá " + danoadaga + " de dano adicional");
    }


    public void besta(int danobesta, Jogo jogo){
        jogo.adicionarMensagem("");
        jogo.adicionarMensagem("Você comprou a Besta ");
        jogo.adicionarMensagem("A Besta te dá " + danobesta + " de dano adicional");
    }


    public void chinelo_Da_Mae(int danochinelo, Jogo jogo){
        jogo.adicionarMensagem("");
        jogo.adicionarMensagem("Você comprou o chinelo da mãe ");
        jogo.adicionarMensagem("O Chinelo te dá " + danochinelo + " de dano adicional");
    }
}
