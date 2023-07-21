public class Armadura {

    public Armadura() {

    }


    public void peitorais(int vidaPersonagem, Jogo jogo){
        jogo.adicionarMensagem("Você comprou um peitoral!");
        jogo.adicionarMensagem("Ela da 50 de vida para o seu personagem!");
        jogo.adicionarMensagem("Vida Atual!" + vidaPersonagem);
    }

    public void capacete(int  vidaPersonagem, Jogo jogo){
        jogo.adicionarMensagem("Você comprou um capacete!");
        jogo.adicionarMensagem("Ela da 40 de vida para o seu personagem!");
        jogo.adicionarMensagem("Vida Atual: " + vidaPersonagem);
    }


    public void luvas(int  vidaPersonagem, Jogo jogo){
        jogo.adicionarMensagem("Você comprou uma luva!");
        jogo.adicionarMensagem("Ela da 10 de vida para o seu personagem!");
        jogo.adicionarMensagem("Vida Atual:  " + vidaPersonagem);
    }

    public void calcas(int  vidaPersonagem, Jogo jogo){
        jogo.adicionarMensagem("Você comprou uma calça!");
        jogo.adicionarMensagem("Ela da 30 de vida para o seu personagem!");
        jogo.adicionarMensagem("Vida Atual: " + vidaPersonagem);
    }

    public void botas(int  vidaPersonagem, Jogo jogo){
        jogo.adicionarMensagem("Você comprou uma bota!");
        jogo.adicionarMensagem("Ela da 20 de vida para o seu personagem!");
        jogo.adicionarMensagem("Vida Atual: " + vidaPersonagem);
    }

}