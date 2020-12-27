package saida;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JPanel;

import dados.Grupo;
import dao.PessoaDAO;
import ordenacao.OrdenacaoID;

import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class TelaListagem extends JPanel {
	private JLabel lblListar = new JLabel("LISTAR USUÁRIOS");
	private JLabel lblListarP = new JLabel("Para listar todos os usuários aperte o botão");
	private JLabel lblListaVazia = new JLabel("Não existem usuários cadastrados!");
	private Button btnListar = new Button("Listar");
	private Tabela tabela;
	private Grupo grupo;

	public TelaListagem() {
		setBackground(SystemColor.menu);
		setBounds(0, 0, 650, 650);
		setLayout(null);

		grupo = new Grupo();

		lblListar.setFont(new Font("Roboto Cn", Font.PLAIN, 50));
		lblListar.setForeground(new Color(153, 0, 204));
		lblListar.setBounds(192, 11, 370, 50);
		add(lblListar);

		lblListarP.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblListarP.setBounds(47, 81, 464, 30);
		add(lblListarP);

		lblListaVazia.setVisible(false);
		lblListaVazia.setForeground(Color.RED);
		lblListaVazia.setFont(new Font("Roboto Cn", Font.PLAIN, 18));
		lblListaVazia.setBounds(47, 122, 267, 31);
		add(lblListaVazia);

		JLabel lblTotalCadastros = new JLabel("Total de Cadastros: " + grupo.getGrupo().size());
		lblTotalCadastros.setBounds(334, 122, 177, 31);
		lblTotalCadastros.setForeground(new Color(153, 0, 204));
		lblTotalCadastros.setFont(new Font("Roboto Cn", Font.PLAIN, 18));
		add(lblTotalCadastros);

		JPanel panelListar = new JPanel();
		panelListar.setVisible(false);
		panelListar.setBounds(10, 164, 750, 475);
		add(panelListar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBackground(new Color(167, 135, 255));
		scrollPane.setBounds(10, 164, 1000, 800);
		panelListar.add(scrollPane);

		tabela = new Tabela();
		tabela.setBounds(0, 36, 1000, 434);
		tabela.setBackground(new Color(153, 0, 204));
		tabela.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		tabela.setForeground(new Color(255, 255, 255));
		tabela.setRowHeight(25);
		tabela.getColumnModel().getColumn(0).setMinWidth(30);
		tabela.getColumnModel().getColumn(1).setMinWidth(100);
		tabela.getColumnModel().getColumn(2).setMinWidth(200);
		tabela.getColumnModel().getColumn(3).setMinWidth(40);
		tabela.getColumnModel().getColumn(4).setMinWidth(80);

		scrollPane.setViewportView(tabela);

		btnListar.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		btnListar.setForeground(new Color(255, 255, 255));
		btnListar.setBackground(new Color(153, 0, 204));
		btnListar.setBounds(537, 81, 146, 57);
		btnListar.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				btnListar.setBackground(new Color(51, 0, 51));
			}

			public void mousePressed(MouseEvent e) {
				btnListar.setBackground(new Color(92, 92, 92));
			}

			public void mouseExited(MouseEvent e) {
				btnListar.setBackground(new Color(153, 0, 204));
			}

			public void mouseEntered(MouseEvent e) {
				btnListar.setBackground(new Color(51, 0, 51));
			}

			public void mouseClicked(MouseEvent e) {
				PessoaDAO pessoaDAO = new PessoaDAO();

				grupo.setGrupo(pessoaDAO.listar());
				OrdenacaoID ordemID = new OrdenacaoID();
				Collections.sort(grupo.getGrupo(), ordemID);

				if (grupo.getGrupo().size() == 0) {
					lblTotalCadastros.setText("Total de Cadastros: " + grupo.getGrupo().size());
					lblListaVazia.setVisible(true);
					panelListar.setVisible(false);
				} else {
					tabela.preencher(grupo.getGrupo());
					lblTotalCadastros.setText("Total de Cadastros: " + grupo.getGrupo().size());
					lblListaVazia.setVisible(false);
					panelListar.setVisible(true);
				}
			}
		});
		add(btnListar);

	}
}
