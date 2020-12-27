package principal;

import java.util.Scanner;

public class AnalisaFrase {
	public static void main(String[] args) {
		String frase = new String();
		Scanner ler = new Scanner(System.in);
		int continua = 1;
		int a, e, i, o, u, vogais;
		while (continua == 1) {
			frase = lerFrase(ler);
			a = contaVogais(frase)[0];
			e = contaVogais(frase)[1];
			i = contaVogais(frase)[2];
			o = contaVogais(frase)[3];
			u = contaVogais(frase)[4];

			vogais = somaVogais(frase);

			limpaTela(30);

			System.out.println("Numero de letras A: " + a);
			System.out.println("Numero de letras E: " + e);
			System.out.println("Numero de letras I: " + i);
			System.out.println("Numero de letras O: " + o);
			System.out.println("Numero de letras U: " + u);
			System.out.println("TOTAL DE VOGAIS: " + vogais);
			continua = confirmaContinuacao(ler);
		}
	}

	private static int somaVogais(String frase) {
		int vogais = 0;
		char c;
		for (int i = 0; i < frase.length(); i++) {
			c = frase.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vogais++;
		}
		return vogais;
	}

	private static int[] contaVogais(String frase) {
		int vogais[] = new int[5];
		for (int i = 0; i < 5; i++) {
			vogais[i] = 0;
		}
		char c;
		for (int count = 0; count < frase.length(); count++) {
			c = frase.charAt(count);
			if (c == 'a')
				vogais[0]++;
			else if (c == 'e')
				vogais[1]++;
			else if (c == 'i')
				vogais[2]++;
			else if (c == 'o')
				vogais[3]++;
			else if (c == 'u')
				vogais[4]++;
		}
		return vogais;
	}

	private static int confirmaContinuacao(Scanner ler) {
		int continua;
		System.out.print("Deseja continuar? Digite 1 para 'SIM' e 0 para 'NAO': ");
		continua = ler.nextInt();
		ler.nextLine();
		return continua;
	}

	private static void limpaTela(int linhas) {
		for (int count = 0; count < linhas; count++)
			System.out.println();
	}

	private static String lerFrase(Scanner ler) {
		String frase = new String();
		System.out.print("Digite uma frase: ");
		frase = ler.nextLine().toLowerCase();
		return frase;
	}
}