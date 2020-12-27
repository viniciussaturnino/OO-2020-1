package leitura;

import java.util.Scanner;

public class Leitura {
	static Scanner ler = new Scanner(System.in);

	public static String getString() {
		return ler.nextLine();
	}

	public static int getInt() {
		return ler.nextInt();
	}

	public static float getFloat() {
		return ler.nextFloat();
	}

	public static char getValidacao() {
		char validacao;
		System.out.print("Deseja continuar? [S/n]: ");
		validacao = ler.next().toUpperCase().charAt(0);
		ler.nextLine();
		return validacao;
	}
}
