package principal;

import validacao.Validacao;
import saida.Saida;

public class Principal {
	public static void main(String[] args) {
		do {
			String nome[] = Validacao.validaNome();
			StringBuilder primeiroNome = new StringBuilder();
			StringBuilder ultimoNome = new StringBuilder();
			primeiroNome = primeiroNome.append(nome[0]);
			ultimoNome = ultimoNome.append(nome[nome.length - 1]);

			Saida.concatenaNome(primeiroNome, ultimoNome);

		} while (Validacao.validaContinua());
	}
}
