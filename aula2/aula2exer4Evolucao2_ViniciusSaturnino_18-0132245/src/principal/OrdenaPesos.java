package principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class OrdenaPesos {
	public static void main(String[] args) {
		// Declaracoes
		DecimalFormat mascara = new DecimalFormat("0.00");
		float[] pesos = new float[3];
		pesos = validaPeso();

		for (int i = 1; i < 3; i++)
			for (int j = i; j > 0 && pesos[j] < pesos[j - 1]; j--) {
				float tmp = pesos[j];
				pesos[j] = pesos[j - 1];
				pesos[j - 1] = tmp;
			}

		// Instrucoes
		limpaTela();
		System.out.print("O peso dos elefantes em ordem crescente é: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(mascara.format(pesos[i]) + " ");
		}
	}

	public static float[] validaPeso() {
		Scanner ler = new Scanner(System.in);
		float[] pesoE = new float[3];
		float peso;
		int i;
		for (i = 0; i < 3; i++) {
			System.out.print("Escreva o peso do " + (i + 1) + "º elefante: ");
			peso = lerPeso();
			while (peso < 5) {
				System.out.print("Peso inválido por favor, insira um peso válido:");
				peso = lerPeso();
			}
			pesoE[i] = peso;
		}
		return pesoE;
	}

	public static float lerPeso() {
		Scanner ler = new Scanner(System.in);
		float peso;

		peso = ler.nextFloat();

		return peso;
	}

	public static void limpaTela() {
		for (int i = 0; i < 30; i++)
			System.out.println();
	}

}
