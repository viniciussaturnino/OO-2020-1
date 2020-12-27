package saida;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import dados.Homem;
import dados.Mulher;
import dao.PessoaDAO;
import validacao.Validacao;

import java.awt.SystemColor;

@SuppressWarnings("serial")
public class TelaCadastro extends JPanel {

	private JTextField txtNome;
	private JTextField txtIdade;
	private JLabel lblTitulo = new JLabel("SELECIONE O SEXO QUE DESEJA CADASTRAR");
	private JLabel lblNome = new JLabel("Nome");
	private JLabel lblIdade = new JLabel("Idade");
	private JLabel lblSaude = new JLabel("Situação de Saúde");
	private JLabel lblGestante = new JLabel("A mulher ja foi gestante?");
	private JRadioButton opcaoFem = new JRadioButton("Feminino");
	private JRadioButton opcaoMasc = new JRadioButton("Masculino");
	private JRadioButton opcaoGestSim = new JRadioButton("Sim");
	private JRadioButton opcaoGestNao = new JRadioButton("Não");
	private JRadioButton opcaoGestNS = new JRadioButton("Não tem certeza");
	private JRadioButton opcaoCurado = new JRadioButton("Contaminado(a) Curado(a)");
	private JRadioButton opcaoSemContaminacao = new JRadioButton("Sem Contaminação");
	private JRadioButton opcaoFalecido = new JRadioButton("Contaminado(a) Falecido(a)");
	private JRadioButton opcaoTratamento = new JRadioButton("Contaminado(a) em Tratamento");

