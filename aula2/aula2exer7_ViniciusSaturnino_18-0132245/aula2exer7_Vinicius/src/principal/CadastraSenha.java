package principal;

import java.util.Scanner;

public class CadastraSenha {
	public static void main(String[] args) throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		final int MAXIMO = 9;
		String senha;
		senha = cadastraSenha(ler);
		tentaAcesso(senha, MAXIMO, ler);
	}

	// Método para limpeza do console
	public static void limpaTela(int limpar) {
		for (int i = 0; i < limpar; i++)
			System.out.println();
	}

	// Método de cadastramento de senha
	public static String cadastraSenha(Scanner ler) {
		String senha;
		do {
			System.out.print("Cadastre sua senha: ");
			senha = ler.next().trim();
			if (senha.length() < 3 || senha.length() > 5)
				System.out.println(
						"A senha deve ter no minimo 3 caracteres, no maximo, 5 caracteres e não pode ter espaços");
		} while (senha.length() < 3 || senha.length() > 5);
		System.out.println("SENHA CADASTRADA COM SUCESSO !!");
		limpaTela(4);
		return senha;
	}

	// Método de tentativa de acesso com a senha cadastrada
	public static void tentaAcesso(String senha, int MAXIMO, Scanner ler) throws InterruptedException {
		String tentativa;
		int contador = 0;
		System.out.print("Digite a senha de acesso (minimo 3 caracteres e máximo 5 caracteres sem espaços): ");
		while (contador < MAXIMO) {
			tentativa = ler.next().trim();
			contador++;
			limpaTela(20);
			if (senha.equals(tentativa)) {
				for (int aux = 0; aux < 7; aux++)
					System.out.print("\t");
				System.out.println("PARABENS, VOCÊ CONSEGUIU ACESSO !!");
				limpaTela(2);
				contador = MAXIMO + 1;
			} else if (contador == MAXIMO) {
				for (int aux = 0; aux < 7; aux++)
					System.out.print("\t");
				System.out.println("O COMPUTADOR IRÁ SE AUTODESTRUIR EM 10 SEGUNDOS");
				limpaTela(2);
				Thread.sleep(10000);
			} else
				System.out.print("Senha incorreta, tente novamente: ");
		}
	}
}