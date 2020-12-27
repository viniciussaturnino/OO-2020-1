package validacao;

import javax.swing.JOptionPane;

import leitura.Leitura;

public class Validacao {
	public static StringBuilder validaNome() {
		String ler = "";
		StringBuilder nome = new StringBuilder();
		boolean erro = false;
		do {
			erro = false;
			try {
				ler = Leitura.getString("Digite o nome do time.", "Registro").toUpperCase();
				if (ler.isEmpty())
					ler = JOptionPane.showInputDialog(null, "Nome nao pode ser vazio, tente novamente", "Registro",
							JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException exc) {
				JOptionPane.showMessageDialog(null, "Cadastre ao menos um time.", "Erro", JOptionPane.ERROR_MESSAGE);
				erro = true;
			}
		} while (ler.isEmpty() && erro);
		return nome.append(ler);
	}

	public static int validaAno() {
		final int MIN = 1900, MAX = 2200;
		int ano = 0;
		do {
			try {
				ano = Leitura.getInt("Digite o ano do titulo do time", "Registro");
				if (ano < 1900 || ano > 2200)
					JOptionPane.showMessageDialog(null, "Valor invalido, digite um valor entre " + MIN + " e " + MAX,
							"Registro", JOptionPane.ERROR_MESSAGE);
			} catch (NumberFormatException excecao) {
				JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente.", "Registro",
						JOptionPane.ERROR_MESSAGE);
				ano = -1;
			} catch (NullPointerException exc) {
				return JOptionPane.showConfirmDialog(null, "Deseja voltar ao menu?", "Pergunta",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			}
		} while (ano < 1900 || ano > 2200);
		return ano;
	}

	public static int validaOpcao() {
		int resposta, confirmacao = -1;
		String opcoes[] = { "Cadastrar time", "Visualizar Times", "Sair" };
		do {
			resposta = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Menu", 0,
					JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			if (resposta == 2)
				confirmacao = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?", "Pergunta",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (confirmacao == 0)
				return resposta;
		} while (resposta != 2 && resposta != 1 && resposta != 0 && resposta != -1);
		return resposta;
	}
}
