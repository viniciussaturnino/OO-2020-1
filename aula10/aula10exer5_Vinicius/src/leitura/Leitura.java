package leitura;

import javax.swing.JOptionPane;

public class Leitura {
	public static String getString(String mensagem, String titulo) {
		return (JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE).trim());
	}
}
