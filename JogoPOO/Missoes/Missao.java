package Missoes;
import java.util.ArrayList;

public class Missao {

    private int id;
    private String nome;
    private String tipo;
    private String descricao;
    private String recompensa;
    private int nivelRequerido;
    private String dificuldade;
    private boolean concluida;
    private int fragmentos;
    private String localizacao;

    public Missao(int id, String nome, String tipo, String descricao, String recompensa, int nivelRequerido, String dificuldade, boolean concluida, int fragmentos, String localizacao){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.recompensa = recompensa;
        this.nivelRequerido = nivelRequerido;
        this.dificuldade = dificuldade;
        this.concluida = concluida;
        this.fragmentos = fragmentos;
        this.localizacao = localizacao;
    }

//    ArrayList<Integer> missoes = new ArrayList<>();
//    ArrayList<Integer> fragmentos = new ArrayList<>();

    public static void missao1(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a primeira missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }

    public static void missao2(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a segunda missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }

    public static void missao3(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a terceira missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }

    public static void missao4(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a quarta missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }


    public static void missao5(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a quinta missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }

    public static void missao6(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a sexta missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }

    public static void missao7(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a sétima missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }

    public static void missao8(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a oitava missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }


    public static void missao9(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a nona missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }


    public static void missao10(ArrayList<Integer> missoes, ArrayList<Integer> fragmentos){
        System.out.println("Você completou a decima missão da lista, Parabéns!");
        System.out.println("Você conseguiu um fragmento de chave!");
        fragmentos.add(1);
        missoes.remove(0);
    }
    



}



