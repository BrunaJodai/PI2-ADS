package LayoutExamplesProf;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.SwingUtilities;

public class BorderLayoutExample {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }
    
    public static void criarGUI() {
        // Cria e configura um frame
        JFrame frame = new JFrame("Layout");
        frame.setMinimumSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define botões em diferentes regiões
        JButton jb1 = new JButton("NORTH");
        JButton jb2 = new JButton("SOUTH");
        JButton jb3 = new JButton("WEST");
        JButton jb4 = new JButton("EAST");
        JButton jb5 = new JButton("CENTER");

        // Define um painel para posicionar os botões
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        // Faz o posicionamento dos botões com o método add
        panel.setLayout(new BorderLayout());
        panel.add(jb1, BorderLayout.NORTH);
        panel.add(jb2, BorderLayout.SOUTH);
        panel.add(jb3, BorderLayout.WEST);
        panel.add(jb4, BorderLayout.EAST);
        panel.add(jb5, BorderLayout.CENTER);

        // Faz a janela ficar visivel        
        frame.pack();
        frame.setVisible(true);
    }
}
