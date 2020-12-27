package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;
import saida.Saida;

public class Validacao {

	// VALIDACAO DO NOME
	public static String[] validaNome() {
		String nome = null;
		char c;
		int espacos = 0;
		try {
			do {
				System.out.print("Digite o nome: ");
				nome = Leitura.getString();
				if (nome.length() < 1)
					System.out.println("Nome não pode ser vazio, tente novamente.");
			} while (nome.length() < 1);
		} catch (InputMismatchException excecao) {
			System.out.println("Ocorreu um erro.");
		}
		for (int i = 0; i < nome.length(); i++) {
			c = nome.charAt(i);
			if (c == ' ')
				espacos++;
		}
		String vetor[] = new String[espacos + 1];
		vetor = nome.split(" ");
		return vetor;
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
		else if (operacao == 'N') {
			Saida.limpaTela(40);
			for (int i = 0; i < 9; i++)
				System.out.print("\t");
			System.out.println("Programa finalizado!");
			Saida.limpaTela(15);
		}
		return ((operacao == 'S') ? true : false);
	}
}
