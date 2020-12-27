package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;
import saida.Saida;

public class Validacao {

	public static int validaOpcao() {
		int opcao = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				System.out.print("Opcao: ");
				opcao = Leitura.getInt();
				if (opcao < 0 || opcao > 3) {
					erro = true;
					System.out.println("Opcao invalida, digite somente as opcoes indicadas.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Opcao invalida, opcao deve ser um numero inteiro.");
			}
		} while (erro);
		return opcao;
	}

	public static int validaIdadeAmamentacao() {
		int idade = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				System.out.print("Digite a idade de amamentacao do animal: ");
				idade = Leitura.getInt();
				if (idade < 0) {
					erro = true;
					System.out.println("Idade invalida, digite um valor maior ou igual a zero.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Digite um valor inteiro.");
			}
		} while (erro);
		return idade;
	}

	public static int validaIdadeVida() {
		int idade = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				System.out.print("Digite a idade de vida do animal: ");
				idade = Leitura.getInt();
				if (idade < 0) {
					erro = true;
					System.out.println("Idade invalida, digite um valor maior ou igual a zero.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Digite um valor inteiro.");
			}
		} while (erro);
		return idade;
	}

	public static float validaTamanhoAdulto() {
		float tamanho = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				System.out.print("Digite o tamanho do animal em sua fase adulta: ");
				tamanho = Leitura.getFloat();
				if (tamanho < 0) {
					erro = true;
					System.out.println("Tamanho invalida, digite um valor maior ou igual a zero.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Digite um valor real.");
			}
		} while (erro);
		return tamanho;
	}

	public static String validaDescricaoEspecie() {
		String descricao = "";
		do {
			System.out.print("Digite a descricao da especie: ");
			descricao = Leitura.getString();
			if (descricao.isEmpty() || descricao.equals(null))
				System.out.println("Descricao nao pode ser vazia.");
		} while (descricao.isEmpty() || descricao.equals(null));
		return descricao;
	}

	public static String validaPorte() {
		int opcao = 0;
		Boolean erro = false;
		String porte = "";
		Saida.limpaTela(3);
		Saida.opcoesPorte();
		Saida.limpaTela(2);
		do {
			erro = false;
			opcao = validaOpcao();
			switch (opcao) {
			case 1:
				porte = "Pequeno";
				break;
			case 2:
				porte = "Medio";
				break;
			case 3:
				porte = "Grande";
				break;
			case 0:
				erro = true;
				System.out.println("Digite apenas as opcoes indicadas.");
				break;
			}
		} while (erro);
		return porte;
	}

	public static float validaPeso() {
		float peso = 0;
		Boolean erro;
		do {
			try {
				erro = false;
				System.out.print("Digite o peso do animal: ");
				peso = Leitura.getFloat();
				if (peso <= 0)
					System.out.println("Peso invalido, digite um valor positivo");
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Digite um valor real.");
			}
		} while (erro);
		return peso;
	}

	public static String validaDescricaoHabitat() {
		String descricao = "";
		do {
			System.out.print("Digite a descricao do habitat do elefante: ");
			descricao = Leitura.getString();
			if (descricao.isEmpty() || descricao.equals(null))
				System.out.println("Descricao nao pode ser vazia.");
		} while (descricao.isEmpty() || descricao.equals(null));
		return descricao;
	}

}
