package principal;

import java.util.Vector;

import dados.Pessoa;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		boolean confirmacao;
		do {
			confirmacao = true;
			Vector<Pessoa> lista = new Vector<Pessoa>();
			int opcao;
			do {
				Pessoa pessoa = new Pessoa(Validacao.validaNome());
				lista.add(pessoa);
			} while (Validacao.validaContinua());
			opcao = Validacao.validaOpcao();
			if (opcao == 0) {
				confirmacao = Validacao.validaContinua();
				if(confirmacao)
					Saida.finalizaOperacao(lista);
			} else if (opcao == 1)
				Saida.mostraSequencia(lista);
			else
				Saida.mostraSequenciaReversa(lista);
		} while (!confirmacao);
	}
}
