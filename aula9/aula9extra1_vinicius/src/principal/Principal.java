package principal;

import dados.Cidade;
import dados.ColecaoCidades;
import saida.Saida;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		ColecaoCidades cidades = new ColecaoCidades();
		int opcao = -1;
		do {
			opcao = Saida.menuPrincipal();
			switch (opcao) {
			case 0:
				cadastrarCidade(cidades);
				break;
			case 1:
				cidades.mostraContaminados(cidades.getCidades(), Validacao.validaQtdContaminados("Pesquisa"));
			}
		} while (opcao != -1);
	}

	// ==================== METODO DE CADASTRO ====================
	private static void cadastrarCidade(ColecaoCidades cidades) {
		String titulo = "Nova Cidade";
		String nome = Validacao.validaNome(titulo, cidades.getCidades());
		String uf = Validacao.validaUf(titulo);
		int qtdContaminados = Validacao.validaQtdContaminados(titulo);
		int qtdMortos = Validacao.validaQtdMortos(titulo, qtdContaminados);
		cidades.setCidade(new Cidade(nome, uf, qtdContaminados, qtdMortos));
	}

}
