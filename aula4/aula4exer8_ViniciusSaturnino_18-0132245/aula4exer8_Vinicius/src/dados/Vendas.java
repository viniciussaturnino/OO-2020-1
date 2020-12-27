package dados;

import validacao.Validacao;

public class Vendas {
	// Atributos
	private int[][] vendas;
	private int semanas;
	
	public Vendas(int semanas) {
		int [][]vendas = new int[4][semanas];
		this.setVendas(vendas);
		this.semanas = semanas;
	}

	public int getVendas(int i, int j) {
		return this.vendas[i][j];
	}

	public void setVendas(int[][] vendas) {
		this.vendas = vendas;
	}
	
	public void insereDados() {
		for (int i=0; i<4; i++)
			for (int j=0; j<this.semanas; j++) {
				this.vendas[i][j] = Validacao.validaQuantidadeVendas(j);
		}
	}
}
