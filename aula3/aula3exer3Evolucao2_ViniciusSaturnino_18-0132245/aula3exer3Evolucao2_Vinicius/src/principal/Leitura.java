package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitura {
	public static Scanner ler = new Scanner(System.in);

	public static String getNome() {
		String nome = null;
		try {
			do {
				System.out.print("Digite o nome a ser cadastrado: ");
				nome = ler.nextLine();
			} while (Validacao.validaNome(nome) == false);
		} catch (InputMismatchException excecao) {
			System.out.println(excecao);
		}
		return nome;
	}

	public static int getIdade() {
		int idade = 0;
		try {
			do {
				System.out.print("Digite a idade a ser cadastrada: ");
				idade = ler.nextInt();
			} while (Validacao.validaIdade(idade) == false);
		} catch (InputMismatchException excecao) {
			System.out.println(excecao);
		}
		return idade;
	}

	public static float getAltura() {
		float altura = 0F;
		try {
			do {
				System.out.print("Digite a altura a ser cadastrada: ");
				altura = ler.nextFloat();
			} while (Validacao.validaAltura(altura) == false);
		} catch (InputMismatchException excecao) {
			System.out.println(excecao);
		}
		return altura;
	}

	public static char getValidacao() {
		char validacao;
		System.out.print("Deseja continuar [S/n]: ");
		validacao = ler.next().toUpperCase().charAt(0);
		ler.nextLine();
		return validacao;
	}
}
