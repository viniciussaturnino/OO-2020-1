package principal;

import java.text.DecimalFormat;

public class Servicos {
	public static void mostraDados(Pessoa pessoa) {
		DecimalFormat mascara = new DecimalFormat("0.00");

		for (int i = 0; i < 8; i++)
			System.out.print("\t");
		System.out.println("Nome: " + pessoa.nome);
		for (int i = 0; i < 8; i++)
			System.out.print("\t");
		System.out.println("Idade: " + pessoa.idade);
		for (int i = 0; i < 8; i++)
			System.out.print("\t");
		System.out.println("Altura: " + mascara.format(pessoa.altura));
	}

	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}
}
