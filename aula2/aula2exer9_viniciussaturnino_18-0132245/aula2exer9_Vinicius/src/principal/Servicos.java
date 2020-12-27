package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Servicos {
	public int leIdade(Scanner ler, int i, int j) {
		int idade = 0;
		System.out.print("Digite a idade do " + (j + 1) + " º atleta do time " + (i + 1) + ": ");
		do {
			idade = ler.nextInt();
			if (idade < 0)
				System.out.println("Idade inválida, digite uma idade não negativa");
		} while (idade < 0);
		return idade;
	}

	public float leAltura(Scanner ler, int i, int j) {
		float altura = 0F;
		System.out.print("Digite a altura do " + (j + 1) + "º atleta do time " + (i + 1) + ": ");
		do {
			altura = ler.nextFloat();
			if (altura < 0)
				System.out.println("Altura inválida, digite uma altura não negativa");
		} while (altura < 0);
		return altura;
	}

	public void mediaIdades(Time[] time, int TIMES, int MAXIMO, DecimalFormat mascara) {
		float media = 0F;
		for (int i = 0; i < TIMES; i++) {
			media = 0;
			for (int j = 0; j < MAXIMO; j++)
				media += time[i].idade[j];
			System.out.println("Media das idades do time " + (i + 1) + ": " + mascara.format(media / MAXIMO));
		}
	}

//	public void imprimeTime(Time[] time, int MAXIMO) {
//		for(int i=0; i<MAXIMO; i++) {
//			System.out.println("Idade do " + (i+1) + "º atleta: " + time.idade[i]);
//			System.out.println("Altura do " + (i+1) + "º atleta: " + time.altura[i]);
//		}
//	}

	public void maiorIdade(Time time[], int TIMES, int MAXIMO) {
		int total = 0;
		for (int i = 0; i < TIMES; i++)
			for (int j = 0; j < MAXIMO; j++)
				if (time[i].idade[j] > 15)
					total++;
		System.out.println("Total de atletas com mais de 15 anos: " + total);
	}

	public void menorAltura(Time time[], int TIMES, int MAXIMO, DecimalFormat mascara) {
		int total = 0;
		float porcentagem = 0F;
		for (int i = 0; i < TIMES; i++)
			for (int j = 0; j < MAXIMO; j++)
				if (time[i].altura[j] < 1.5)
					total++;
		porcentagem = (float) total / (MAXIMO * TIMES);
		System.out.println(
				"Porcentagem de atletas com menos de 1,50m de altura: " + mascara.format(porcentagem * 100) + "%");
	}

	public void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}
}
