/*3.Faça um programa Java Desktop que calcule a média entre três valores 
e exiba o resultado;*/
package ADO2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * @author Bruna Sayuri
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    static void criarGUI() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.setTitle("MÉDIA DE 3 VALORES");
        frame.getContentPane().add(panel);

        JLabel label1 = new JLabel("1° valor: ");
        panel.add(label1);
        JTextField text1 = new JTextField(5);
        panel.add(text1);

        JLabel label2 = new JLabel("2° valor: ");
        panel.add(label2);
        JTextField text2 = new JTextField(5);
        panel.add(text2);

        JLabel label3 = new JLabel("3° valor: ");
        panel.add(label3);
        JTextField text3 = new JTextField(5);
        panel.add(text3);

        JButton buttonMedia = new JButton("Média");
        buttonMedia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //pega os dados digitados e converte p/ double
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                double n3 = Double.parseDouble(text3.getText());
                JOptionPane.showMessageDialog(frame,
                        "Média: " + ((n1 + n2 + n3) / 3));
            }

        });
        panel.add(buttonMedia);

        frame.pack();
        frame.setVisible(true);
    }
}
