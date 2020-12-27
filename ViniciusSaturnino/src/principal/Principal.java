package principal;

import dados.Grupo;
import dados.Pessoa;
import saida.Saida;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		int codigo = 100;
		Grupo grupo = new Grupo();
		do {
			Saida.menuPrincipal();
			opcao = Validacao.validaOpcao();
			switch (opcao) {
			case 1:
				do {
					codigo++;
					Pessoa pessoa = Validacao.validaPessoa(grupo.getGrupo(), codigo);
					grupo.setPessoa(pessoa);
				} while (Validacao.validaContinua());
				break;
			case 2:
				Saida.mostraDados(grupo);
			}
		} while (opcao != 0);
		Saida.limpaTela(40);
		Saida.mostraResultados(grupo.getGrupo());
	}

}
