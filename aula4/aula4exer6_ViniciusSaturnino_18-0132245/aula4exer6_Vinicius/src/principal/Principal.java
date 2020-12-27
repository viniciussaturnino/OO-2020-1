package principal;

import dados.Pessoa;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		do {
			Pessoa pessoa = new Pessoa(Validacao.validaNome());
			Saida.mostraDados(pessoa);
		} while (Validacao.validaContinua());
	}
}
