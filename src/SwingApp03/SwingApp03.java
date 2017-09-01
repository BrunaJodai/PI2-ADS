package SwingApp03;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class SwingApp03 {

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
        frame.getContentPane().add(panel);
        final JRadioButton radio01 = new JRadioButton("Opção 01");
        panel.add(radio01);
        final JRadioButton radio02 = new JRadioButton("Opção 02");
        panel.add(radio02);

        ButtonGroup group = new ButtonGroup();
        group.add(radio01);
        group.add(radio02);

        JButton button = new JButton("Botão 01");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Opção 01: " + radio01.isSelected()
                        + "\nOpção 02: " + radio02.isSelected());
            }
        });

        String[] opcoesCombo = {"Selecione", "Opção 01",
            "Opção 02", "Opção 03", "Opção 04"};
        JComboBox comboBox = new JComboBox(opcoesCombo);
        panel.add(comboBox);

        frame.pack();
        frame.setVisible(true);
    }
}
