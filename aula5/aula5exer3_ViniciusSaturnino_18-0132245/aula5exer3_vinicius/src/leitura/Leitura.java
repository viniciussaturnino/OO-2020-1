package leitura;

import java.util.Scanner;

public class Leitura {
	static Scanner ler = new Scanner(System.in);

	public static float getFloat() {
		return ler.nextFloat();
	}

	public static int getInt() {
		return ler.nextInt();
	}

	public static char getChar() {
		char sexo;
		sexo = ler.next().toUpperCase().charAt(0);
		return sexo;
	}

	public static char getValidacao() {
		char validacao;
		System.out.print("Deseja continuar cadastrando? [S/n]: ");
		validacao = ler.next().toUpperCase().charAt(0);
		ler.nextLine();
		return validacao;
	}
}
