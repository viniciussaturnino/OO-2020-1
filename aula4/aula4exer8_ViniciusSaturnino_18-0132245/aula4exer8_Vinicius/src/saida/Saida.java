package saida;

public class Saida {
	public static void mostraTotalVendedores(int total, int vendedor) {
		for(int i=0; i<8; i++)
			System.out.print("\t");
		System.out.println("Total de vendas do vendedor " + vendedor + ": " + total);
	}
	
	public static void mostraTotalSemanal(int total, int semana) {
		for(int i=0; i<8; i++)
			System.out.print("\t");
		System.out.println("Total de vendas na semana " + semana + ": " + total);
	}
	
	public static void mostraTotalGeral(int total) {
		for(int i=0; i<8; i++)
			System.out.print("\t");
		System.out.println("TOTAL DE VENDAS: " + total);
	}
	
	public static void limpaTela(int qtd) {
		for(int i=0; i<qtd; i++)
			System.out.println();
	}
}
