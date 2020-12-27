package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;
import saida.Saida;

public class Validacao {
	private static final int ANO = 1900;
	private static final int ATUAL = 2020;

	public static String validaPresidente() {
		String nome = null;
		do {
			System.out.print("Digite o nome do presidente no ano informado anteriormente: ");
			nome = Leitura.getString();
			if (nome.isEmpty() && nome != null)
				System.out.println("Nome nao pode ser vazio.");
		} while (nome.isEmpty() && nome != null);
		return nome;
	}

	public static String validaEvento() {
		String evento = null;
		do {
			System.out.print("Digite o nome do evento a ser cadastrado: ");
			evento = Leitura.getString();
			if (evento.isEmpty() && evento != null)
				System.out.println("Evento nao pode ser vazio.");
		} while (evento.isEmpty() && evento != null);
		return evento;
	}

	public static int validaAno() {
		int ano = 0;
		try {
			do {
				System.out.print("Digite o ano a ser cadastrado: ");
				ano = Leitura.getInt();
				if (ano < ANO || ano > ATUAL)
					System.out.println("Ano deverá ser maior que 1900 e menor que " + ATUAL);
			} while (ano < ANO || ano > ATUAL);
		} catch (InputMismatchException e) {
			System.out.println("Houve um erro. Tipo de dado deve ser inteiro.");
		}
		return ano;
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
