package validacao;

import javax.swing.JOptionPane;

import dados.ColecaoEmpregados;
import dados.Empregado;
import leitura.Leitura;

public class Validacao {
	public static boolean isValidaString(String valor) {
		return valor.isEmpty();
	}

	public static boolean isValidaInteger(Integer valor, int maximo, int minimo) {
		return (valor < minimo || valor > maximo);
	}

	public static boolean isValidaFloat(Float valor, int maximo, int minimo) {
		return (valor < minimo || valor > maximo);
	}

	private static boolean isMatricula(int matricula, ColecaoEmpregados empregados) {
		for (Empregado empregado : empregados.getEmpregados())
			if (matricula == empregado.getMatricula())
				return true;
		return false;
	}

	public static Integer leMatricula(String titulo, String mensagem, int maximo, int minimo,
			ColecaoEmpregados empregados) {
		int numero = 0;
		boolean erro = false;
		do {
			erro = false;
			try {
				numero = Leitura.getInteger(mensagem, titulo);

				if (isValidaInteger(numero, maximo, minimo)) {
					erro = true;
					JOptionPane.showMessageDialog(null,
							"Valor invalido, o numero deve estar entre " + minimo + " e " + maximo, titulo,
							JOptionPane.ERROR_MESSAGE);
				}
				if (isMatricula(numero, empregados)) {
					erro = true;
					JOptionPane.showMessageDialog(null, "Empregado ja existente. Tente novamente", titulo,
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (NumberFormatException excecao) {
				JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente.", titulo,
						JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
				numero = minimo - 1;
			}
		} while (isValidaInteger(numero, maximo, minimo) || erro);
		return numero;
	}

	public static Integer leInt(String titulo, String mensagem, int maximo, int minimo) {
		int numero = 0;
		do {
			try {
				numero = Leitura.getInteger(mensagem, titulo);

				if (isValidaInteger(numero, maximo, minimo))
					JOptionPane.showMessageDialog(null,
							"Valor invalido, o numero deve estar entre " + minimo + " e " + maximo, titulo,
							JOptionPane.ERROR_MESSAGE);
			} catch (NumberFormatException excecao) {
				JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente.", titulo,
						JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
				numero = minimo - 1;
			}
		} while (isValidaInteger(numero, maximo, minimo));
		return numero;
	}

	public static StringBuilder leString(String titulo, String mensagem) {
		String string = null;
		StringBuilder valor = new StringBuilder();
		do {
			try {
				string = Leitura.getString(mensagem, titulo);
				if (isValidaString(string))
					JOptionPane.showMessageDialog(null, "Nome nao pode ser vazio", titulo, JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
				string = null;
			}
		} while (isValidaString(string));
		return valor.append(string);
	}

	public static Float leFloat(String titulo, String mensagem, int maximo, int minimo) {
		float salario = 0F;
		do {
			try {
				salario = Leitura.getFloat(mensagem, titulo);
				if (isValidaFloat(salario, maximo, minimo))
					JOptionPane.showMessageDialog(null,
							"Valor invalido, o numero deve estar entre " + minimo + " e " + maximo, titulo,
							JOptionPane.ERROR_MESSAGE);
			} catch (NumberFormatException excecao) {
				JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente", titulo,
						JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException excecao) {
				JOptionPane.showMessageDialog(null, "Campo Obrigatorio", titulo, JOptionPane.ERROR_MESSAGE);
				salario = minimo - 1;
			}
		} while (isValidaFloat(salario, maximo, minimo));
		return salario;
	}

}
