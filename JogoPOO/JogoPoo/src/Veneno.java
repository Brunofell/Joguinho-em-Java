public class Veneno {
    private int veneno;

    public Veneno(int veneno){
        this.veneno = veneno;
    }

    public void usarCarneEnvenenada(int veneno, double vidaAtual, Jogo jogo ){
        jogo.adicionarMensagem("Você comeu o petisco mas ele estava podre, você perdeu "+veneno+" de vida!");
        jogo.adicionarMensagem("Deve ser por isso que estava de graça!!");
        jogo.adicionarMensagem("Sua vida agora é: " + vidaAtual);
    }

    public int getVeneno() {
        return veneno;
    }
}