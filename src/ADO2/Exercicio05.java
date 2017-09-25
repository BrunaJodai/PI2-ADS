/*5.Construa um programa Java Desktop que permita realizar operações matemáticas 
(soma, subtração, multiplicação e divisão) entre dois números e exibir o 
resultado na tela. */
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
public class Exercicio05 {

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
        frame.setTitle("OPERAÇÕES MATEMÁTICAS");
        frame.getContentPane().add(panel);

        JLabel label1 = new JLabel("1° num: ");
        panel.add(label1);
        JTextField text1 = new JTextField(5);
        panel.add(text1);

        JLabel label2 = new JLabel("2° num: ");
        panel.add(label2);
        JTextField text2 = new JTextField(5);
        panel.add(text2);

        JLabel ope = new JLabel("Oper. Aritmética: ");
        panel.add(ope);

        JButton btSoma = new JButton(" + ");
        btSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                JOptionPane.showMessageDialog(frame,
                        "RESULTADO: \n"
                        + n1 + " + " + n2 + " = " + (n1 + n2));
            }
        });
        panel.add(btSoma);

        JButton btSub = new JButton(" - ");
        btSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                JOptionPane.showMessageDialog(frame,
                        "RESULTADO: \n"
                        + n1 + " - " + n2 + " = " + (n1 - n2));
            }
        });
        panel.add(btSub);

        JButton btMult = new JButton(" * ");
        btMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                JOptionPane.showMessageDialog(frame,
                        "RESULTADO: \n"
                        + n1 + " * " + n2 + " = " + (n1 * n2));
            }
        });
        panel.add(btMult);

        JButton btDiv = new JButton(" / ");
        btDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(text1.getText());
                double n2 = Double.parseDouble(text2.getText());
                JOptionPane.showMessageDialog(frame,
                        "RESULTADO: \n"
                        + n1 + " / " + n2 + " = " + (n1 / n2));
            }
        });
        panel.add(btDiv);

        frame.pack();
        frame.setVisible(true);
    }
}
