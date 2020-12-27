package saida;

import java.util.Collections;
import java.util.List;

import dados.Cidade;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void mostraDados(List<Cidade> listaCidades) {
		limpaTela(50);
		Collections.sort(listaCidades);
		String formato = "%-20s%-30s\n";
		System.out.format(formato, "DDD", "CIDADE");
		System.out.println("---------------------------------");
		for (Cidade cidade : listaCidades)
			System.out.println(cidade);
	}
}
