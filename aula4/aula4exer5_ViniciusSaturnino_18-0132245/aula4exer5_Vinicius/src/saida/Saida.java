package saida;

import dados.Pessoa;

public class Saida {
	public static void mostraDados(Pessoa pessoa) {
		limpaTela(25);
		for (int i = 0; i < 9; i++)
			System.out.print("\t");
		System.out.println(pessoa.getSobrenome() + "/" + pessoa.getNome());
		limpaTela(2);
	}

	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}
}
