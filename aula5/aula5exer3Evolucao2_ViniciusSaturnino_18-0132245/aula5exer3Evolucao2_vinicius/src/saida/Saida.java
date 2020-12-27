package saida;

import java.text.DecimalFormat;

import dados.Habitantes;
import servicos.Servicos;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}

	public static void centralizaDados(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.print("\t");
	}

	public static void mostraDados(Habitantes habitantes) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		limpaTela(30);
		centralizaDados(15);
		System.out.println("Menor idade cadastrada: \t" + Servicos.menorIdade(habitantes));
		centralizaDados(15);
		System.out.println("Maior salario cadastrado: \tR$ " + mascara.format(Servicos.maiorSalario(habitantes)));
		centralizaDados(15);
		System.out.println("Media do numero de filhos: \t" + mascara.format(Servicos.mediaFilhos(habitantes)));
		centralizaDados(15);
		System.out.println("Media total dos salarios: \tR$ " + mascara.format(Servicos.mediaSalariosGeral(habitantes)));
		centralizaDados(15);
		System.out.println("Media total dos salarios entre os homens que ganham mais de R$ 300,00: \t"
				+ ((Servicos.mediaSalariosHomens(habitantes)) == 0 ? "Não foram cadastrados homens"
						: "R$ " + mascara.format(Servicos.mediaSalariosHomens(habitantes))));
		centralizaDados(15);
		System.out.println("Quantidade de pessoas que ganham mais que a media geral: \t"
				+ Servicos.qtdPessoasSalarioAlto(habitantes));
		limpaTela(15);
	}
}
