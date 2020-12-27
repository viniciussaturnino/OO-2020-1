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
}
