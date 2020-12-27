package servicos;

import validacao.Validacao;

public class Servicos {
	public static String[] separaNome() {
		String nome = Validacao.validaNome();
		char c;
		int espacos = 0;
		for (int i = 0; i < nome.length(); i++) {
			c = nome.charAt(i);
			if (c == ' ')
				espacos++;
		}
		String vetor[] = new String[espacos + 1];
		vetor = nome.split(" ");
		return vetor;
	}
}
