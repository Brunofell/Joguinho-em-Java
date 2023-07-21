import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class Menu extends JFrame {
    Font PressStart2P=null;

    public Menu() {

        // Configurações básicas da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        // Define o tamanho da tela
        int largura = 800;
        int altura = 600;
        setSize(largura, altura);
        Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dimensaoTela.width - largura) / 2, (dimensaoTela.height - altura) / 2);

        // Define um layout para o painel inicial
        JPanel painelMenuInicial = new JPanel();
        painelMenuInicial.setLayout(new BoxLayout(painelMenuInicial, BoxLayout.Y_AXIS));


        // Cria um painel para o título
        JPanel painelTitulo = new JPanel();
        JLabel labelTitulo = new JLabel("JOGO POO"); // definindo a fonte
        try{
            PressStart2P = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("font/PressStart2P-Regular.ttf")));
        }
        catch(IOException | FontFormatException e){
            System.out.println(" " + e);
        }
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(PressStart2P);
        this.setFont(PressStart2P);
        labelTitulo.setFont(new Font("Press Start 2P", Font.PLAIN, 70)); // aqui eu to controlando o tamanho, cor e fonte das letras do titulo
        labelTitulo.setForeground(Color.GREEN);
        painelTitulo.add(labelTitulo);

        // Adiciona um espaçador vertical entre o título e o botão
        painelMenuInicial.add(Box.createVerticalStrut(50));

        // Cria um painel para o botão
        JPanel painelBotao = new JPanel();
        JButton botaoContinuar = new JButton("Continuar");
        painelBotao.add(botaoContinuar);
        // Define a aparência do botão
        botaoContinuar.setPreferredSize(new Dimension(200, 50)); // Define o tamanho do botão
        botaoContinuar.setFont(new Font("Press Start 2P", Font.BOLD, 16)); // Define a fonte do texto
        botaoContinuar.setBackground(new Color(34, 139, 34)); // Define a cor de fundo do botão (verde)
        botaoContinuar.setForeground(Color.WHITE); // Define a cor do texto do botão (branco)
        botaoContinuar.setFocusPainted(false); // Remove a borda de foco do botão
        botaoContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual (Menu)
                new Jogo(); // Abre a janela do jogo
            }
        });




        // Adiciona os painéis ao painel principal
        painelMenuInicial.add(painelTitulo);
        painelMenuInicial.add(painelBotao);

        // Adiciona um espaçador vertical abaixo do botão
        painelMenuInicial.add(Box.createVerticalStrut(70));

        // Adiciona o painel principal à tela
        add(painelMenuInicial);

        // Exibe a tela
        setVisible(true);




    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Menu());
    }
}
