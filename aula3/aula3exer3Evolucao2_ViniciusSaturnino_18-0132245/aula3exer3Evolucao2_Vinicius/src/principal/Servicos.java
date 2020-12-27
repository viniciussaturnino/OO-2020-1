package principal;

import java.text.DecimalFormat;

public class Servicos {
	public static void mostraDados(Grupo grupo, int index) {
		DecimalFormat mascara = new DecimalFormat("0.00");

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
			System.out.print("  " + grupo.pessoa[aux].idade + "\t\t |");
			System.out.print("  " + mascara.format(grupo.pessoa[aux].altura) + "\t |");
			System.out.println("  " + grupo.pessoa[aux].nome);
		}
		Servicos.limpaTela(15);
	}

	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}
}
