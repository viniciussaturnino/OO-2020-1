package saida;

import java.util.ArrayList;

import dados.Baleia;
import dados.Elefante;
import dados.Macaco;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void mostraMenu() {
		System.out.println("OPCOES");
		System.out.println("---------------------------");
		System.out.println("(1) - Cadastrar Macaco");
		System.out.println("(2) - Cadastrar Elefante");
		System.out.println("(3) - Cadastrar Baleia");
		System.out.println("(0) - Encerrar Programa");
	}

	public static void opcoesPorte() {
		System.out.println("Qual o porte do macaco?");
		System.out.println("---------------------------");
		System.out.println("(1) - Pequeno");
		System.out.println("(2) - Medio");
		System.out.println("(3) - Grande");
	}

	public static void mostraDados(ArrayList<Macaco> macacos, ArrayList<Elefante> elefantes,
			ArrayList<Baleia> baleias) {
		if (macacos.size() > 0) {
			System.out.println("\t\t\t\t\t\t\t\t\t--------- TABELA DE MACACOS ---------");
			limpaTela(1);
			System.out.println(
					"Idade de amamentacao\t\t\t|\tTempo de vida\t\t\t|\tDescricao da especie\t\t\t|\tTamanho adulto\t\t\t|\tPorte");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			mostraMacacos(macacos);
		}
		if (elefantes.size() > 0) {
			limpaTela(3);
			System.out.println("\t\t\t\t\t\t\t\t\t--------- TABELA DE ELEFANTES ---------");
			limpaTela(1);
			System.out.println(
					"Idade de amamentacao\t\t\t|\tTempo de vida\t\t\t|\tDescricao da especie\t\t\t|\tTamanho adulto\t\t\t|\tPeso\t\t\t|\tDescricao do habitat");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			mostraElefantes(elefantes);
		}
		if (baleias.size() > 0) {
			limpaTela(3);
			System.out.println("\t\t\t\t\t\t\t\t\t--------- TABELA DE BALEIAS ---------");
			limpaTela(1);
			System.out.println(
					"Idade de amamentacao\t\t\t|\tTempo de vida\t\t\t|\tDescricao da especie\t\t\t|\tTamanho adulto\t\t\t|\tPeso");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			mostraBaleias(baleias);
		}
		limpaTela(3);
		System.out.println("TOTAL DE MAMIFEROS CADASTRADOS: " + (macacos.size() + elefantes.size() + baleias.size()));
	}

	public static void mostraMacacos(ArrayList<Macaco> macacos) {
		for (Macaco macaco : macacos)
			System.out.println(macaco.toString());
	}

	private static void mostraElefantes(ArrayList<Elefante> elefantes) {
		for (Elefante elefante : elefantes)
			System.out.println(elefante.toString());
	}

	private static void mostraBaleias(ArrayList<Baleia> baleias) {
		for (Baleia baleia : baleias)
			System.out.println(baleia.toString());
	}
}
