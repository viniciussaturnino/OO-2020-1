package principal;

import dados.Asilo;
import dados.Doacao;
import leitura.Leitura;
import saida.Saida;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		int opcao = 0;
		Asilo asilo = new Asilo();
		asilo.setNome(Validacao.validaNomeAsilo());
		do {
			Saida.mostraMenu();
			opcao = Leitura.getOpcao();
			switch (opcao) {
			case 1:
				Saida.limpaTela(30);
				Doacao doacao = new Doacao(Validacao.validaNomeItem(), Validacao.validaCodigo(asilo.getDoacoes()));
				asilo.setDoacao(doacao);
				break;
			case 2:
				Saida.limpaTela(5);
				Saida.mostraDoacoes(asilo.getDoacoes());
				break;
			case 3:
				Saida.limpaTela(5);
				if (asilo.getDoacoes().size() != 0)
					Saida.mostraResultadoBusca(asilo.getDoacoes(), asilo.getDoacao(Leitura.getString()));
				else
					Saida.mostraErro();
				break;
			case 0:
				if (asilo.getDoacoes().size() == 0)
					Saida.mostraErro();
				break;
			}
		} while (opcao != 0 || asilo.getDoacoes().size() == 0);
		Saida.limpaTela(30);
		Saida.finalizaPrograma();
	}

}
