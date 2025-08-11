import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ex3 {
    public static void main(String[] args) {
        JFrame janelaP = new JFrame("Janela Principal");
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setSize(400, 300);
        janelaP.setLocationRelativeTo(null);

        JScrollPane scrollPane = new JScrollPane();

        JTextArea areaTexto = new JTextArea("",10,30);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBackground(Color.LIGHT_GRAY);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 12));
        scrollPane.setViewportView(areaTexto);
    }
}
