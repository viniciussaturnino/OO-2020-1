package saida;

import java.util.Vector;

import dados.Pintor;
import dados.Quadro;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void mostraMenu() {
		System.out.println("\t\tOPCOES");
		System.out.println("-------------------------------------------");
		System.out.println("1 - Cadastrar novo quadro");
		System.out.println("2 - Cadastrar novo pintor");
		System.out.println("3 - Listar quadros de um pintor");
		System.out.println("4 - Listar todos os quadros");
		System.out.println("0 - Encerrar programa");
	}

	public static void mostraQuadrosPintores(Vector<Quadro> quadros, Vector<Pintor> pintores, String nome) {
		int idPintor = 0;
		for (int i = 0; i < pintores.size(); i++) {
			if (pintores.get(i).getNome().equalsIgnoreCase(nome))
				idPintor = pintores.get(i).getIdPintor();
		}
		System.out.println("ID Quadro\t\t|\tID Pintor\t\t|\tPreco\t\t|\tAno");
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < quadros.size(); i++) {
			if (quadros.get(i).getIdPintor() == idPintor) {
				System.out.println(quadros.get(i).getIdQuadro() + "\t\t\t\t|\t" + quadros.get(i).getIdPintor()
						+ "\t\t\t\t|\t" + quadros.get(i).getPreco() + "\t\t|\t" + quadros.get(i).getAno());
			}
		}
	}

	public static void mostraQuadros(Vector<Quadro> quadros) {
		if (quadros.size() == 0)
			System.out.println("Não existem quadros cadastrados.");
		else {
			System.out.println("ID Quadro\t\t|\tID Pintor\t\t|\tPreco\t\t|\tAno");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------");
			for (int i = 0; i < quadros.size(); i++) {
				System.out.println(quadros.get(i).getIdQuadro() + "\t\t\t\t|\t" + quadros.get(i).getIdPintor()
						+ "\t\t\t\t|\t" + quadros.get(i).getPreco() + "\t\t|\t" + quadros.get(i).getAno());
			}
		}
	}

	public static void finalizaPrograma() {
		System.out.println("============ PROGRAMA FINALIZADO ============");
	}

}
