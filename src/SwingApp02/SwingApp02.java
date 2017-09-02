package SwingApp02;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingApp02 {

    public static void main(String[] args) {
        //runnable é uma interface, por isso não é possível instanciar
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };

        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {
        JFrame frame = new JFrame();

        //tamanho: pixel
        frame.setMinimumSize(new Dimension(300, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing App 02");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel label = new JLabel("Teste");
        //adiciona JLabel no Jframe
        //frame.getContentPane().add(label);
        panel.add(label);

        final JTextField field = new JTextField(9);
        panel.add(field);

        /*JButton button = new JButton("Botão");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Valor digitado: " + field.getText());
            }
        });

        panel.add(button);*/
        final JCheckBox checkBox01 = new JCheckBox("Item 01");
        panel.add(checkBox01);

        final JCheckBox checkBox02 = new JCheckBox("Item 02");
        panel.add(checkBox02);

        final JRadioButton radio01 = new JRadioButton("Opção 01");
        panel.add(radio01);

        final JRadioButton radio02 = new JRadioButton("Opção 02");
        panel.add(radio02);

        ButtonGroup group = new ButtonGroup();
        group.add(radio01);
        group.add(radio02);

        JButton button2 = new JButton("Botão 02");
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Item 01 selecionado: "
                        + checkBox01.isSelected() + "\nItem 02 selecionado: "
                        + checkBox02.isSelected() + "\nOpção 01: "
                        + radio01.isSelected() + "\nOpção 02: "
                        + radio02.isSelected());
            }
        });

        /*ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(frame, "SELECIONADO");
                }
            }
        };
        
        
        checkBox01.addItemListener(itemListener);*/
        //pack serve para caso o tamanho da janela não comporte os componentes, redimensiona
        //pack e setVisible precisam ficar em último
        frame.pack();
        frame.setVisible(true);
    }

}
