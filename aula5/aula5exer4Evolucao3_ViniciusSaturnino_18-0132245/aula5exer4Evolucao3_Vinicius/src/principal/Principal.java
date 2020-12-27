package principal;

import dados.Grupo;
import dados.Pessoa;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		boolean confirmacao;
		do {
			confirmacao = true;
			Grupo grupo = new Grupo();
			int opcao;
			do {
				Pessoa pessoa = new Pessoa(Validacao.validaNome());
				grupo.setNome(pessoa);
			} while (Validacao.validaContinua());
			opcao = Validacao.validaOpcao();
			if (opcao == 0) {
				confirmacao = Validacao.validaContinua();
				if (confirmacao)
					Saida.finalizaOperacao(grupo);
			} else if (opcao == 1) {
				Saida.mostraSequencia(grupo);
				confirmacao = Validacao.validaContinua();				
			}
			else {
				Saida.mostraSequenciaReversa(grupo);
				confirmacao = Validacao.validaContinua();
			}
		} while (confirmacao);
	}
}
