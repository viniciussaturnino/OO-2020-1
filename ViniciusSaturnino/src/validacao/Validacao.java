package validacao;

import java.util.ArrayList;
import java.util.InputMismatchException;

import dados.Homem;
import dados.Mulher;
import dados.Pessoa;
import leitura.Leitura;
import saida.Saida;

public class Validacao {
	public static Pessoa validaPessoa(ArrayList<Pessoa> grupo, int codigo) {
		String sexo = validaSexo();
		if (sexo.equals("M"))
			return new Homem(validaNome(), validaSituacao(), codigo, validaIdade());
		else
			return new Mulher(validaNome(), validaSituacao(), codigo, validaSituacaoGestante());
	}

	private static String validaSituacaoGestante() {
		String situacaoGestante = "";
		do {
			Saida.menuGestante();
			situacaoGestante = Leitura.getString().toUpperCase();
			if (!validaPadrao(situacaoGestante, "SNT"))
				System.out.println("Digite apenas as opcoes indicadas.");
		} while (!validaPadrao(situacaoGestante, "SNT"));
		switch (situacaoGestante) {
		case "S":
			situacaoGestante = "SIM";
			break;
		case "N":
			situacaoGestante = "NAO";
			break;
		case "T":
			situacaoGestante = "NAO TEM CERTEZA";
		}
		return situacaoGestante;
	}

	private static Integer validaIdade() {
		Integer idade = 0;
		Boolean erro = false;
		do {
			erro = false;
			try {
				System.out.print("Digite a idade do homem: ");
				idade = Leitura.getInt();
				if (idade < 0 || idade > 150) {
					erro = true;
					System.out.println("Insira um valor entre 0 e 150.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Insira um valor inteiro.");
			}
		} while (erro);
		return idade;
	}

	private static String validaSexo() {
		String sexo;
		Boolean erro = false;
		do {
			System.out.print("Digite o sexo da pessoa [M/F]: ");
			sexo = Leitura.getString().toUpperCase();
			if (sexo.equals("M") || sexo.equals("F"))
				return sexo;
			else {
				erro = true;
				System.out.println("Digite apenas um caractere. [M/F]");
			}
		} while (erro);
		return sexo;
	}

	public static StringBuilder validaNome() {
		StringBuilder nome = new StringBuilder();
		do {
			System.out.print("Digite o nome: ");
			nome.append(Leitura.getString().toUpperCase());
			if (nome.length() <= 2)
				System.out.println("Nome devera ter no minimo 3 caracteres.");
		} while (nome.length() <= 2);
		return nome;
	}

	public static String validaSituacao() {
		String situacao = "";
		do {
			Saida.menuSituacao();
			situacao = Leitura.getString().toUpperCase();
			if (!validaPadrao(situacao, "TFCS"))
				System.out.println("Insira apenas as opcoes indicadas.");
		} while (!validaPadrao(situacao, "TFCS"));
		switch (situacao) {
		case "T":
			situacao = "CONTAMINADO(A) EM TRATAMENTO";
			break;
		case "F":
			situacao = "CONTAMINADO(A) FALECIDO(A)";
			break;
		case "C":
			situacao = "CONTAMINADO(A) CURADO(A)";
			break;
		case "S":
			situacao = "SEM CONTAMINACAO";
		}
		return situacao;
	}

	private static boolean validaPadrao(String situacao, String padrao) {
		if (padrao.contains(situacao))
			return true;
		return false;
	}

	public static int validaOpcao() {
		int opcao = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				opcao = Leitura.getInt();
				if (opcao < 0 || opcao > 2) {
					erro = true;
					System.out.println("Digite apenas as opcoes indicadas");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Digite um numero inteiro.");
			}
		} while (erro);
		return opcao;
	}

	public static boolean validaContinua() {
		char operacao;
		do {
			Saida.limpaTela(40);
			System.out.print("Deseja continuar cadastrando? [S/n]: ");
			operacao = Leitura.getValidacao();
			System.out.println(operacao);
			if (operacao != 'S' && operacao != 'N')
				System.out.println("Operação invalida, tente novamente!");
		} while (operacao != 'S' && operacao != 'N');
		return ((operacao == 'S') ? true : false);
	}
}
