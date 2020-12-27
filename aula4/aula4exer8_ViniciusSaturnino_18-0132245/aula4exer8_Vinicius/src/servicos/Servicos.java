package servicos;

import dados.Vendas;
import saida.Saida;

public class Servicos {
	public static void totalVendas(Vendas vendas, int semanas) {
		int total = 0;
		for(int i=0; i<4; i++)
			for(int j=0; j<semanas; j++) {
				total += vendas.getVendas(i, j);
			}
		Saida.mostraTotalGeral(total);
	}
	
	public static void totalVendasSemanal(Vendas vendas, int semanas) {
		int total = 0;
		for(int i=0; i<semanas; i++) {
			total = 0;
			for(int j=0; j<4; j++) 
				total += vendas.getVendas(j, i);
			Saida.mostraTotalSemanal(total, i+1);
		}
	}
	
	public static void totalVendasVendedor(Vendas vendas, int semanas) {
		int total = 0;
		for(int i=0; i<4; i++) {
			total = 0;
			for(int j=0; j<semanas; j++) 
				total += vendas.getVendas(i, j);
			Saida.mostraTotalVendedores(total, i+1);
		}
	}
}
