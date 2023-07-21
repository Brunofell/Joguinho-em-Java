package itens;

public class Veneno {
    private int veneno = 30;



    public Veneno(int veneno){
        this.veneno = veneno;
    }

    public void usarCarne(){
        vidaAtual -= veneno;
        System.out.println("Você tomou dano de veneno e perdeu: " + veneno + "de vida");
        System.out.println("Sua vida agora é: " + vidaAtual);
    }
}



//exemplo de uso de item para recuperar vida e curar o veneno

///public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Jogo jogo = new Jogo();
//
//        System.out.println("Deseja usar a poção dvida para recuperar vida e curar o veneno? (Digite 'sim' ou 'nao')");
//        String resposta = scanner.nextLine();
//
//        if (resposta.equalsIgnoreCase("sim")) {
//            jogo.potVida();
//            inventario.remove(potVida)
//        } elseif{
//            System.out.println("Você decidiu não usar a carne.");
//        }else{Você não possui pote de vida para recuperar o HP}
//
//        scanner.close();
