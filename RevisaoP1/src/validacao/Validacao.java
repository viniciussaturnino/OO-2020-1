package validacao;

import java.util.InputMismatchException;
import java.util.Vector;

import dados.Doacao;
import leitura.Leitura;

public class Validacao {

	public static StringBuilder validaNomeAsilo() {
		final int MINIMO = 2;
		StringBuilder nome = new StringBuilder();
		do {
			System.out.print("Digite o nome do Asilo a ser cadastrado: ");
			nome.append(Leitura.getString());
			if (nome == null || nome.length() < MINIMO)
				System.out.println("Nome invalido, digite um nome com mais de 2 caracteres");
		} while (nome == null && nome.length() < MINIMO);
		return nome;
	}

	public static Integer validaCodigo(Vector<Doacao> doacoes) {
		final int MAIOR = 10;
		Integer codigo = 0;
		Boolean erro = false;
		int codigos[] = new int[doacoes.size()];
		for (int aux = 0; aux < doacoes.size(); aux++)
			codigos[aux] = doacoes.get(aux).getCodigo();
		do {
			try {
				erro = false;
				System.out.print("Digite o codigo do item: ");
				codigo = Leitura.getInt();
				if (codigo <= MAIOR) {
					erro = true;
					System.out.println("Digite um valor maior que 10");
				}
				for (int aux = 0; aux < doacoes.size(); aux++) {
					if (codigo.equals(codigos[aux])) {
						erro = true;
						System.out.println("Codigo ja existente");
					}
				}
			} catch (InputMismatchException e) {
				erro = true;
				System.out.println("Digite um valor inteiro.");
			}
		} while (erro);
		return codigo;
	}

	public static String validaNomeItem() {
		final int MINIMO = 2;
		String nome = "";
		do {
			System.out.print("Digite o item a ser cadastrada: ");
			nome = Leitura.getString();
			if (nome.length() < MINIMO)
				System.out.println("Nome invalido, digite um nome com mais de 2 caracteres");
		} while (nome.length() < MINIMO);
		return nome;
	}

}
