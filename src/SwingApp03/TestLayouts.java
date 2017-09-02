package SwingApp03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestLayouts {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing App 03");
        
        /* BORDER LAYOUT
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.getContentPane().add(panel);
        
        JButton button01 = new JButton("Botão 01");
        panel.add(button01, BorderLayout.NORTH);
        JButton button02 = new JButton("Botão 02");
        panel.add(button02, BorderLayout.SOUTH);
        JButton button03 = new JButton("Botão 03");
        panel.add(button03, BorderLayout.EAST);*/
        
        JPanel panel = new JPanel();
        // FLOW LAYOUT
        //panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        /*GRID LAYOUT: cria layout com linhas e colunas. Ex: 2 linhas e 
        qntd de colunas necessárias (pra isso, sempre tem que ter um 0,
        0 significa infinito)*/
        panel.setLayout(new GridLayout(2,0));
        frame.getContentPane().add(panel);
        
        JButton button01 = new JButton("Botão 01");
        panel.add(button01);
        JButton button02 = new JButton("Botão 02");
        panel.add(button02);
        JButton button03 = new JButton("Botão 03");
        panel.add(button03);
        
        frame.pack();
        frame.setVisible(true);
    }
}
