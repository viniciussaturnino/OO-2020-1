package principal;

import java.util.Scanner;

public class Aula2exer4_ViniciusSaturnino_18_0132245 {
	public static void main(String[] args) {
		// Declarações
		float pesos[] = new float[3];
		int i = 0, j = 0;
		Scanner ler = new Scanner(System.in);

		// Instruções
		for (i = 0; i < 3; i++) {
			do {
				System.out.print("Digite o " + (i + 1) + "º peso: ");
				pesos[i] = ler.nextFloat();
				if (pesos[i] < 5)
					System.out.println("Peso inválido!");
			} while (pesos[i] < 5);
		}
		for (i = 1; i < 3; i++)
			for (j = i; j > 0 && pesos[j] < pesos[j - 1]; j--) {
				float tmp = pesos[j];
				pesos[j] = pesos[j - 1];
				pesos[j - 1] = tmp;
			}
		System.out.print("Os pesos em ordem crescente são: ");
		for (i = 0; i < 2; i++)
			System.out.print(pesos[i] + ", ");
		System.out.println(pesos[i]);
	}
}
