package principal;

import dados.Pessoa;
import saida.Saida;
import servicos.Servicos;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		do {
			String nomes[] = Servicos.cadastraUsuario();
			Pessoa pessoa = new Pessoa(nomes[0], nomes[(nomes.length) - 1]);
			Saida.mostraDados(pessoa);
		} while (Validacao.validaContinua());
	}
}
