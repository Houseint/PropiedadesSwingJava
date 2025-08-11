import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ex2 {
    public static void main(String[] args) {
            JFrame janelaP = new JFrame("Aba Principal");
            janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janelaP.setSize(400,300);
            janelaP.setLocationRelativeTo(null);

            JTabbedPane Abas= new JTabbedPane();

            JPanel aba1= new JPanel();
            aba1.add(new JLabel("Bem-vindos às Configurações"));
            Abas.addTab("Configurações", aba1);

            JPanel aba2= new JPanel();
            aba2.add(new JTextField("Digite seu nome aqui", 10));
            aba2.setBackground(Color.BLUE);
            Icon icone1=UIManager.getIcon("OptionPane.informationIcon");
            Abas.addTab("Perfil",icone1,aba2);

            JPanel aba3= new JPanel();
            JTextArea areaTexto = new JTextArea("Digite suas dúvidas aqui.", 5, 20);
            areaTexto.setLineWrap(true);
            areaTexto.setWrapStyleWord(true);//esse componente quebra a linha por palavra, nao por letra
            areaTexto.setPreferredSize(new Dimension(5,20));
            aba3.add(areaTexto);
            Abas.addTab("Ajuda", aba3);

            janelaP.add(Abas);
            janelaP.setVisible(true);
    }
}
