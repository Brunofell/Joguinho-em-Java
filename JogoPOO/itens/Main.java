package itens;

public class Main {
    public static void main(String[] args) {
        Curaveis curaveis = new Curaveis(20, 25, 10, 30, 50, 5, 50);
        Pocoes pocoes = new Pocoes(30, 50, 35, 35);

        curaveis.usarCarne();
        curaveis.usarBandagens();
        curaveis.usarErvasMedicinais();
        curaveis.usarRemedios();
        curaveis.usarPotVida();
        curaveis.usarRacao();
        System.out.println("-----------");
        pocoes.usarPotMana();
        pocoes.usarPotForca();
        pocoes.usarPotDefesa();
    }
}
