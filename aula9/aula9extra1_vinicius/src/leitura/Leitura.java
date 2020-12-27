package leitura;

import javax.swing.JOptionPane;

public class Leitura {
	public static String getString(String mensagem, String titulo) {
		return (JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE).trim());
	}

	public static int getInt(String mensagem, String titulo) {
		return Integer
				.parseInt(JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE).trim());
	}

	public static int getBotao(String mensagem, String botoes[]) {
		return JOptionPane.showOptionDialog(null, mensagem, "Menu", 0, JOptionPane.INFORMATION_MESSAGE, null, botoes,
				botoes[0]);
	}
}
