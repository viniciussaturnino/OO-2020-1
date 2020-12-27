package leitura;

import java.util.Scanner;

public class Leitura {
	public static int getInt() {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}

	public static float getFloat() {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		return ler.nextFloat();
	}

	public static String getString() {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		return ler.nextLine();
	}
}
