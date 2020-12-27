package saida;

import dados.Dados;
import dados.Tabela;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void centralizaDados(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.print("\t");
	}

	public static void mostraDados(Tabela tabela) {
		centralizaDados(15);
		System.out.println("ANO\t\t\t|\tEVENTO\t\t\t\t|\tPRESIDENTE");
		centralizaDados(15);
		for (int i = 0; i < 120; i++)
			System.out.print("-");
		limpaTela(1);
		for (int i = 0; i < tabela.getDados().size(); i++) {
			Dados dado = tabela.getDados(i);
			centralizaDados(15);
			System.out.println(dado.toString());
		}
		limpaTela(15);
	}
}
