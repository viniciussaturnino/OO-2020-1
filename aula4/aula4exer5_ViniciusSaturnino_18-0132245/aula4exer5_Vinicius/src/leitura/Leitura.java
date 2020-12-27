package leitura;

import java.util.Scanner;

public class Leitura {
	static Scanner ler = new Scanner(System.in);

	public static String getString() {
		System.out.print("Digite o nome a ser cadastrado: ");
		return ler.nextLine().toUpperCase().trim();
	}

	public static char getValidacao() {
		char validacao;
		System.out.print("Deseja continuar cadastrando? [S/n]: ");
		validacao = ler.next().toUpperCase().charAt(0);
		ler.nextLine();
		return validacao;
	}
}
