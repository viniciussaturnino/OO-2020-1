package validacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.Cidade;
import leitura.Leitura;

public class Validacao {
	public static String validaNome(String titulo, ArrayList<Cidade> cidades) {
		String nome = "";
		Boolean erro = false;
		do {
			erro = false;
			try {
				nome = Leitura.getString("Digite o nome da cidade", titulo);
				if (nome.length() < 3) {
					erro = true;
					JOptionPane.showMessageDialog(null, "Nome deve ter ao menos 3 caracteres", titulo,
							JOptionPane.ERROR_MESSAGE);
				}
				for (Cidade cidade : cidades) {
					if (nome.equalsIgnoreCase(cidade.getNome())) {
						erro = true;
						JOptionPane.showMessageDialog(null, "Cidade ja existe", titulo, JOptionPane.ERROR_MESSAGE);
					}
				}
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
				erro = true;
			}
		} while (erro);
		return nome;
	}

	public static String validaUf(String titulo) {
		String uf = "";
		do {
			try {
				uf = Leitura.getString("Digite a UF da cidade", titulo);
				if (uf.length() != 2)
					JOptionPane.showMessageDialog(null, "UF deve ter 2 caracteres", titulo, JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
			}
		} while (uf.length() != 2 || uf.isEmpty());
		return uf;
	}

	public static int validaQtdContaminados(String titulo) {
		int quantidade = 0;
		do {
			try {
				quantidade = Leitura.getInt("Digite a quantidade de pessoas contaminadas", titulo);
				if (quantidade < 0)
					JOptionPane.showMessageDialog(null, "Valor invalido, digite um valor nao negativo", titulo,
							JOptionPane.ERROR_MESSAGE);
			} catch (NumberFormatException excecao) {
				JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente.", titulo,
						JOptionPane.ERROR_MESSAGE);
				quantidade = -1;
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
				quantidade = -1;
			}
		} while (quantidade < 0);
		return quantidade;
	}

	public static int validaQtdMortos(String titulo, int qtdContaminados) {
		int quantidade = 0;
		do {
			try {
				quantidade = Leitura.getInt("Digite a quantidade de pessoas mortas", titulo);
				if (quantidade < 0 | quantidade > qtdContaminados)
					JOptionPane.showMessageDialog(null,
							"Valor invalido, nao pode ser maior que o numero de contaminados", titulo,
							JOptionPane.ERROR_MESSAGE);
			} catch (NumberFormatException excecao) {
				JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente.", titulo,
						JOptionPane.ERROR_MESSAGE);
				quantidade = -1;
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
				quantidade = -1;
			}
		} while (quantidade < 0 | quantidade > qtdContaminados);
		return quantidade;
	}

	public static boolean encontraCidade(Cidade cidade, int maximo) {
		if (cidade.equals(cidade, maximo))
			return true;
		return false;
	}
}
