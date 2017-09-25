/*4.Construa um programa Java Desktop que permita o registro da coleção de jogos 
do usuário. O programa deverá permitir que o usuário digite o nome de cada jogo 
e exibir a lista de jogos cadastrados sempre que o usuário desejar (utilize 
botões separados para cadastro e exibição de itens cadastrados);*/
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
public class Exercicio04 {

    static String[] jogos = new String[20];

    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    static void populaJogos(String jogo) {
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = jogo;
                JOptionPane.showMessageDialog(null, "JOGO CADASTRADO COM SUCESSO");
                break;
            }
        }
    }

    static void imprimeJogos() {
        //string para concatenar os nomes e exibir numa pane só
        String tdsJogos="";
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                tdsJogos += jogos[i] + "\n";                
            } else {
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "LISTA DE JOGOS:\n" + tdsJogos);
    }

    static void criarGUI() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.setTitle("COLEÇÃO DE JOGOS");
        frame.getContentPane().add(panel);

        JLabel labJogo = new JLabel("Jogo ");
        panel.add(labJogo);
        JTextField txtJogo = new JTextField(20);
        panel.add(txtJogo);

        JButton btCadastro = new JButton("Cadastrar");
        btCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                populaJogos(txtJogo.getText());
            }

        });
        panel.add(btCadastro);

        JButton btExibir = new JButton("Exibir lista");
        btExibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imprimeJogos();
            }

        });
        panel.add(btExibir);

        frame.pack();
        frame.setVisible(true);
    }
}
