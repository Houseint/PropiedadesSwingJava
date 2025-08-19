import javax.swing.*;
import java.awt.*;

public class ex6 {
    public static void main(String[] args) {
        JFrame janelaP = new JFrame("Exercicio 6");
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setSize(400, 500);
        janelaP.setLocationRelativeTo(null);

        JPanel painelEsq = new JPanel();
        painelEsq.setBackground(Color.RED);
        painelEsq.add(new JLabel("Esquerda"));

        JPanel painelDir = new JPanel();
        painelDir.setBackground(Color.BLUE);
        painelDir.add(new JLabel("Direita"));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelEsq, painelDir);
        splitPane.setDividerLocation(200);
        splitPane.setDividerSize(10);

        janelaP.add(splitPane);
        janelaP.setVisible(true);
    }
    }

