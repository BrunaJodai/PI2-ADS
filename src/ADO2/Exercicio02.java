/* 2.Elabore um programa Java Desktop onde o usuário possa tentar adivinhar um 
número com um limite de tentativas. Se o limite for excedido, o programa é encerrado 
(utilize o comando System.exit(0) para finalizar a aplicação). O número pode ser 
fixo ou aleatório; */
package ADO2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
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
public class Exercicio02 {

    static int i = 6;

    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    static int randomNum() {
        Random sort = new Random();
        int num = sort.nextInt(11);
        System.out.println("num sorteado " + num);

        return num;
    }

    static void criarGUI() {
        int num = randomNum();

        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.setMinimumSize(new Dimension(300, 100));
        frame.setTitle("ADIVINHA 0 a 10!");
        frame.getContentPane().add(panel);

        JLabel labelNum = new JLabel("Número: ");
        panel.add(labelNum);
        JTextField textNum = new JTextField(3);
        panel.add(textNum);

        JButton buttonVerif = new JButton("OK");
        buttonVerif.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i--;

                if (i == 0) {
                    JOptionPane.showMessageDialog(frame,
                            "ACABARAM AS TENTATIVAS!\n"
                            + "ERA O NÚMERO " + num);
                    System.exit(0);
                } else {
                    //converte p/ int
                    int chute = Integer.parseInt(textNum.getText());
                    if (num == chute) {
                        JOptionPane.showMessageDialog(frame,
                                "ACERTOU O NÚMERO " + num);
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "ERROU!\n"
                                + "Tentativas restantes: " + i);
                    }
                }

            }
        });
        panel.add(buttonVerif);

        frame.pack();
        frame.setVisible(true);

    }
}
