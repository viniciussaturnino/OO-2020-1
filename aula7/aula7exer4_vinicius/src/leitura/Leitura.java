package leitura;

import java.util.Scanner;

import validacao.Validacao;

public class Leitura {
	public static float getFloat() {
		return new Scanner(System.in).nextFloat();
	}

	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}

	public static String getString() {
		return new Scanner(System.in).nextLine().trim();
	}

}
