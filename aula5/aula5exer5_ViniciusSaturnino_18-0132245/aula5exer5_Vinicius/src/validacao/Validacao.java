package validacao;

import java.util.InputMismatchException;
import java.util.Vector;

import dados.Aluno;
import leitura.Leitura;
import saida.Saida;
import servicos.Servicos;

public class Validacao {
	private static final int MAX = 1000;

	public static String validaNome() {
		String nome = null;
		try {
			do {
				System.out.print("Digite o nome a ser cadastrado: ");
				nome = Leitura.getString();
				if (nome.isEmpty())
					System.out.println("Nome não pode ser vazio");
			} while (nome.isEmpty());
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um problema");
		}
		return nome;
	}

	public static int validaMatricula(Vector<Aluno> alunos) {
		int matricula = 0;
		boolean busca = false;
		try {
			do {
				System.out.print("Digite a matricula do aluno: ");
				matricula = Leitura.getInt();
				busca = Servicos.buscaAluno(matricula, alunos);
				if (matricula <= MAX)
					System.out.println("A matricula deverá ser maior que 1000, tente novamente.");
				if (busca)
					System.out.println("Aluno ja existente.");
			} while (matricula <= MAX || busca);
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um problema");
		}
		return matricula;
	}

	public static float validaMedia() {
		float media = 0;
		try {
			do {
				System.out.print("Digite a media do aluno: ");
				media = Leitura.getFloat();
				if (media < 0 || media > 10)
					System.out.println("A media so pode estar entre 0 e 10, tente novamente.");
			} while (media < 0 || media > 10);
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um problema");
		}
		return media;
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
