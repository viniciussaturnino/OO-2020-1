package leitura;

import java.util.Scanner;

public class Leitura {
	@SuppressWarnings("resource")
	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}

	@SuppressWarnings("resource")
	public static String getString() {
		return new Scanner(System.in).nextLine().trim();
	}

	@SuppressWarnings("resource")
	public static char getValidacao() {
		return new Scanner(System.in).next().toUpperCase().trim().charAt(0);
	}
}
