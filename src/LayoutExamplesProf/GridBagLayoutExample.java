package LayoutExamplesProf;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GridBagLayoutExample {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }
    
    public static void criarGUI() {
        // Cria e configura a janela        
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 600));

        // Define um painel para armazenar os componentes
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        //Cria o layout e um elemento de configuração do layout (necessário)
        GridBagLayout layout = new GridBagLayout();        
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        // Configura o layout em diferentes locais
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;        
        // Adiciona o botão ao painel com a configuração de layout
        panel.add(new JButton("Button1"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;        
        panel.add(new JButton("Button 2"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridwidth = 2;
        panel.add(new JButton("Button 3"), gbc);

        // Faz a janela ficar visível        
        frame.pack();
        frame.setVisible(true);
    }
}
