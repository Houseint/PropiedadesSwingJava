
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex5 {
    public static void main(String[] args) {

        JFrame janelaP = new JFrame("Escolher Genero");
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setSize(300, 200);
        janelaP.setLocationRelativeTo(null);


    JPanel painel = new JPanel();
    painel.setLayout(new GridLayout(0, 1, 5, 5));


    JRadioButton masculino = new JRadioButton("Masculino");
    JRadioButton feminino = new JRadioButton("Feminino");
    JRadioButton outro = new JRadioButton("Outro");


    ButtonGroup grupo = new ButtonGroup();
    grupo.add(masculino);
    grupo.add(feminino);
    grupo.add(outro);


    painel.add(masculino);
    painel.add(feminino);
    painel.add(outro);


    JButton botao = new JButton("Mostrar Seleção");

    JLabel resultado = new JLabel("Selecione uma opção");


botao.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (masculino.isSelected()) {
        resultado.setText("Selecionado: Masculino");
            } else if (feminino.isSelected()) {
            resultado.setText("Selecionado: Feminino");
            } else if (outro.isSelected()) {
            resultado.setText("Selecionado: Outro");
        } else {
        resultado.setText("Nenhuma opção selecionada");
        }
    }
});


painel.add(botao);
painel.add(resultado);


janelaP.add(painel);
janelaP.setVisible(true);
}
}