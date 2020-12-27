package principal;

import dados.*;
import saida.Saida;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		ColecaoTimes times = new ColecaoTimes();
		int opcao = -1;
		do {
			Time time = new Time(Validacao.validaNome());
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
			Saida.mostraDados(time);
			opcao = Validacao.validaOpcao();
		} while (opcao != -1);
		Saida.mostraQtdTimes(times);
	}

}
