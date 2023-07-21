import java.util.ArrayList;

public class Missao extends Quest {


    public Missao(int id, String nome, String tipo, String descricao) {
        super(id, nome, tipo, descricao);
    }

    @Override
    public void mostraMissao(String nome, String tipo, String descricao, Jogo jogo) {
        jogo.adicionarMensagem("Nome da missão: " + nome );
        jogo.adicionarMensagem("tipo: " + tipo );
        jogo.adicionarMensagem("Descrição da missão: " + descricao);
    }

}



