package saida;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++) {
			System.out.println();
		}
	}
	
	public static void concatenaNome(StringBuilder nome, StringBuilder sobrenome) {
		limpaTela(25);
		for(int i=0; i<15; i++)
			System.out.print("\t");
		sobrenome.append('/');
		System.out.print(sobrenome);
		System.out.println(nome);
		limpaTela(15);
	}
}
