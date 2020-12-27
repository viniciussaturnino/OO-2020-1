package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;
import saida.Saida;

public class Validacao {
	public static float validaSalario() {
		float salario = 0;
		try {
			do {
				System.out.print("Digite o salario: ");
				salario = Leitura.getFloat();
				if (salario < 0)
					System.out.println("Salario invalido, digite um valor não negativo.");
			} while (salario < 0);
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um erro.");
		}
		return salario;
	}

	public static int validaIdade() {
		int idade = 0;
		try {
			do {
				System.out.print("Digite a idade: ");
				idade = Leitura.getInt();
				if (idade < 0 || idade > 155)
					System.out.println("Idade invalido, digite um valor entre 0 e 155.");
			} while (idade < 0 || idade > 155);
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um erro.");
		}
		return idade;
	}

	public static int validaFilhos() {
		int filhos = 0;
		try {
			do {
				System.out.print("Digite a quantidade de filhos: ");
				filhos = Leitura.getInt();
				if (filhos < 0)
					System.out.println("Numero de filhos deverá ser positivo.");
			} while (filhos < 0);
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um erro.");
		}
		return filhos;
	}

	public static char validaSexo() {
		char sexo = 0;
		try {
			do {
				System.out.print("Digite o sexo: ");
				sexo = Leitura.getChar();
				if (sexo != 'M' && sexo != 'F')
					System.out.println("Sexo invalido. Digite 'M' ou 'F'");
			} while (sexo != 'M' && sexo != 'F');
		} catch (InputMismatchException excecao) {
			System.out.println("Houve um erro.");
		}
		return sexo;
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
