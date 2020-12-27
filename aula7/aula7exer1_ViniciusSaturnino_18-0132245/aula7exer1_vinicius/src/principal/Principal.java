package principal;

import dados.Dados;
import dados.Tabela;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		Tabela tabela = new Tabela();
		do {
			Dados dados = new Dados(Validacao.validaAno(), Validacao.validaEvento(), Validacao.validaPresidente());
			tabela.setDados(dados);
		} while (Validacao.validaContinua());
		Saida.limpaTela(30);
		Saida.mostraDados(tabela);
	}
}
