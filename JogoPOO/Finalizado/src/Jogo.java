import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Jogo extends JFrame {
    private JTextArea outputArea;
    private JTextField inputField;
    private ArrayList<Jogavel> campeoes;
    private float ouro;
    private int vidaPersonagem;
    private int danoPersonagem;
    private String nomePersonagem;


    Missao quest5 = new Missao(1, "Missão: Matar o Demônio", "Luta ", "Matar o Demônio em uma localização desconhecida!");

    Inimigos demonio = new Inimigos("Demônio", "Demônio", 2000, 50);

    ArrayList<Integer> missoes = new ArrayList<>();


    // verificações booleanas
    boolean mercado = false;

    ///// instâncias das classes

    Armadura armadura = new Armadura();
    Armas espada = new Armas(50);
    Armas adaga = new Armas(30);
    Armas besta = new Armas( 60);
    Armas chineloDamae = new Armas( 200);
    Curaveis curaveis = new Curaveis();
    Pocoes potion = new Pocoes(20, 60);
    Veneno veneno = new Veneno(50);

    public void adicionarMensagem(String mensagem) {
        appendToOutput(mensagem);
    }

    public Jogo() {
        super("História:");

        campeoes = new ArrayList<>();
        ouro = 0;

        missoes.add(1);


        vidaPersonagem = 0;
        danoPersonagem = 0;
        nomePersonagem = "";

        // Configura o layout
        setLayout(new BorderLayout());

        // Cria a área de saída
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Cria o campo de entrada
        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = inputField.getText();
                try {
                    processCommand(command);
                } catch (FinalException ex) {
                    throw new RuntimeException(ex);
                }
                inputField.setText("");
            }
        });
        add(inputField, BorderLayout.SOUTH); // adiciona o input no "sul"" da interface

        // Configura a tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        inicio();
    }

    private void inicio(){

        //mostra os personagens criados na primeira parte da história, por meio
        // dos metodos feitos na classe personagens

        Jogavel guerreiro = new Jogavel("Kayn", "Guerreiro", 400, 150);
        Jogavel mago = new Jogavel("Veigar", "Mago", 200, 150);
        Jogavel atirador = new Jogavel("Caitlyn", "Atirador", 250, 200);
        Jogavel assassino = new Jogavel("Yone", "Assassino", 400, 5000);
        Jogavel alquimista = new Jogavel("Teemo", "Alquimista", 10, 120);

        campeoes.add(guerreiro);
        campeoes.add(mago);
        campeoes.add(atirador);
        campeoes.add(assassino);
        campeoes.add(alquimista);

        appendToOutput("Escolha um personagem:");
        appendToOutput("");
        appendToOutput(guerreiro.getNome());
        guerreiro.mostraPersonagem(guerreiro.getNome(),guerreiro.getVida(), guerreiro.getDano(), this, guerreiro.getClasse());
        appendToOutput("");
        appendToOutput(mago.getNome());
        mago.mostraPersonagem(mago.getNome(),mago.getVida(), mago.getDano(), this, mago.getClasse());
        appendToOutput("");
        appendToOutput(atirador.getNome());
        atirador.mostraPersonagem(atirador.getNome(),atirador.getVida(), atirador.getDano(), this, atirador.getClasse());
        appendToOutput("");
        appendToOutput(assassino.getNome());
        assassino.mostraPersonagem(assassino.getNome(),assassino.getVida(), assassino.getDano(), this, assassino.getClasse());
        appendToOutput("");
        appendToOutput(alquimista.getNome());
        alquimista.mostraPersonagem(alquimista.getNome(),alquimista.getVida(), alquimista.getDano(), this,alquimista.getClasse());
        appendToOutput("----------------------------------");

    }


    // Aqui é onde de fato o jogo está sendo executado, essa função verifica se a variavel nomePersonagem
    // está com o valor vazio,
    // se estiver ele roda o metodo escolherPersonagem(command) que depois que a varivel ha tiver um valor atribuido a ela,
    // ele vai chamar comprarItem(command), quando vc não quiser comprar mais nada em comprar item, ele vai atribuir
    // o valor true a variável mercado, fazendo assim com que a ultima parte do jogo começe e assim chamando o metodo missao.
    private void processCommand(String command) throws FinalException {
        if (!command.isEmpty()) {
            if (nomePersonagem.isEmpty()) {
                escolherPersonagem(command);
            } else {
                comprarItem(command);
                if(mercado == true){
                    missao(command);
                }
            }

        }
    }


    /// Aqui na escolherPersonagem(String escolha), ele paga o reusltado da sua escolha, e atribui o valores
    // dos getters e setters do seu personagem para essas novas variáveis, ficou melhor para
    // manipula-las durante a história
    private void escolherPersonagem(String escolha) {


        for (Jogavel personagem : campeoes) {
            if (Objects.equals(escolha, personagem.getNome())) {
                nomePersonagem = personagem.getNome();
                vidaPersonagem = (int) personagem.getVida();
                danoPersonagem = (int) personagem.getDano();
                ouro += 400;

                appendToOutput("");
                appendToOutput("Você escolheu " + nomePersonagem + "!");
                appendToOutput("Vida: " + vidaPersonagem);
                appendToOutput("Dano: " + danoPersonagem);
                appendToOutput("");
                break;
            }
        }

        if (nomePersonagem.isEmpty()) {
            appendToOutput("Personagem inválido, tente novamente!");
        } else {
            appendToOutput("Você acorda de manhã na sua casa com alguém batendo em sua porta!");
            appendToOutput("Era o rei da cidade te recrutando para uma tarefa!!");
            appendToOutput("Ele diz:  '" + nomePersonagem + " tem um " + demonio.getNome() + " a solta pelo mundo!'");
            appendToOutput("Ele diz que vai te pagar 1 BILHÃO de ouros se conseguir matar o monstro!");
            appendToOutput("");
            appendToOutput("");
            appendToOutput("Você aceita fazer isso!");
            appendToOutput("");
            appendToOutput("Definição da missão:");
            quest5.mostraMissao(quest5.getNome(), quest5.getTipo(),quest5.getDescricao(), this);
            appendToOutput("");
            appendToOutput("");

            appendToOutput("");
            appendToOutput("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            appendToOutput("Você parte de sua casa para completar a missão que foi lhe dada, mas antes disso você passa em um Atacadão!");
            appendToOutput(" que por coincidência estava localizado do lado da sua casa!");
            appendToOutput("");
            appendToOutput("* ATACADÃO *");
            appendToOutput("");
            appendToOutput("Poção de força      (+60 de dano)     ||   60 ouros");
            appendToOutput("Poção de vida       (+20 de vida)     ||   40 ouros");
            appendToOutput("Carne               (+7 de vida)      ||   10 ouros");
            appendToOutput("Petisco duvidoso    (??????????)      ||   De graça");
            appendToOutput("Band-aid            (+10 de vida)     ||   6  ouros");
            appendToOutput("Ervas Medicinais    (+14 de vida)     ||   15 ouros");
            appendToOutput("Espada              (+50 de dano)     ||   50 ouros");
            appendToOutput("Adaga               (+30 de dano)     ||   30 ouros");
            appendToOutput("Besta               (+60 de dano)     ||   60 ouros");
            appendToOutput("Chinelo da mãe      (+1000 de dano)   ||   100 ouros");
            appendToOutput("Peitoral            (+50 de vida)     ||   70 ouros");
            appendToOutput("Capacete            (+40 de vida)     ||   50 ouros");
            appendToOutput("Luvas               (+10 de vida)     ||   20 ouros");
            appendToOutput("Calças de Ferro     (+30 de vida)     ||   40 ouros");
            appendToOutput("Botas               (+20 de vida)     ||   29 ouros");
            appendToOutput("");
            appendToOutput("Digite o nome do item para compra-lo!");
            appendToOutput("Digite 'continuar' para ir completar a missão!");
            appendToOutput("Você tem " + ouro + " ouros!");
            appendToOutput("");

        }
    }

    // metodo mercado, nessa parte foi adaptada o codigo que ja tinhamos do mercado, so passei para a interface gráfica.
    private void comprarItem(String escolha) {
        if (Objects.equals(escolha, "Espada")) {
            if (ouro < 50) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {

                ouro -= 50;
                danoPersonagem += 50;
                espada.Espada(50, this);
                appendToOutput("Ouro atual: " + ouro);
                appendToOutput("Seu dano atual é de: " + danoPersonagem);
            }
        } else if (Objects.equals(escolha, "Poção de vida")) {
            if (ouro < 40) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 40;
                vidaPersonagem += 20;
                appendToOutput("Você comprou a poção de vida!! ouro: " + ouro);
                potion.PotDefesa(this, potion.getPotDefesa(), vidaPersonagem);
                appendToOutput("Sua vida atual é de: " + vidaPersonagem);
            }
        }else if (Objects.equals(escolha, "Poção de força")) {
            if (ouro < 60) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 60;
                danoPersonagem += 60;
                appendToOutput("Você comprou a poção de força!! ouro: " + ouro);
                potion.PotForca(this, potion.getPotForca(), danoPersonagem);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "Carne")) {
            if (ouro < 10) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 10;
                vidaPersonagem += 7;
                appendToOutput("Você comprou a carne!! ouro: " + ouro);
                curaveis.usarCarne(this, 7, vidaPersonagem);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "Band-aid")) {
            if (ouro < 6) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 6;
                vidaPersonagem += 10;
                appendToOutput("Você comprou um Band-aid!! ouro: " + ouro);
                curaveis.bandagens(this, 10, vidaPersonagem);
            }
        }else if (Objects.equals(escolha, "Ervas medicinais")) {
            if (ouro < 15) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 15;
                vidaPersonagem += 14;
                appendToOutput("Você comprou a poção de vida!! ouro: " + ouro);
                curaveis.ervasMedicinais(this, 14, vidaPersonagem);
            }
        }else if (Objects.equals(escolha, "Adaga")) {
            if (ouro < 30) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 30;
                danoPersonagem += 30;
                adaga.adagas(adaga.getDano(), this);
                appendToOutput("Ouro atual: " + ouro);
                appendToOutput("Seu dano atual é: " + danoPersonagem);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "Besta")) {
            if (ouro < 40) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 60;
                danoPersonagem += 60;
                besta.besta(60, this);
                appendToOutput("Seu dano atual é: " + danoPersonagem);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "Peitoral")) {
            if (ouro < 70) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 70;
                vidaPersonagem += 50;
                armadura.peitorais(vidaPersonagem, this);
                appendToOutput("Ouro restante: " + ouro);
                appendToOutput("");

            }
        }else if (Objects.equals(escolha, "Capacete")) {
            if (ouro < 50) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 50;
                vidaPersonagem += 40;
                armadura.capacete(vidaPersonagem, this);
                appendToOutput("Ouro restante: " + ouro);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "Luvas")) {
            if (ouro < 20) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 20;
                vidaPersonagem += 10;
                appendToOutput("Ouro restante: " + ouro);
                armadura.luvas(vidaPersonagem, this);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "Calças de Ferro") || Objects.equals(escolha, "calças de ferro")  ) {
            if (ouro < 40) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 40;
                vidaPersonagem += 30;
                armadura.calcas(vidaPersonagem, this);
                appendToOutput("Ouro restante: " + ouro);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "Botas")) {
            if (ouro < 29) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 29;
                vidaPersonagem += 20;
                armadura.botas(vidaPersonagem, this);
                appendToOutput("Ouro restante: " + ouro);
                appendToOutput("");
            }
        }else if (Objects.equals(escolha, "continuar")) {
            appendToOutput("");
            appendToOutput("Você continua sua missão!");
            appendToOutput("");
            mercado = true;
        }else if (Objects.equals(escolha, "Chinelo da mãe")) {
            if (ouro < 100) {
                appendToOutput("Você está pobre! Dinheiro insuficiente! ouro: " + ouro);
            } else {
                ouro -= 100;
                danoPersonagem += 1000;
                appendToOutput("Você comprou o Chinelo da mãe!! ouro: " + ouro);
                chineloDamae.chinelo_Da_Mae(1000, this);
            }
        }else if (Objects.equals(escolha, "Petisco duvidoso")) {
            vidaPersonagem -= 50;
            veneno.usarCarneEnvenenada(veneno.getVeneno(), vidaPersonagem, this);
        }else {
            appendToOutput("Produto ou comando inválido! Tente novamente!");
        }
    }

    // missao ocorre aqui com condições para ver se o usuario morreu ou não
    private void missao(String escolha) throws FinalException {
        boolean batalha1 = false;

        int vidaAtual = demonio.getVida();
        int novaVida;

        appendToOutput("");
        appendToOutput("Você foi até a floresta negra pra encontrar o mapa para a localização do demônio!");

        appendToOutput("-------------------------------------------------------------------------------------------");
        appendToOutput("Você começa pela casa de doces e encontra uma maça do amor!");
        appendToOutput("Você come a maça do amor e ganha 25 de vida");
        vidaPersonagem += 25;

        appendToOutput("-------------------------------------------------------------------------------------------");
        appendToOutput("Você vai para a caverna sombria!");
        appendToOutput("Um urso te ataca e você perde 10 de vida");
        vidaPersonagem -= 10;

        appendToOutput("-------------------------------------------------------------------------------------------");
        appendToOutput("Você escolheu ir para a vila abandonada");
        appendToOutput("Aparece um fantasma e te fala uma profecia");
        appendToOutput("Ele diz que se você não derrotar o demônio, o mundo irá acabar.");
        appendToOutput("O fantasma desaparece e deixa um mapa.");
        appendToOutput("Você encontrou o mapa para a localização do demônio.");

        appendToOutput("-------------------------------------------------------------------------------------------");
        appendToOutput("Você se aproxima do local e sente uma presença sombria");
        appendToOutput("-------------------------------------------------------------------------------------------");


        appendToOutput("");
        appendToOutput("Você foi até o topo do vulcão para derrotar o " + demonio.getNome() + "!");
        appendToOutput("Você entra no covil do " + demonio.getNome() + ", e encontra ele varrendo o chão!");
        appendToOutput(demonio.mostraPersonagem(demonio.getNome(), demonio.getVida(), demonio.getDano(), this, demonio.getClasse()));
        appendToOutput("");
        appendToOutput("Vocês dois começam a brigar!");
        appendToOutput(nomePersonagem + " x " + demonio.getNome());
        appendToOutput("");
        while (batalha1 == false) {
            appendToOutput("Você ataca o " + demonio.getNome());
            appendToOutput("Você causa " + danoPersonagem + " de dano no " + demonio.getNome());
            novaVida = vidaAtual - danoPersonagem;
            demonio.setVida(novaVida);
            vidaAtual = demonio.getVida();
            appendToOutput("Vida do Demo: " + demonio.getVida());
            appendToOutput("");

            if (demonio.getVida() <= 0 || vidaAtual <= 0) {
                try {
                    throw new FinalException();
                } catch (FinalException e) {
                    try (BufferedReader br = new BufferedReader(new FileReader("PJBL_RPG/Finalizado/src/final.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            appendToOutput(line);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                appendToOutput("");
                batalha1 = true;
                inputField.setEnabled(false);

            }else{

                appendToOutput("");
                demonio.Atacar(demonio.getNome(), demonio.getDano(), this);
                vidaPersonagem -= demonio.getDano();
                appendToOutput("Sua vida agora é " + vidaPersonagem);
                appendToOutput("");
                if (vidaPersonagem <= 0) {
                    appendToOutput("Você morreu!");
                    appendToOutput("GAME OVER!");
                    batalha1 = true;
                    inputField.setEnabled(false);
                }
            }
        }
    }

    private void appendToOutput(String text) {
        outputArea.append(text + "\n");
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jogo::new);
    }
}
