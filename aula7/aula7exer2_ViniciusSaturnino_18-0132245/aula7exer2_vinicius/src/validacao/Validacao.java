package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;

public class Validacao {
	private static final Integer ANOMINIMO = 1000;
	private static final Integer ANOATUAL = 2020;

	public static int validaIdPintor() {
		int id = 1;
		try {
			do {
				System.out.print("Digite o ID do pintor: ");
				id = Leitura.getInt();
				if (id < 1)
					System.out.println("ID invalido, digite um numero maior ou igual a 1");
			} while (id < 1);
		} catch (InputMismatchException e) {
			System.out.println("Houve um erro. O ID deve ser um inteiro");
		}
		return id;
	}

	public static int validaAno() {
		int ano = 0;
		try {
			do {
				System.out.print("Digite o ano: ");
				ano = Leitura.getInt();
				if (ano < ANOMINIMO || ano > ANOATUAL)
					System.out.println("Ano invalido, digite um ano entre " + ANOMINIMO + " e " + ANOATUAL);
			} while (ano < ANOMINIMO || ano > ANOATUAL);
		} catch (InputMismatchException e) {
			System.out.println("Houve um erro. O ID deve ser um inteiro");
		}
		return ano;
	}

	public static String validaNome() {
		String nome = null;
		do {
			System.out.print("Digite o nome do pintor: ");
			nome = Leitura.getString();
			if (nome.isEmpty())
				System.out.println("Nome nao pode ser vazio");
		} while (nome.isEmpty());
		return nome;
	}

	public static float validaPreco() {
		float preco = 0;
		try {
			do {
				System.out.print("Digite o preco: ");
				preco = Leitura.getFloat();
				if (preco < 0)
					System.out.println("Preco invalido, digite um numero maior ou igual a 0");
			} while (preco < 0);
		} catch (InputMismatchException e) {
			System.out.println("Houve um erro. O preco deve ser um valor real");
		}
		return preco;
	}

	public static int validaOpcao() {
		int opcao = 0;
		opcao = Leitura.getInt();
		return opcao;
	}
}
