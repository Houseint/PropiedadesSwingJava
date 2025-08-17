import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.awt.GridLayout;
import javax.swing.*;

public class ex4 {
    public static void main(String[] args) {
        JFrame janelaP = new JFrame("Janela Principal");
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setSize(400, 300);
        janelaP.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2, 1, 5, 5));

        JLabel label = new JLabel("Data de Nascimento:");
        painel.add(label);

        try {
            MaskFormatter formatter = new MaskFormatter("##/##/####"); // aqui eu defini a máscara para data
            formatter.setPlaceholderCharacter('_');// aqui eu defini que o '_' vai aparecer quando algum caracter estiver vazio
            JFormattedTextField campoData = new JFormattedTextField(formatter);//criei o campo de texto formatado com a mascara
            campoData.setColumns(10);//o campo de texto vai ter 10 colunas
            painel.add(campoData);
        }
            catch (ParseException e) {
                e.printStackTrace();//caso alguma coisa de errado, vai aparecer o erro no console
            }

        janelaP.add(painel);
        janelaP.setVisible(true);
    }
}