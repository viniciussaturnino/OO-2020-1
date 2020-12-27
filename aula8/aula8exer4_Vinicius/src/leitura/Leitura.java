package leitura;

import javax.swing.JOptionPane;

public class Leitura {
	public static String getString(String mensagem, String titulo) {
		return (JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE).trim());
	}

	public static Integer getInteger(String mensagem, String titulo) {
		return Integer
				.parseInt(JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE).trim());
	}

	public static Float getFloat(String mensagem, String titulo) {
		return Float
				.parseFloat(JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE).trim());
	}

	public static Integer getBotao(String mensagem, String botoes[]) {
		return JOptionPane.showOptionDialog(null, mensagem, "Menu", 0, JOptionPane.INFORMATION_MESSAGE, null, botoes,
				botoes[0]);
	}
}
