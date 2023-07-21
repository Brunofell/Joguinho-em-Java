package Missoes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Missao quest1 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest2 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest3 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest4 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest5 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest6 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest7 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest8 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest9 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        Missao quest10 = new Missao(1, "Missão 1", "Luta", "Matar inimigo ma cidade B", "1000 de vida adicional", 1, "Fácil", false, 0, "Cidade B");
        ArrayList<Integer> missoes = new ArrayList<>();
        ArrayList<Integer> fragmentos = new ArrayList<>();

        missoes.add(1);
        missoes.add(2);
        missoes.add(3);
        missoes.add(4);
        missoes.add(5);
        missoes.add(6);
        missoes.add(7);
        missoes.add(8);
        missoes.add(9);
        missoes.add(10);



        System.out.println(missoes);
        System.out.println(fragmentos);

        quest1.missao1(missoes, fragmentos);

        quest2.missao2(missoes, fragmentos);

        quest3.missao3(missoes, fragmentos);

        quest4.missao4(missoes, fragmentos);

        quest5.missao5(missoes, fragmentos);

        quest6.missao6(missoes, fragmentos);

        quest7.missao7(missoes, fragmentos);

        quest8.missao8(missoes, fragmentos);

        quest9.missao9(missoes, fragmentos);

        quest10.missao10(missoes, fragmentos);

        System.out.println(missoes);
        System.out.println(fragmentos);



        if(fragmentos.size() == 10){
            System.out.println("Você pode acessar o BoSS final!");
        } else{
            System.out.println("Saia");
        }
















    }
}