package principal;

import dados.Vendas;
import saida.Saida;
import servicos.Servicos;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		// Declaracoes
		int semanas;
		semanas = Validacao.validaSemanas();
		Vendas vendas = new Vendas(semanas);
		
		// Instrucoes
		vendas.insereDados();
		Saida.limpaTela(30);
		Servicos.totalVendasVendedor(vendas, semanas);
		Servicos.totalVendasSemanal(vendas, semanas);
		Servicos.totalVendas(vendas, semanas);
		Saida.limpaTela(12);
	}

}
