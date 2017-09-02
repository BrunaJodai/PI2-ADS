package LayoutExamplesProf;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class CardLayoutExample {

    // Armazena os elementos da interface
    public static CardLayout card = new CardLayout(40, 30);
    public static Container container;
    private static JButton botao01, botao02, botao03;

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
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        container = frame.getContentPane();
        container.setLayout(card);

        // Define novos botões
        botao01 = new JButton("Button 1");
        botao02 = new JButton("Button 2");
        botao03 = new JButton("Button 3");        
        container.add(botao01);
        container.add(botao02);
        container.add(botao03);
        
        //Configura um listener para troca do cartão corrente
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(container);
            }
            
        };

        botao01.addActionListener(listener);
        botao02.addActionListener(listener);
        botao03.addActionListener(listener);
    
        frame.setVisible(true);
    }
}
