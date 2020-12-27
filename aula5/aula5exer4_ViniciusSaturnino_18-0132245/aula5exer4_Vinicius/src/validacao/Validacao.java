package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;
import saida.Saida;

public class Validacao {
	public static String validaNome() {
		String nome = null;
		try {
			do {
				System.out.print("Digite o nome a ser cadastrado: ");
				nome = Leitura.getString();
				if (nome.isEmpty())
					System.out.println("Nome nao pode ser vazio.");
			} while (nome.isEmpty());
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um problema.");
		}
		return nome;
	}

	public static int validaOpcao() {
		int opcao = 0;
		try {
			do {
				Saida.menuOpcoes();
				opcao = Leitura.getInt();
				if (opcao != 0 && opcao != 1 && opcao != 2)
					System.out.println("Digite apenas as opcoes mostradas.");
			} while (opcao != 0 && opcao != 1 && opcao != 2);
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um problema.");
		}
		return opcao;
	}

	public static boolean validaContinua() {
		char operacao;
		do {
			operacao = Leitura.getValidacao();
			if (operacao != 'S' && operacao != 'N')
				System.out.println("Operação invalida, tente novamente!");
		} while (operacao != 'S' && operacao != 'N');
		if (operacao == 'S')
			Saida.limpaTela(15);
		return ((operacao == 'S') ? true : false);
	}
}
