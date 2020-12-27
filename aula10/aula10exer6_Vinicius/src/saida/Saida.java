package saida;

import java.util.Collections;

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

	public static void mostraDados(Time time) {
		limpaTela(50);
		if (time.getAnosTitulo().size() == 0)
			System.out.println("Ainda nao foi campeao brasileiro");
		else {
			Collections.sort(time.getAnosTitulo());
			System.out.println("======== TITULOS DO " + time.getNome() + " ========");
			for (int ano : time.getAnosTitulo())
				System.out.println(ano);
		}
	}

	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void mostraQtdTimes(ColecaoTimes times) {
		limpaTela(50);
		System.out.println("QUANTIDADE DE TIMES CADASTRADOS: " + times.getTimes().size());
	}

}
