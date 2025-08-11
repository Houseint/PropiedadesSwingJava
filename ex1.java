import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;

public class ex1 {
    public static void main(String[] args) {
            JFrame janelaP = new JFrame("Janela Principal");
            janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janelaP.setSize(400,300);
            janelaP.setLocationRelativeTo(null);

            JPanel painel = new JPanel();

            painel.setBackground(Color.GREEN);

            Border borda = BorderFactory.createTitledBorder("Painel de controle");
            painel.setBorder(borda);

            JButton botao = new JButton("Clique aqui");
            botao.setBackground(Color.YELLOW);

            janelaP.add(painel);
            painel.add(botao);
            janelaP.setVisible(true);

    }
}