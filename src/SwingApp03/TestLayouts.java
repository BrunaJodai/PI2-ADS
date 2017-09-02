package SwingApp03;

import static SwingApp03.SwingApp03.criarGUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.getContentPane().add(panel);
        
        JButton button01 = new JButton("Botão 01");
        panel.add(button01, BorderLayout.NORTH);
        JButton button02 = new JButton("Botão 02");
        panel.add(button02, BorderLayout.SOUTH);
        JButton button03 = new JButton("Botão 03");
        panel.add(button03, BorderLayout.EAST);
        
        frame.pack();
        frame.setVisible(true);
    }
}
