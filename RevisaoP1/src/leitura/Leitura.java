package leitura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitura {
	@SuppressWarnings("resource")
	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int getOpcao() {
		int opcao = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				opcao = getInt();
				if (opcao < 0 || opcao > 3) {
					erro = true;
					System.out.println("Digite apenas as opcoes indicadas.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Digite um valor inteiro.");
			}
		} while (erro);
		return opcao;
	}

	@SuppressWarnings("resource")
	public static String getString() {
		return new Scanner(System.in).nextLine().trim();
	}

}
