package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;
import saida.Saida;

public class Validacao {
	public static String validaNome() {
		String nome = null;
		try {
			do {
				nome = Leitura.getString();
				if (nome.length() < 3)
					System.out.println("Nome inválido (deverá ter mais do que 3 caracteres).");
			} while (nome.length() < 3);
		} catch (InputMismatchException excecao) {
			System.out.println("Ocorreu um erro !!");
		}
		return nome;
	}

	public static int validaIdade() {
		int idade = 0;
		try {
			do {
				idade = Leitura.getInt();
				if (idade < 0 || idade > 151)
					System.out.println("Idade inválida (digite uma idade entre 0 e 151 anos).");
			} while (idade < 0 || idade > 151);
		} catch (InputMismatchException excecao) {
			System.out.println("Ocorreu um erro !!");
		}
		return idade;
	}

	public static float validaAltura() {
		float altura = 0;
		try {
			do {
				altura = Leitura.getFloat();
				if (altura < 0.4 || altura > 2.6)
					System.out.println("Altura inválida (digite uma altura entre 0,4m e 2,6m).");
			} while (altura < 0.4 || altura > 2.6);
		} catch (InputMismatchException excecao) {
			System.out.println("Ocorreu um erro !!");
		}
		return altura;
	}

	public static boolean validaContinua() {
		char operacao;
		do {
			operacao = Leitura.getValidacao();
			if (operacao != 'S' && operacao != 'N')
				System.out.println("Operação invalida, tente novamente!");
		} while (operacao != 'S' && operacao != 'N');
		if (operacao == 'S')
			Saida.limpaTela(40);
		return ((operacao == 'S') ? true : false);
	}
}
