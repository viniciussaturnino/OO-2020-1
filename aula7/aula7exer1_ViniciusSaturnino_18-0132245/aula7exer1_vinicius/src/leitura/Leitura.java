package leitura;

import java.util.Scanner;

public class Leitura {

	public static String getString() {
		Scanner ler = new Scanner(System.in);
		return ler.nextLine();
	}

	public static int getInt() {
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}

	public static char getValidacao() {
		Scanner ler = new Scanner(System.in);
		char validacao;
		System.out.print("Deseja continuar? [S/n]: ");
		validacao = ler.next().toUpperCase().charAt(0);
		ler.nextLine();
		return validacao;
	}
}
