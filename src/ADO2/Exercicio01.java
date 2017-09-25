/*1.Escreva um programa Java para Desktop que permita o cadastro de dados de um 
usuário (campos nome, endereço e telefone) na memória. Exiba o resultado do cadastro 
numa caixa de diálogo (utilize dois botões, um para salvar os dados, um para exibir
os dados salvos);*/
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
public class Exercicio01 {

    public static void main(String[] args) {
        //vetor para salvar os dados do usuario
        String[] dadosUsuario = new String[3];

        Runnable thread = new Runnable() {
            public void run() {
                criarGUI(dadosUsuario);
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    static void criarGUI(String[] dadosUsuario) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.setTitle("CADASTRO DE DADOS");
        frame.getContentPane().add(panel);

        // "organizado" por campos, nas seguinte ordem: JLabel - JTextField        
        JLabel labelNome = new JLabel("Nome: ");
        panel.add(labelNome);
        final JTextField textNome = new JTextField(15);
        panel.add(textNome);

        JLabel labelEnd = new JLabel("Endereço: ");
        panel.add(labelEnd);
        final JTextField textEnd = new JTextField(20);
        panel.add(textEnd);

        JLabel labelTel = new JLabel("Telefone: ");
        panel.add(labelTel);
        final JTextField textTel = new JTextField(10);
        panel.add(textTel);

        JButton buttonSalvar = new JButton("Salvar");
        buttonSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dadosUsuario[0] = textNome.getText();
                dadosUsuario[1] = textEnd.getText();
                dadosUsuario[2] = textTel.getText();

                JOptionPane.showMessageDialog(frame,
                        "DADOS SALVOS COM SUCESSO");
            }
        });
        panel.add(buttonSalvar);

        //caso o usuário não tenha salvo os dados, aparecerá somente null
        JButton buttonExibir = new JButton("Exibir dados");
        buttonExibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "DADOS SALVOS\n"
                        + dadosUsuario[0] + "\n"
                        + dadosUsuario[1] + "\n"
                        + dadosUsuario[2]);
                /*JOptionPane.showMessageDialog(frame,
                        "DADOS INFORMADOS\n"
                        + textNome.getText() + "\n"
                        + textEnd.getText() + "\n"
                        + textTel.getText());*/
            }
        });
        panel.add(buttonExibir);

        frame.pack();
        frame.setVisible(true);

    }
}
