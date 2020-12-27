package validacao;

import java.util.List;

import javax.swing.JOptionPane;

import dados.Cidade;
import leitura.Leitura;

public class Validacao {
	public static String validaNome() {
		String nome = "";
		do {
			nome = Leitura.getString("Digite o nome da cidade.", "Registro");
			if (nome.isEmpty())
				nome = JOptionPane.showInputDialog(null, "Nome nao pode ser vazio, tente novamente", "Registro",
						JOptionPane.ERROR_MESSAGE);
		} while (nome.isEmpty());
		return nome;
	}

	public static int validaDDD() {
		String ddd = "";
		int resposta = 0;
		ddd = Leitura.getString("Digite o DDD desta cidade.", "Registro");
		do {
			try {
				resposta = Integer.parseInt(ddd);
				if (resposta < 10)
					throw new Exception("DDD inválido.");
			} catch (Exception exc) {
				ddd = JOptionPane.showInputDialog(null, "DDD Inválido. Digite DDD maior que 10.", "Registro",
						JOptionPane.ERROR_MESSAGE);
				resposta = Integer.parseInt(ddd);
			}
		} while (resposta < 10);
		return resposta;
	}

	public static int validaOpcao() {
		int resposta, confirmacao = -1;
		do {
			resposta = JOptionPane.showConfirmDialog(null, "Deseja registrar uma cidade?", "Pergunta",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resposta != 0)
				confirmacao = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?", "Pergunta",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resposta != 0 && confirmacao == 0)
				return -1;
		} while (resposta != 0 && resposta != 1 && resposta != -1);
		return resposta;
	}

	public static boolean validaCidade(List<Cidade> listaCidades, String nome, int ddd) {
		for (Cidade cidade : listaCidades)
			if (cidade.getNome().equals(nome) && cidade.getDDD().equals(ddd)) {
				JOptionPane.showMessageDialog(null, "Cidade ja existe", "Erro", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		return true;
	}
}
