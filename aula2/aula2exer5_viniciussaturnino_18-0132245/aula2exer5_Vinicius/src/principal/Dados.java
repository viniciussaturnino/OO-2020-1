package principal;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		// Declarações
		Scanner ler = new Scanner(System.in);
		int qtd_homens = 0, qtd_mulheres = 0;
		float soma_pesos = 0F;
		final int MAXIMO = 20;
		char sexo[] = new char[MAXIMO];
		float peso[] = new float[MAXIMO];
		float maior = 0F, menor = 0F;

		// Instruções
		for (int i = 0; i < MAXIMO; i++) {
			do {
				System.out.print("Digite o sexo[M/F] da " + (i + 1) + "ª pessoa: ");
				sexo[i] = ler.next().toUpperCase().charAt(0);
				if (sexo[i] != 'M' && sexo[i] != 'F')
					System.out.println("Sexo inválido, tente novamente!");
			} while (sexo[i] != 'M' && sexo[i] != 'F');
			do {
				System.out.print("Digite o peso da " + (i + 1) + "ª pessoa: ");
				peso[i] = ler.nextFloat();
				if (peso[i] <= 0)
					System.out.println("Peso inválido, não insira pesos negativos!");
			} while (peso[i] <= 0);
			menor = peso[i];
			if (sexo[i] == 'F')
				qtd_mulheres++;
			else {
				qtd_homens++;
				soma_pesos += peso[i];
			}
		}

		for (int i = 0; i < MAXIMO; i++)
			if (peso[i] > maior)
				maior = peso[i];

		for (int i = 0; i < MAXIMO; i++)
			if (peso[i] < menor)
				menor = peso[i];

		limpaTela();

		System.out.println("Maior peso: " + maior);
		System.out.println("Menor peso: " + menor);
		System.out.println("Media do peso dos homens: " + soma_pesos / qtd_homens);
		System.out.println("Quantidade de mulheres: " + qtd_mulheres);
	}

	private static void limpaTela() {
		for (int i = 0; i < 30; i++)
			System.out.println();		
	}

}
