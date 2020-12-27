package saida;

import leitura.Leitura;

public class Saida {
	public static int menuPrincipal() {
		String[] botoes = { "Nova Cidade", "Pesquisa Cidade Contaminada" };
		int opcao = Leitura.getBotao("Selecione a opcao desejada.", botoes);
		return opcao;
	}

	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}
}
