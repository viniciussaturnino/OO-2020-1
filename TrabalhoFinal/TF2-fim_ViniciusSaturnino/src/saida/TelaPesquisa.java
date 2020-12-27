package saida;

import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import dados.Grupo;
import dao.PessoaDAO;
import ordenacao.OrdenacaoNome;
//import validacao.Validacao;

import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class TelaPesquisa extends JPanel {
	private JTextField txtNomePesquisa;
	private JLabel lblPesquisa = new JLabel("PESQUISA");
	private JLabel lblPerguntaPesquisa = new JLabel("Digite o nome a ser pesquisado");
	private JLabel lblSearchIcon = new JLabel("");
	private Button btnPesquisa = new Button("Pesquisar");
	private Tabela tabela;
	private Grupo grupo;

	public TelaPesquisa() {
		setBackground(SystemColor.menu);
		setBounds(0, 0, 650, 650);
		setLayout(null);

		grupo = new Grupo();

		lblPesquisa.setFont(new Font("Roboto Cn", Font.PLAIN, 50));
		lblPesquisa.setForeground(new Color(153, 0, 204));
		lblPesquisa.setBounds(288, 11, 217, 50);
		add(lblPesquisa);

		lblPerguntaPesquisa.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblPerguntaPesquisa.setBounds(116, 61, 329, 50);
		add(lblPerguntaPesquisa);

		txtNomePesquisa = new JTextField();
		txtNomePesquisa.setBounds(116, 112, 436, 30);
		txtNomePesquisa.setBorder(new LineBorder(new Color(153, 0, 204), 1));
		add(txtNomePesquisa);
		txtNomePesquisa.setColumns(10);

		lblSearchIcon.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/search_purple.png")));
		lblSearchIcon.setBounds(82, 112, 24, 30);
		add(lblSearchIcon);

		JLabel lblTotalCadastros = new JLabel("Total de Cadastros: " + grupo.getGrupo().size());
		lblTotalCadastros.setBounds(82, 153, 217, 14);
		lblTotalCadastros.setForeground(new Color(153, 0, 204));
		lblTotalCadastros.setFont(new Font("Roboto Cn", Font.PLAIN, 18));
		add(lblTotalCadastros);

		JPanel panelListar = new JPanel();
		panelListar.setVisible(false);
		panelListar.setBounds(82, 178, 571, 437);
		add(panelListar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBackground(new Color(167, 135, 255));
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

		btnPesquisa.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		btnPesquisa.setForeground(new Color(255, 255, 255));
		btnPesquisa.setBackground(new Color(153, 0, 204));
		btnPesquisa.setBounds(566, 85, 146, 57);
		btnPesquisa.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				btnPesquisa.setBackground(new Color(51, 0, 51));
			}

			public void mousePressed(MouseEvent e) {
				btnPesquisa.setBackground(new Color(92, 92, 92));
			}

			public void mouseExited(MouseEvent e) {
				btnPesquisa.setBackground(new Color(153, 0, 204));
			}

			public void mouseEntered(MouseEvent e) {
				btnPesquisa.setBackground(new Color(51, 0, 51));
			}

			public void mouseClicked(MouseEvent e) {
				String nome = txtNomePesquisa.getText().toLowerCase();

//				if (Validacao.validaNome(nome)) {
				if (nome.length() > 0) {
					PessoaDAO pessoaDAO = new PessoaDAO();
					grupo.setGrupo(pessoaDAO.buscaNomes(txtNomePesquisa.getText().toLowerCase()));

					OrdenacaoNome ordemNome = new OrdenacaoNome();
					Collections.sort(grupo.getGrupo(), ordemNome);

					if (grupo.getGrupo().size() == 0) {
						lblTotalCadastros.setText("Total de Cadastros: " + grupo.getGrupo().size());
						JOptionPane.showMessageDialog(null, "Nao foram encontrados resultados para essa busca", "Busca",
								JOptionPane.ERROR_MESSAGE);
						panelListar.setVisible(false);
					} else {
						tabela.preencher(grupo.getGrupo());
						lblTotalCadastros.setText("Total de Cadastros: " + grupo.getGrupo().size());
						panelListar.setVisible(true);
					}
				}
				else {
					lblTotalCadastros.setText("Total de Cadastros: " + grupo.getGrupo().size());
					panelListar.setVisible(false);
					JOptionPane.showMessageDialog(null, "Nenhum nome encontrado", "Busca", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		add(btnPesquisa);

	}
}
