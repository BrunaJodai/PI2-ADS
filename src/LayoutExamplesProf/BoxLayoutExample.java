package LayoutExamplesProf;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BoxLayoutExample {

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

        // Define botões
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");
        JButton jb4 = new JButton("Button 4");

        // Define um painel para armazenar os botões
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        // Configura um layout organizado na vertical
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(jb4);

        // Faz a janela ficar visível        
        frame.pack();
        frame.setVisible(true);
    }
}
