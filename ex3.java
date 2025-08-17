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



        JTextArea areaTexto = new JTextArea("",10,30);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBackground(Color.LIGHT_GRAY);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 12));
        areaTexto.setText("Java Swing é uma biblioteca poderosa para criar interfaces gráficas em Java. \"\n" +
                "    + \"Ela permite o desenvolvimento de aplicações interativas com diversos componentes visuais, \"\n" +
                "    + \"como botões, caixas de texto, tabelas e painéis. O JTextArea é útil para exibir e editar textos longos, \"\n" +
                "    + \"enquanto o JScrollPane garante que o usuário possa navegar pelo conteúdo quando ele excede o espaço disponível. \"\n" +
                "    + \"Além disso, Swing oferece flexibilidade na personalização de cores, fontes e layouts, tornando possível criar \"\n" +
                "    + \"aplicações visualmente atraentes e funcionais. Com o uso correto desses componentes, é possível construir sistemas \"\n" +
                "    + \"robustos e amigáveis, facilitando a interação entre o usuário e o software. A integração de JScrollPane e JTextArea \"\n" +
                "    + \"é especialmente útil em situações onde o texto pode crescer indefinidamente, como em editores de código, campos de \"\n" +
                "    + \"comentários ou áreas de log. Dessa forma, o desenvolvedor garante uma experiência de uso confortável e eficiente. \n"+
                "enchecao de linguiça teste 1234567890");//pro scroll aparecer.
        //texto inteiramente gerado por IA.

        JScrollPane funcaoscroll = new JScrollPane(areaTexto);
        janelaP.add(funcaoscroll);
        janelaP.setVisible(true);

        //o scrollpane é importante pq quando o texto é muito grande,
        // ele vai passar da area visivel do textarea,
        // ai o scrollpane vai permitir voce scrollar e ver o resto do texto.
    }
}
