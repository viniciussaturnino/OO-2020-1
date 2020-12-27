package saida;

import java.text.DecimalFormat;

import dados.Pessoa;

public class Saida {
	public static void mostraDados(Pessoa grupo[], int index) {
		DecimalFormat mascara = new DecimalFormat("0.00");

		for (int i = 0; i < 8; i++)
			System.out.print("\t");
		System.out.println("================ Tabela de Usuários ================");
		limpaTela(1);

		for (int i = 0; i < 7; i++)
			System.out.print("\t");
		System.out.println("Número\t | Idade\t | Altura\t | Nome");
		for (int i = 0; i < 7; i++)
			System.out.print("\t");
		for (int i = 0; i < 7; i++)
			System.out.print("---------");
		System.out.println();
		for (int aux = 0; aux < index; aux++) {
			for (int i = 0; i < 7; i++)
				System.out.print("\t");
			System.out.print((aux + 1) + "\t |");
			System.out.print("  " + grupo[aux].getIdade() + "\t\t |");
			System.out.print("  " + mascara.format(grupo[aux].getAltura()) + " m\t |");
			System.out.println("  " + grupo[aux].getNome());
		}
		limpaTela(15);
	}

	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}
}
