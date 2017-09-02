package LayoutExamplesProf;

import java.awt.Dimension;
import javax.swing.GroupLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GroupLayoutExample {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }
    
    public static void criarGUI() {
        // Cria a janela
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 600));

        // Cria novos botões
        JButton botao01 = new JButton("1");
        JButton botao02 = new JButton("2");
        JButton botao03 = new JButton("3");
        JButton botao04 = new JButton("4");

        // Cria o painel para armazenar os botões
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setSize(300, 300);
        
        //Cria e configura o layout
        GroupLayout layout = new GroupLayout(panel);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        panel.setLayout(layout);

        // Configura o posicionamento do layout
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(botao01).addComponent(botao02)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(botao03).addComponent(botao04))));
        layout.setVerticalGroup(
                layout.createSequentialGroup().addComponent(botao01).addComponent(botao02).addComponent(botao03).addComponent(botao04));
        
        // Faz o frame ficar visível        
        frame.pack();
        frame.setVisible(true);
    }
}