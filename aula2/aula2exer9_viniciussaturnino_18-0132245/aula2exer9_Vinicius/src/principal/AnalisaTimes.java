package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AnalisaTimes {

	public static void main(String[] args) {
		// Declarações
		final int TIMES = 5;
		Scanner ler = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.00");
		Servicos servico = new Servicos();
		Time time[] = new Time[TIMES];

		// Instruções
		for (int i = 0; i < TIMES; i++) {
			time[i] = new Time();
			for (int j = 0; j < time[i].MAXIMO; j++) {
				time[i].idade[j] = servico.leIdade(ler, i, j);
				time[i].altura[j] = servico.leAltura(ler, i, j);
				System.out.println();
			}
		}

		servico.limpaTela(30);
		servico.mediaIdades(time, TIMES, time[0].MAXIMO, mascara);
		servico.maiorIdade(time, TIMES, time[0].MAXIMO);
		servico.menorAltura(time, TIMES, time[0].MAXIMO, mascara);
	}

}
