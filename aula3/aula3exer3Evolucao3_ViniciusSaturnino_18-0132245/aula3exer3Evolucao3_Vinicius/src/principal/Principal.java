package principal;

import dados.Grupo;
import dados.Pessoa;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		// Declarações
		final int LIMITE = 50;
		int i = 0;
		Grupo pessoas = new Grupo(LIMITE);

		// Instruções
		do {
			pessoas.inserePessoa(new Pessoa(Validacao.validaNome(), Validacao.validaIdade(), Validacao.validaAltura()), i);
			Saida.limpaTela(15);
			i++;
		} while (Validacao.validaContinua() || i >= LIMITE);

		Saida.limpaTela(30);
		Saida.mostraDados(pessoas.getGrupo(), i);
	}
}
