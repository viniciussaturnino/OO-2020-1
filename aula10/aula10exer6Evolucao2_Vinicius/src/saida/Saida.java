package saida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import dados.ColecaoTimes;
import dados.Time;

public class Saida {

	public static int menuTitulos() {
		String[] botoes = { "Cadastrar ano de titulo", "Sair" };
		int opcao = -1;
		boolean erro = false;
		do {
			try {
				erro = false;
				opcao = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Menu", 0,
						JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes[0]);
				if (opcao == -1)
					JOptionPane.showMessageDialog(null, "Escolha uma das opçoes", " ", JOptionPane.ERROR_MESSAGE);
			} catch (ArrayIndexOutOfBoundsException exc) {
				JOptionPane.showMessageDialog(null, "Escolha uma das opçoes", " ", JOptionPane.ERROR_MESSAGE);
				erro = true;
			}
		} while (erro || opcao == -1);
		return opcao;
	}

	public static int menuDados() {
		String[] botoes = { "Ordem Alfabetica", "Ordem de insercao", "Sair" };
		int opcao = -1;
		boolean erro = false;
		do {
			try {
				erro = false;
				opcao = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Menu", 0,
						JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes[0]);
				if (opcao == -1)
					JOptionPane.showMessageDialog(null, "Escolha uma das opçoes", " ", JOptionPane.ERROR_MESSAGE);
			} catch (ArrayIndexOutOfBoundsException exc) {
				JOptionPane.showMessageDialog(null, "Escolha uma das opçoes", " ", JOptionPane.ERROR_MESSAGE);
				erro = true;
			}
		} while (erro || opcao == -1);
		return opcao;
	}

	public static void mostraDados(ColecaoTimes times, int opcao) {
		limpaTela(50);
		List<Time> listaTmp = new ArrayList<Time>();
		listaTmp = times.getTimes();
		String formato = "%-30s%-20s\n";
		System.out.format(formato, "TIME", "TITULOS");
		System.out.println("=================================================");
		if (opcao == 0)
			Collections.sort(listaTmp, times);
		else if (opcao == 1) {
			Collections.sort(listaTmp, times);
			Collections.reverse(listaTmp);
		}
		for (Time time : listaTmp) {
			Collections.sort(time.getAnosTitulo());
			Collections.reverse(time.getAnosTitulo());
			System.out.println(time);
		}
		limpaTela(5);
		System.out.println("QUANTIDADE DE TIMES CADASTRADOS: " + times.getTimes().size());
	}

	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

}