	public TelaCadastro() {
		setBackground(SystemColor.menu);
		setBounds(0, 0, 650, 650);
		setLayout(null);

		lblTitulo.setForeground(new Color(153, 0, 204));
		lblTitulo.setBounds(49, 22, 535, 89);
		lblTitulo.setFont(new Font("Roboto Cn", Font.PLAIN, 29));
		add(lblTitulo);

		opcaoMasc.setBackground(SystemColor.menu);
		opcaoMasc.setBounds(147, 119, 140, 23);
		opcaoMasc.setSelected(true);
		opcaoMasc.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		opcaoMasc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (opcaoMasc.isSelected()) {
					opcaoFem.setSelected(false);
					lblIdade.setVisible(true);
					txtIdade.setVisible(true);
					lblGestante.setVisible(false);
					opcaoGestSim.setVisible(false);
					opcaoGestNao.setVisible(false);
					opcaoGestNS.setVisible(false);
				}
			}
		});
		add(opcaoMasc);

		opcaoFem.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		opcaoFem.setBackground(SystemColor.menu);
		opcaoFem.setBounds(351, 119, 140, 23);
		opcaoFem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (opcaoFem.isSelected()) {
					opcaoMasc.setSelected(false);
					lblIdade.setVisible(false);
					txtIdade.setVisible(false);
					lblGestante.setVisible(true);
					opcaoGestSim.setVisible(true);
					opcaoGestNao.setVisible(true);
					opcaoGestNS.setVisible(true);
				}
			}
		});
		add(opcaoFem);

		ButtonGroup sexo = new ButtonGroup();
		sexo.add(opcaoMasc);
		sexo.add(opcaoFem);

		txtNome = new JTextField();
		txtNome.setBounds(73, 199, 382, 31);
		txtNome.setBorder(new LineBorder(new Color(153, 0, 204), 1));
		add(txtNome);
		txtNome.setColumns(10);

		lblNome.setForeground(new Color(0, 0, 0));
		lblNome.setBounds(73, 169, 55, 19);
		lblNome.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		add(lblNome);

		lblSaude.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		lblSaude.setBounds(73, 246, 159, 25);
		add(lblSaude);

		opcaoCurado.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		opcaoCurado.setBackground(SystemColor.menu);
		opcaoCurado.setSelected(true);
		opcaoCurado.setBounds(73, 278, 193, 23);
		add(opcaoCurado);

		opcaoFalecido.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		opcaoFalecido.setBackground(SystemColor.menu);
		opcaoFalecido.setBounds(73, 312, 204, 23);
		add(opcaoFalecido);

		opcaoTratamento.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		opcaoTratamento.setBackground(SystemColor.menu);
		opcaoTratamento.setBounds(303, 282, 230, 23);
		add(opcaoTratamento);

		opcaoSemContaminacao.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		opcaoSemContaminacao.setBackground(SystemColor.menu);
		opcaoSemContaminacao.setBounds(303, 312, 152, 23);
		add(opcaoSemContaminacao);

		ButtonGroup situacaoSaude = new ButtonGroup();
		situacaoSaude.add(opcaoCurado);
		situacaoSaude.add(opcaoFalecido);
		situacaoSaude.add(opcaoTratamento);
		situacaoSaude.add(opcaoSemContaminacao);

		if (opcaoCurado.isSelected()) {
			opcaoFalecido.setSelected(false);
			opcaoTratamento.setSelected(false);
			opcaoSemContaminacao.setSelected(false);
		} else if (opcaoFalecido.isSelected()) {
			opcaoCurado.setSelected(false);
			opcaoTratamento.setSelected(false);
			opcaoSemContaminacao.setSelected(false);
		} else if (opcaoTratamento.isSelected()) {
			opcaoCurado.setSelected(false);
			opcaoFalecido.setSelected(false);
			opcaoSemContaminacao.setSelected(false);
		} else if (opcaoSemContaminacao.isSelected()) {
			opcaoCurado.setSelected(false);
			opcaoFalecido.setSelected(false);
			opcaoTratamento.setSelected(false);
		}

		lblIdade.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		lblIdade.setBounds(462, 167, 55, 23);
		lblIdade.setVisible(false);
		add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(461, 199, 72, 31);
		txtIdade.setBorder(new LineBorder(new Color(153, 0, 204), 1));
		txtIdade.setVisible(false);
		add(txtIdade);

		lblGestante.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		lblGestante.setBounds(73, 352, 193, 23);
		lblGestante.setVisible(false);
		add(lblGestante);

		opcaoGestSim.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		opcaoGestSim.setBackground(SystemColor.menu);
		opcaoGestSim.setBounds(73, 383, 193, 23);
		opcaoGestSim.setSelected(true);
		opcaoGestSim.setVisible(false);
		add(opcaoGestSim);

		opcaoGestNao.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		opcaoGestNao.setBackground(SystemColor.menu);
		opcaoGestNao.setBounds(73, 409, 193, 23);
		opcaoGestNao.setVisible(false);
		add(opcaoGestNao);

		opcaoGestNS.setFont(new Font("Roboto Lt", Font.PLAIN, 14));
		opcaoGestNS.setBackground(SystemColor.menu);
		opcaoGestNS.setBounds(73, 435, 193, 23);
		opcaoGestNS.setVisible(false);
		add(opcaoGestNS);

		ButtonGroup situacaoGestante = new ButtonGroup();
		situacaoGestante.add(opcaoGestSim);
		situacaoGestante.add(opcaoGestNao);
		situacaoGestante.add(opcaoGestNS);

		if (opcaoGestSim.isSelected()) {
			opcaoGestNao.setSelected(false);
			opcaoGestNS.setSelected(false);
		} else if (opcaoGestNao.isSelected()) {
			opcaoGestSim.setSelected(false);
			opcaoGestNS.setSelected(false);
		} else if (opcaoGestNS.isSelected()) {
			opcaoGestSim.setSelected(false);
			opcaoGestNao.setSelected(false);
		}

		// ============= BOTAO DE CADASTRO ==============
		Button btnAvancar = new Button("Cadastrar");
		btnAvancar.setForeground(new Color(255, 255, 255));
		btnAvancar.setBackground(new Color(153, 0, 204));
		btnAvancar.setBounds(73, 501, 146, 57);
		btnAvancar.setFont(new Font("Roboto Lt", Font.PLAIN, 18));
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder nome = new StringBuilder();
				String situacao = "";
				boolean erro = false;
				if (!Validacao.validaNome(txtNome.getText())) {
					erro = true;
				} else {
					nome.append(txtNome.getText());
				}
				if (opcaoCurado.isSelected())
					situacao = "C";
				else if (opcaoFalecido.isSelected())
					situacao = "F";
				else if (opcaoTratamento.isSelected())
					situacao = "T";
				else if (opcaoSemContaminacao.isSelected())
					situacao = "S";
				// Cadastro de homens
				if (opcaoMasc.isSelected()) {
					if (!Validacao.validaIdade(txtIdade.getText())) {
						erro = true;
						txtIdade.setText(null);
					}
					if (!erro) {
						PessoaDAO pessoaDAO = new PessoaDAO();
						Homem homem = new Homem(nome, situacao, Integer.parseInt(txtIdade.getText()));
						pessoaDAO.cadastrar(homem);
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!");
						txtNome.setText(null);
						txtIdade.setText(null);
						opcaoCurado.setSelected(false);
						opcaoFalecido.setSelected(false);
						opcaoTratamento.setSelected(false);
						opcaoSemContaminacao.setSelected(false);
					}
				} else if (opcaoFem.isSelected() && !erro) { // Cadastro de Mulheres
					String situacaoGestante = "";
					if (opcaoGestSim.isSelected())
						situacaoGestante = "S";
					else if (opcaoGestNao.isSelected())
						situacaoGestante = "N";
					else if (opcaoGestNS.isSelected())
						situacaoGestante = "T";
					PessoaDAO pessoaDAO = new PessoaDAO();
					Mulher mulher = new Mulher(nome, situacao, situacaoGestante);
					pessoaDAO.cadastrar(mulher);
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!");
					txtNome.setText(null);
					opcaoCurado.setSelected(false);
					opcaoFalecido.setSelected(false);
					opcaoTratamento.setSelected(false);
					opcaoSemContaminacao.setSelected(false);
					opcaoGestSim.setSelected(false);
					opcaoGestNao.setSelected(false);
					opcaoGestNS.setSelected(false);
				}
			}
		});
		btnAvancar.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				btnAvancar.setBackground(new Color(51, 0, 51));
			}

			public void mousePressed(MouseEvent e) {
				btnAvancar.setBackground(new Color(92, 92, 92));
			}

			public void mouseExited(MouseEvent e) {
				btnAvancar.setBackground(new Color(153, 0, 204));
			}

			public void mouseEntered(MouseEvent e) {
				btnAvancar.setBackground(new Color(51, 0, 51));
			}

			public void mouseClicked(MouseEvent e) {

			}
		});
		add(btnAvancar);
	}

}
