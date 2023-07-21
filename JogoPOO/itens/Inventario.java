import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario{
    public static int carne = 0;
    public static void main(String[] args) {
        List <Integer> Inventario = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você estava andando e encontrou um pedaço de carne no chão, o que deseja fazer: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Você estava andando e encontrou um pedaço de carne no chão, o que deseja fazer: ");
        if (escolha == 1){
            System.out.println("Você pegou a carne!");
            Inventario.add(carne);
            System.out.println(Inventario);
        }
        System.out.println("Você é atacado por 1 inimigo e perdeu vida! Deseja comer a carne e recuperar 50 de vida: ");
        System.out.println(Inventario);
        int escolha2 = scanner.nextInt();
        if(escolha2 == 1){
            if(Inventario.contains(carne)){
                System.out.println("Você comeu carne e recuperou 50 de vida!");
                Inventario.remove(carne);
            } else if (!Inventario.contains(carne)) {
                System.out.println("Você não possui nenhuma carne");
            }
        }
        scanner.close();
    }
}



