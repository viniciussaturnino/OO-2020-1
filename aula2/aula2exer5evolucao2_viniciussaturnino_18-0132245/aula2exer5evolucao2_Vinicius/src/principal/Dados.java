package principal;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		// Declarações
		Scanner ler = new Scanner(System.in);
		int qtd_homens = 0, qtd_mulheres = 0;
		float soma_pesos = 0F;
		final int MAXIMO = 20;
		String sexo = new String();
		float peso[] = new float[MAXIMO];
		float maiorPeso = 0F, menorPeso = 10000F;

		// Instruções
		for (int i = 0; i < MAXIMO; i++) {
			System.out.print("Digite o sexo da " + (i + 1) + "ª pessoa: ");
			sexo = leSexo(MAXIMO, ler);
			System.out.print("Digite o peso da " + (i + 1) + "ª pessoa: ");
			peso[i] = lerPeso(MAXIMO, ler);
			if (peso[i] > maiorPeso)
				maiorPeso = peso[i];
			if (peso[i] < menorPeso)
				menorPeso = peso[i];
			if (sexo.intern().equalsIgnoreCase("masculino"))
				soma_pesos += peso[i];
			qtd_mulheres += contaMulheres(sexo);
			qtd_homens += contaHomens(sexo);
		}

		limpaTela(30);

		System.out.println("Maior peso: " + maiorPeso);
		System.out.println("Menor peso: " + menorPeso);
		System.out.println("Media do peso dos homens: " + soma_pesos / qtd_homens);
		System.out.println("Quantidade de mulheres: " + qtd_mulheres);
	}

	public static int contaMulheres(String sexo) {
		int total = 0;
		if (sexo.intern().equalsIgnoreCase("feminino"))
			total++;
		return total;
	}

	public static int contaHomens(String sexo) {
		int total = 0;
		if (sexo.intern().equalsIgnoreCase("masculino"))
			total++;
		return total;
	}

	public static String leSexo(int MAXIMO, Scanner ler) {
		String sexo = new String();
		sexo = ler.next();
		while (!sexo.intern().equalsIgnoreCase("masculino") && !sexo.intern().equalsIgnoreCase("feminino")) {
			System.out.print("Sexo invalido! Digite novamente (masculino/feminino): ");
			sexo = ler.next();
		}
		return sexo;
	}

	public static float lerPeso(int MAXIMO, Scanner ler) {
		float peso = 0F;
		peso = ler.nextFloat();
		while (peso < 0) {
			System.out.print("Peso invalido! Digite novamente (pesos não negativos): ");
			peso = ler.nextFloat();
		}
		return peso;
	}

	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}

}
