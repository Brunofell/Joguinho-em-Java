package itens;

public class Pocoes {
    private int potMana = 50;
    private int potForca = 35;
    private int potDefesa = 35;
    private int ManaAtual = 30;
    private int ForcaAtual = 30;
    private int DefesaAtual = 30;


    public Pocoes(int ManaAtual ,int potMana, int potForca, int potDefesa){
        this.ManaAtual = ManaAtual = 30;
        this.ForcaAtual = ManaAtual = 30;
        this.DefesaAtual = ManaAtual = 30;
    }

    public void usarPotMana(){
        ManaAtual += potMana;
        System.out.println("Você usou um pot de mana e recuperou"+ potMana + " de mana");
        System.out.println("Sua mana agora é de: " + ManaAtual);
    }
    public void usarPotForca(){
        ForcaAtual += potForca;
        System.out.println("Você usou um pot de força e ganhou "+ potForca + " a mais de força");
        System.out.println("Sua força agora é: " + ForcaAtual);
    }
    public void usarPotDefesa(){
        DefesaAtual += potDefesa;
        System.out.println("Você usou um pot de invencibilidade e ganhou "+ potDefesa + " a mais de força");
        System.out.println("Sua força agora é: " + DefesaAtual);
    }
}


//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Jogo jogo = new Jogo();
//
//        System.out.println("Deseja usar pot de força para conseguir mais ataque? (Digite 'sim' ou 'nao')");
//        String resposta = scanner.nextLine();
//
//        if (resposta.equalsIgnoreCase("sim")) {
//            jogo.usarCarne();
//        } else {
//            System.out.println("Você decidiu não usar a carne.");
//        }
//
//        scanner.close();