package validacao;

import java.util.ArrayList;
import java.util.InputMismatchException;

import dados.FuncionarioRegular;
import leitura.Leitura;

public class Validacao {
	public static String validaNome() {
		String nome = "";
		do {
			System.out.print("Digite o nome a ser cadastrado: ");
			nome = Leitura.getString();
			if (nome.isEmpty() || nome.equals(null))
				System.out.println("Nome nao pode ser vazio");
		} while (nome.isEmpty() || nome.equals(null));
		return nome;
	}

	public static String validaCpf(ArrayList<FuncionarioRegular> empresa) {
		String cpf;
		Boolean erro = false;
		do {
			erro = false;
			System.out.print("Digite o CPF: ");
			cpf = Leitura.getString();
			if (cpf.length() != 11 || !verificaDigitos(cpf)) {
				erro = true;
				System.out.println("CPF invalido, digite um CPF com 11 digitos.");
			}
			int contador = 0;
			while (contador < empresa.size()) {
				if (empresa.get(contador++).getCpf().equals(cpf)) {
					System.err.println("CPF ja existente.");
					erro = true;
					break;
				}
			}
		} while (erro);
		return cpf;
	}

	public static boolean verificaDigitos(String palavra) {
		for (char c : palavra.toCharArray())
			if (!('0' <= c && c <= '9'))
				return false;
		return true;
	}

	public static boolean validaData(int numero, final int MIN, final int MAX) {
		return ((numero >= MIN && numero <= MAX) ? true : false);
	}

	public static boolean validaDia(int dia, int mes, int ano) {
		if (mes == 2) {
			if (dia > 0 && dia <= 28)
				return true;
			else if (dia == 29) {
				if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0))
					return true;
			}
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 0 && dia <= 31)
				return true;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia > 0 && dia <= 30)
				return true;
		}
		return false;
	}

	public static StringBuilder getData() {
		int dia, mes, ano;

		ano = getAno();
		mes = getMes();
		dia = getDia(mes, ano);
		return (new StringBuilder().append(dia + "/" + mes + "/" + ano));
	}

	public static int getDia(int mes, int ano) {
		int dia;
		do {
			try {
				System.out.print("Digite o dia de nascimento: ");
				dia = Leitura.getInt();
				if (!Validacao.validaDia(dia, mes, ano))
					System.out.println("Dia invalido.");
			} catch (NumberFormatException e) {
				System.out.println("Digite um numero inteiro");
				dia = 0;
			} catch (NullPointerException e) {
				System.out.println("Dia nao pode ser vazio");
				dia = 0;
			}
		} while (!validaDia(dia, mes, ano));
		return dia;
	}

	public static int getMes() {
		final int MAX = 12, MIN = 1;
		int mes;
		do {
			try {
				System.out.print("Digite o mes de nascimento: ");
				mes = Leitura.getInt();
				if (!validaData(mes, MIN, MAX))
					System.out.println("Mes invalido.");
			} catch (NumberFormatException e) {
				System.out.println("Digite um inteiro.");
				mes = MIN - 1;
			} catch (NullPointerException e) {
				System.out.println("Mes nao pode ser vazio");
				mes = MIN - 1;
			}
		} while (!validaData(mes, MIN, MAX));
		return mes;
	}

	public static int getAno() {
		final int ANOMAX = 2002, MIN = 1950;
		int ano;

		do {
			try {
				System.out.print("Digite o ano de nascimento: ");
				ano = Leitura.getInt();
				if (!validaData(ano, MIN, ANOMAX))
					System.out.println("Ano Invalido. Cadastre pessoas nascidas entre 1950 e 2002.");
			} catch (NumberFormatException e) {
				System.out.println("Digite um inteiro.");
				ano = MIN - 1;
			} catch (NullPointerException e) {
				System.out.println("Ano nao pode ser vazio.");
				ano = MIN - 1;
			}
		} while (!validaData(ano, MIN, ANOMAX));
		return ano;
	}

	public static Integer validaHorasTrabalhadas() {
		Integer horas = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				System.out.print("Digite as horas trabalhadas: ");
				horas = Leitura.getInt();
				if (horas <= 0) {
					erro = true;
					System.out.println("Valor invalido, digite um valor positivo e nao nulo.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Tipo de dado invalido, digite um valor inteiro.");
			}
		} while (erro);
		return horas;
	}

	public static Integer validaQtdProjetos() {
		Integer qtdProjetos = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				System.out.print("Digite a quantidade de projetos: ");
				qtdProjetos = Leitura.getInt();
				if (qtdProjetos < 0) {
					erro = true;
					System.out.println("Valor invalido, digite um valor nao negativo.");
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Tipo de dado invalido, digite um valor inteiro.");
			}
		} while (erro);
		return qtdProjetos;
	}

	public static int validaOpcao(int max) {
		int opcao = 0;
		Boolean erro = false;
		do {
			try {
				erro = false;
				opcao = Leitura.getInt();
				if (opcao < 0 || opcao > max) {
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
}
