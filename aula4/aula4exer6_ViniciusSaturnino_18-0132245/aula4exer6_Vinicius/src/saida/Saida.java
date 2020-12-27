package saida;

import dados.Pessoa;
import servicos.Servicos;

public class Saida {
	public static void mostraDados(Pessoa pessoa) {
		String nome[] = Servicos.separaNome(pessoa);
		limpaTela(25);
		for (int i = 0; i < nome.length; i++) {
			for (int j = 0; j < 9; j++)
				System.out.print("\t");
			System.out.println(nome[i]);
		}
		limpaTela(2);
	}

	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}
}
