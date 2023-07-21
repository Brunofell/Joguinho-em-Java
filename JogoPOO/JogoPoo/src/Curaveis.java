public class Curaveis {

    public Curaveis(){
    }

    //funções que utilizam os itens para curar
    public void usarCarne(Jogo jogo, int vidaItem, int vidapersonagem ){
        jogo.adicionarMensagem("Você comeu a carne e ganhou mais " + vidaItem + " de vida");
        jogo.adicionarMensagem("Vida atual: " + vidapersonagem);
        jogo.adicionarMensagem("");
    }

    public void bandagens(Jogo jogo, int vidaItem, int vidapersonagem ){
        jogo.adicionarMensagem("Você usou o Band-Aid e ganhou mais " + vidaItem + " de vida");
        jogo.adicionarMensagem("Vida atual: " + vidapersonagem);
        jogo.adicionarMensagem("");
    }

    public void ervasMedicinais(Jogo jogo, int vidaItem, int vidapersonagem ){
        jogo.adicionarMensagem("Você fez um chá das ervas e ganhou mais " + vidaItem + " de vida");
        jogo.adicionarMensagem("Vida atual: " + vidapersonagem);
        jogo.adicionarMensagem("");
    }



}