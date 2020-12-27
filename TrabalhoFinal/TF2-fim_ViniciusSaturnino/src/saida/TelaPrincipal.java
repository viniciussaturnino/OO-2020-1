package saida;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Grupo;
import validacao.Validacao;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JPanel panelCadastro = new JPanel();
	private final JPanel panelLista = new JPanel();
	private final JPanel panelMostrar = new JPanel();
	private final JPanel panelPesquisar = new JPanel();
	private final JPanel panelSair = new JPanel();
	private final JPanel panelMain = new JPanel();
	private final JLabel lblCadastro = new JLabel("Novo");
	private final JLabel lblLista = new JLabel("Listar");
	private final JLabel lblMostrar = new JLabel("Mostrar");
	private final JLabel lblPesquisar = new JLabel("Pesquisar");
	private final JLabel lblSair = new JLabel("Sair");
	private final JLabel lblHomeIcon = new JLabel("");

	private TelaCadastro telaCadastro;
	private TelaListagem telaListagem;
	private TelaMostrar telaMostrar;
	private TelaPesquisa telaPesquisa;

	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1100, 690);
		setLocationRelativeTo(null);
		setUndecorated(true);

		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel.setBackground(new Color(153, 0, 204));
		panel.setBounds(0, 0, 300, 690);
		contentPane.add(panel);
		panel.setLayout(null);

		telaCadastro = new TelaCadastro();
		telaListagem = new TelaListagem();
		telaMostrar = new TelaMostrar();
		telaPesquisa = new TelaPesquisa();

		// ================ ICONE HOME ================
		lblHomeIcon.setBounds(110, 36, 64, 51);
		lblHomeIcon.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/home.png")));
		panel.add(lblHomeIcon);

		// ============= CADASTRAR ====================
		panelCadastro.setBackground(new Color(153, 0, 204));
		panelCadastro.setBounds(10, 115, 255, 45);
		panelCadastro.addMouseListener(new PanelButtonMouse(panelCadastro) {
			public void mouseClicked(MouseEvent e) {
				menuClicked(telaCadastro);
			}
		});
		panel.add(panelCadastro);
		panelCadastro.setLayout(null);
		lblCadastro.setForeground(new Color(255, 255, 255));
		lblCadastro.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblCadastro.setBounds(57, 11, 198, 20);
		panelCadastro.add(lblCadastro);
		JLabel lblCadastroIcone = new JLabel("");
		lblCadastroIcone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/register.png")));
		lblCadastroIcone.setBounds(23, 11, 24, 24);
		panelCadastro.add(lblCadastroIcone);
		// ============= FIM CADASTRAR =================

		// ============= LISTAR =================
		panelLista.setLayout(null);
		panelLista.setBackground(new Color(153, 0, 204));
		panelLista.setBounds(10, 164, 255, 45);
		panelLista.addMouseListener(new PanelButtonMouse(panelLista) {
			public void mouseClicked(MouseEvent e) {
				menuClicked(telaListagem);
			}
		});
		panel.add(panelLista);
		panelLista.setLayout(null);
		lblLista.setForeground(Color.WHITE);
		lblLista.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblLista.setBounds(57, 11, 198, 20);
		panelLista.add(lblLista);
		JLabel lblListaIcone = new JLabel("");
		lblListaIcone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/list.png")));
		lblListaIcone.setBounds(23, 11, 24, 24);
		panelLista.add(lblListaIcone);
		// ============= FIM LISTAR =================

		// ============= MOSTRAR =================
		panelMostrar.setLayout(null);
		panelMostrar.setBackground(new Color(153, 0, 204));
		panelMostrar.setBounds(10, 214, 255, 45);
		panelMostrar.addMouseListener(new PanelButtonMouse(panelMostrar) {
			public void mouseClicked(MouseEvent e) {
				menuClicked(telaMostrar);
			}
		});
		panel.add(panelMostrar);
		panelMostrar.setLayout(null);
		lblMostrar.setForeground(Color.WHITE);
		lblMostrar.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblMostrar.setBounds(57, 11, 198, 20);
		panelMostrar.add(lblMostrar);
		JLabel lblMostrarIcone = new JLabel("");
		lblMostrarIcone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/view.png")));
		lblMostrarIcone.setBounds(23, 11, 24, 24);
		panelMostrar.add(lblMostrarIcone);
		// ============= FIM MOSTRAR =================

		// ============= PESQUISAR =================
		panelPesquisar.setLayout(null);
		panelPesquisar.setBackground(new Color(153, 0, 204));
		panelPesquisar.setBounds(10, 264, 255, 45);
		panelPesquisar.addMouseListener(new PanelButtonMouse(panelPesquisar) {
			public void mouseClicked(MouseEvent e) {
				menuClicked(telaPesquisa);
			}
		});
		panel.add(panelPesquisar);
		panelMostrar.setLayout(null);
		lblPesquisar.setForeground(Color.WHITE);
		lblPesquisar.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblPesquisar.setBounds(57, 11, 198, 20);
		panelPesquisar.add(lblPesquisar);
		JLabel lblPesquisarIcone = new JLabel("");
		lblPesquisarIcone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/search.png")));
		lblPesquisarIcone.setBounds(23, 11, 24, 24);
		panelPesquisar.add(lblPesquisarIcone);
		// =============== FIM PESQUISAR =============

		// =============== SAIR =============
		panelSair.setLayout(null);
		panelSair.setBackground(new Color(153, 0, 204));
		panelSair.setBounds(10, 315, 255, 45);
		panelSair.addMouseListener(new PanelButtonMouse(panelSair) {
			public void mouseClicked(MouseEvent e) {
				sair(new Grupo());
			}
		});
		panel.add(panelSair);
		panelSair.setLayout(null);
		lblSair.setForeground(Color.WHITE);
		lblSair.setFont(new Font("Roboto Lt", Font.PLAIN, 23));
		lblSair.setBounds(57, 11, 198, 20);
		panelSair.add(lblSair);
		JLabel lblSairIcone = new JLabel("");
		lblSairIcone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/exit.png")));
		lblSairIcone.setBounds(23, 11, 24, 24);
		panelSair.add(lblSairIcone);

		// =============== FIM SAIR =============

		JLabel lblImg = new JLabel("");
		lblImg.setFont(new Font("Bauhaus 93", Font.PLAIN, 23));
		lblImg.setForeground(new Color(255, 255, 224));
		lblImg.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/virus.png")));
		lblImg.setBounds(46, 416, 118, 120);
		panel.add(lblImg);

		JLabel lblImg2 = new JLabel("");
		lblImg2.setForeground(new Color(255, 255, 224));
		lblImg2.setFont(new Font("Bauhaus 93", Font.PLAIN, 23));
		lblImg2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/virus2.png")));
		lblImg2.setBounds(135, 488, 75, 91);
		panel.add(lblImg2);

		// =============== BOTAO DE X ===========
		JLabel lblX = new JLabel("");
		lblX.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/close.png")));
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblX.setBounds(1060, 5, 40, 40);
		lblX.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				sair(new Grupo());
			}
		});
		contentPane.add(lblX);

		// =========== CONTEUDO DA PAG ==============
		panelMain.setBackground(new Color(51, 51, 51));
		panelMain.setBounds(300, 56, 800, 634);

		contentPane.add(panelMain);
		panelMain.setLayout(new CardLayout(0, 0));

		panelMain.add(telaCadastro);
		panelMain.add(telaListagem);
		panelMain.add(telaMostrar);
		panelMain.add(telaPesquisa);
		menuClicked(telaCadastro);
	}

	private void sair(Grupo grupo) {
		if (Validacao.validaSaida())
			dispose();
		Saida.limpaTela(50);
		Saida.mostraResultados();
	}

	public void menuClicked(JPanel panel) {
		telaCadastro.setVisible(false);
		telaListagem.setVisible(false);
		telaMostrar.setVisible(false);
		telaPesquisa.setVisible(false);

		panel.setVisible(true);
	}

	private class PanelButtonMouse extends MouseAdapter {
		private JPanel panel;

		public PanelButtonMouse(JPanel panel) {
			this.panel = panel;
		}

		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(51, 0, 51));
		}

		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(153, 0, 204));
		}

		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(92, 92, 92));
		}

		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(51, 0, 51));
		}

	}
}
