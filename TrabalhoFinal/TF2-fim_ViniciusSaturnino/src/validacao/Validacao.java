package validacao;

import javax.swing.JOptionPane;

public class Validacao {
	public static boolean validaIdade(String entrada) {
		final int MIN = 0, MAX = 150;
		int idade;
		try {
			idade = Integer.parseInt(entrada);
			if (idade < MIN || idade > MAX) {
				JOptionPane.showMessageDialog(null, "Valor invalido, digite um valor entre " + MIN + " e " + MAX,
						"Cadastro", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite um valor inteiro", "Cadastro", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}

	public static boolean validaNome(String nome) {
		final int MIN = 3, MAX = 99;
		if (nome.length() < MIN || nome.length() > MAX) {
			JOptionPane.showMessageDialog(null, "Nome devera ter no minimo " + MIN + " caracteres.", "Cadastro",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		for (int aux = 0; aux < nome.length(); aux++) {
			char c = nome.charAt(aux);
			if (c >= 48 && c <= 57) {
				JOptionPane.showMessageDialog(null, "Nome não poderá conter números", "Cadastro",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
		return true;
	}

	public static boolean validaSaida() {
		int opcao = 0;
		do {
			opcao = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?", "Sair",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		} while (opcao == -1);
		return (opcao == JOptionPane.YES_OPTION);
	}

	public static boolean validaID(String entrada) {
		final int MIN = 100;
		int id;
		try {
			id = Integer.parseInt(entrada);
			if (id < MIN) {
				JOptionPane.showMessageDialog(null, "Valor invalido, digite um valor maior que " + MIN, "Busca",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite um valor inteiro", "Resultado", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}
}
