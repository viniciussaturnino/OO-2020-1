package saida;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import dados.Homem;
import dados.Mulher;
import dados.Pessoa;
import dao.PessoaDAO;
import validacao.Validacao;

@SuppressWarnings("serial")
public class TelaMostrar extends JPanel {
	private JTextField txtMostrar;
	private JLabel lblMostrar = new JLabel("MOSTRAR");
	private JLabel lblPerguntaID = new JLabel("Digite o ID da pessoa");
	private JLabel lblSearchIcon = new JLabel("");
	private Button btnMostrar = new Button("Mostrar");

	public TelaMostrar() {
		setBackground(SystemColor.menu);
		setBounds(0, 0, 650, 650);
		setLayout(null);

		lblMostrar.setFont(new Font("Roboto Cn", Font.PLAIN, 50));
		lblMostrar.setForeground(new Color(153, 0, 204));
		lblMostrar.setBounds(285, 110, 203, 50);
		add(lblMostrar);

		lblPerguntaID.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblPerguntaID.setBounds(277, 181, 217, 30);
		add(lblPerguntaID);

		txtMostrar = new JTextField();
		txtMostrar.setBounds(277, 222, 217, 30);
		txtMostrar.setBorder(new LineBorder(new Color(153, 0, 204), 1));
		add(txtMostrar);
		txtMostrar.setColumns(10);

		lblSearchIcon.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/search_purple.png")));
		lblSearchIcon.setBounds(504, 222, 24, 30);
		add(lblSearchIcon);

		btnMostrar.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		btnMostrar.setForeground(new Color(255, 255, 255));
		btnMostrar.setBackground(new Color(153, 0, 204));
		btnMostrar.setBounds(315, 270, 146, 39);
		btnMostrar.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				btnMostrar.setBackground(new Color(51, 0, 51));
			}

			public void mousePressed(MouseEvent e) {
				btnMostrar.setBackground(new Color(92, 92, 92));
			}

			public void mouseExited(MouseEvent e) {
				btnMostrar.setBackground(new Color(153, 0, 204));
			}

			public void mouseEntered(MouseEvent e) {
				btnMostrar.setBackground(new Color(51, 0, 51));
			}

			public void mouseClicked(MouseEvent e) {
				PessoaDAO pessoaDAO = new PessoaDAO();
				int id = Integer.parseInt(txtMostrar.getText());
				if (Validacao.validaID(txtMostrar.getText())) {
					Pessoa pessoa = pessoaDAO.buscaID(id);
					String mensagem = "";
					try {
						if (pessoa != null)
							mensagem = ("ID: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome() + "\nSaude: "
									+ pessoa.getSituacaoSaude() + "\nIdade: " + ((Homem) pessoa).getIdade());
					} catch (ClassCastException ex) {
						if (pessoa != null)
							mensagem = ("ID: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome() + "\nSaude: "
									+ pessoa.getSituacaoSaude() + "\nGestante: "
									+ ((Mulher) pessoa).getSituacaoGestante());
					}
					if (pessoa != null)
						JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.CLOSED_OPTION);
					else
						JOptionPane.showMessageDialog(null, "Pessoa nao encontrada", "Resultado",
								JOptionPane.CLOSED_OPTION);
				}
			}
		});
		add(btnMostrar);
	}

}
