package SwingApp01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class main {

    public static void main(String[] args) {
        Runnable h = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        
        SwingUtilities.invokeLater(h);
    }

    public static void criarGUI() {
        //nova instância de um JFrame
        JFrame frame = new JFrame();
        //definindo a operação principal de fechamento do JFrame (ou seja, qndo clicar em fechar, encerra)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Olá, mundo!");
        frame.getContentPane().add(label);

        //exibir a janela
        frame.pack();
        frame.setVisible(true);
    }
}
