import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class ex7 {
    public static void main(String[] args){
        JFrame janelaP= new JFrame("Exercício 7");
        janelaP.setSize(350,200);
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Argentina");
        comboBox.addItem("Brasil");
        comboBox.addItem("Chile");


        comboBox.addItemListener(e -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                    String itemSelecionado = (String) e.getItem();
                    System.out.println("Foi selecionado "+itemSelecionado);
            }
        });

        janelaP.add(painel);
        janelaP.add(comboBox);



        janelaP.setVisible(true);
    }
}
