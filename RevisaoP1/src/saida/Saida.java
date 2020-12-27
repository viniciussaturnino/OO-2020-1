package saida;

import java.util.Vector;

import dados.Doacao;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void mostraMenu() {
		System.out.println("Escolha uma opcao");
		System.out.println("----------------------------");
		System.out.println("(1) - Cadastrar nova doacao");
		System.out.println("(2) - Mostrar doacoes");
		System.out.println("(3) - Buscar doacao");
		System.out.println("(0) - Encerrar programa");
	}

	public static void finalizaPrograma() {
		System.out.println("------------- PROGRAMA FINALIZADO -------------");
	}

	public static void mostraDoacoes(Vector<Doacao> doacoes) {
		if (doacoes.size() != 0) {
			System.out.println("Item\t\t\t|\tCodigo");
			System.out.println("-------------------------------------------------------------");
			for (Doacao doacao : doacoes) {
				System.out.println(doacao.getNomeItem() + "\t\t\t|\t" + doacao.getCodigo());
			}
		} else
			System.out.println("Voce deve ter ao menos um cadastro.");
	}

	public static void mostraErro() {
		System.out.println("Voce deve ter pelo menos um cadastro.");
	}

	public static void mostraResultadoBusca(Vector<Doacao> doacoes, int i) {
		if (i == -1)
			System.out.println("Nenhum resultado encontrado.");
		else {
			System.out.println("Item\t\t\t|\tCodigo");
			System.out.println("-------------------------------------------------------------");
			System.out.println(doacoes.get(i).getNomeItem() + "\t\t\t|\t" + doacoes.get(i).getCodigo());
		}
	}
}
