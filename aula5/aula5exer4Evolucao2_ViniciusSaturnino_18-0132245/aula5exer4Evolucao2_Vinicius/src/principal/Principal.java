package principal;

import dados.Grupo;
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
				grupo.setNome(Validacao.validaNome());
			} while (Validacao.validaContinua());
			opcao = Validacao.validaOpcao();
			if (opcao == 0) {
				confirmacao = Validacao.validaContinua();
				if (confirmacao)
					Saida.finalizaOperacao(grupo);
			} else if (opcao == 1)
				Saida.mostraSequencia(grupo);
			else
				Saida.mostraSequenciaReversa(grupo);
		} while (!confirmacao);
	}
}
