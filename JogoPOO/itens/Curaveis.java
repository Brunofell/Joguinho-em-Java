package itens;

//itens que CURAM
public class Curaveis {
    private int carne = 20;
    private int bandagens = 25;
    private int ervasMedicinais = 10;
    private int remedios = 30;
    private int potVida = 50;
    private int Racao = 5;
    private int vidaAtual = 50;


    public Curaveis(int carne, int bandagens, int ervasMedicinais, int remedios, int potVida, int Racao, int vidaAtual){
        this.carne = carne = 20;
        this.bandagens = bandagens = 25;
        this.ervasMedicinais = ervasMedicinais = 10;
        this.remedios = remedios = 30;
        this.potVida = potVida = 50;
        this.Racao = Racao = 5;
        this.vidaAtual = vidaAtual = 50;
    }

    //funções que utilizam os itens para curar 
    public void usarCarne(){
        vidaAtual += carne;
        System.out.println("Você usou a carne e recuperou:" + carne + " de vida");
        System.out.println("Sua vida agora é: " + vidaAtual);
    }

    public void usarBandagens(){
        vidaAtual += bandagens;
        System.out.println("Você usou a carne e recuperou:" + bandagens + " de vida");
        System.out.println("Sua vida agora é: " + vidaAtual);
    }

    public void usarErvasMedicinais(){
        vidaAtual += ervasMedicinais;
        System.out.println("Você usou a carne e recuperou:" + ervasMedicinais + " de vida");
        System.out.println("Sua vida agora é: " + vidaAtual);
    }

    public void usarRemedios(){
        vidaAtual += remedios;
        System.out.println("Você usou a carne e recuperou:" + remedios + " de vida");
        System.out.println("Sua vida agora é: " + vidaAtual);
    }

    public void usarPotVida(){
        vidaAtual += potVida;
        System.out.println("Você usou a carne e recuperou:" + potVida + " de vida");
        System.out.println("Sua vida agora é: " + vidaAtual);
    }
    public void usarRacao(){
        vidaAtual += potVida;
        System.out.println("Você comeu ração de cachorro e recuperou:" + Racao + " de vida");
        System.out.println("Sua vida agora é: " + vidaAtual);
    }
}



//exemplo de codigo para usar os itens de cura, precisa adaptar para cada um dos itens

//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Jogo jogo = new Jogo();
//
//        System.out.println("Deseja usar a carne para recuperar vida? (Digite 'sim' ou 'nao')");
//        String resposta = scanner.nextLine();
//
//        if (resposta.equalsIgnoreCase("sim")) {
//            jogo.usarCarne();
//        } else {
//            System.out.println("Você decidiu não usar a carne.");
//        }
//
//        scanner.close();