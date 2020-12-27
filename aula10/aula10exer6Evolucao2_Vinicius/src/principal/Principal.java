package principal;

import dados.*;
import saida.Saida;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		ColecaoTimes times = new ColecaoTimes();
		int opcao = -1;
		cadastraTime(times);
		do {
			switch (opcao) {
			case 0:
				cadastraTime(times);
				break;
			case 1:
				opcao = Saida.menuDados();
				Saida.mostraDados(times, opcao);
			}
			opcao = Validacao.validaOpcao();
		} while (opcao != 2);
	}

	// ============== METODO DE CADASTRO DE TIME ==============
	private static void cadastraTime(ColecaoTimes times) {
		Time time = new Time(Validacao.validaNome());
		int opcao = -1;
		do {
			opcao = Saida.menuTitulos();
			if (opcao == 0) {
				int ano = Validacao.validaAno();
				if (ano != 0)
					time.setAnoTitulo(ano);
				else
					opcao = 0;
			}
		} while (opcao == 0);
		times.setTime(time);
	}

}
