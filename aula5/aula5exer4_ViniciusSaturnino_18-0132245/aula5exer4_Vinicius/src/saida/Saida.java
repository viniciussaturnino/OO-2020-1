package saida;

import java.util.Vector;

import dados.Pessoa;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}

	public static void centralizaDados(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.print("\t");
	}

	public static void menuOpcoes() {
		centralizaDados(15);
		System.out.println("OPÇÕES DE APRESENTAÇÃO:");
		centralizaDados(15);
		System.out.println("1 - Sequencia de inserção:");
		centralizaDados(15);
		System.out.println("2 - Sequencia reversa de inserção:");
		centralizaDados(15);
		System.out.println("0 - Encerrar sem mostrar dados:");
		limpaTela(15);
		System.out.print("Opção: ");
	}

	public static void finalizaOperacao(Vector<Pessoa> lista) {
		limpaTela(30);
		centralizaDados(15);
		System.out.println("Programa Finalizado!");
		centralizaDados(15);
		System.out.println(lista.size() + " nomes foram cadastrados");
		limpaTela(15);
	}

	public static void mostraSequencia(Vector<Pessoa> lista) {
		limpaTela(30);
		centralizaDados(15);
		System.out.println("Nome");
		limpaTela(1);
		for (int i = 0; i < lista.size(); i++) {
			Pessoa pessoa = lista.get(i);
			centralizaDados(15);
			System.out.println(pessoa.getNome());
		}
		limpaTela(15);
	}

	public static void mostraSequenciaReversa(Vector<Pessoa> lista) {
		limpaTela(30);
		centralizaDados(15);
		System.out.println("Nome");
		limpaTela(1);
		for (int i = lista.size() - 1; i >= 0; i--) {
			Pessoa pessoa = lista.get(i);
			centralizaDados(15);
			System.out.println(pessoa.getNome());
		}
		limpaTela(15);
	}
}
