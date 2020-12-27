package leitura;

import java.util.Scanner;

public class Leitura {
	public static Scanner ler = new Scanner(System.in);

	public static String getString() {
		System.out.print("Digite o nome a ser cadastrado: ");
		return ler.nextLine();
	}

	public static int getInt() {
		System.out.print("Digite a idade a ser cadastrada: ");
		return ler.nextInt();
	}

	public static float getFloat() {
		System.out.print("Digite a altura a ser cadastrada: ");
		return ler.nextFloat();
	}

	public static char getValidacao() {
		char validacao;
		System.out.print("Deseja continuar [S/n]: ");
		validacao = ler.next().toUpperCase().charAt(0);
		ler.nextLine();
		return validacao;
	}
}
