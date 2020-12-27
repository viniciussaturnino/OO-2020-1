package servicos;

import dados.Pessoa;

public class Servicos {
	public static String[] separaNome(Pessoa pessoa) {
		char c;
		int espacos = 0;
		for (int i = 0; i < pessoa.getNome().length(); i++) {
			c = pessoa.getNome().charAt(i);
			if (c == ' ')
				espacos++;
		}
		String vetor[] = new String[espacos + 1];
		vetor = pessoa.getNome().split(" ");
		return vetor;
	}
}
